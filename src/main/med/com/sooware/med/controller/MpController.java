package com.sooware.med.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooware.med.handler.MpLogHandler;
import com.sooware.med.handler.MpTextHandler;

import me.chanjar.weixin.common.util.StringUtils;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;

@Controller
@RequestMapping("/mp")
public class MpController {

	static final Logger logger = LogManager.getLogger(MpController.class);

	@RequestMapping("/{id}")
	@ResponseBody
	public void mp(HttpServletRequest request, HttpServletResponse response, @PathVariable String id)
			throws IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);

		String signature = request.getParameter("signature");
		String nonce = request.getParameter("nonce");
		String timestamp = request.getParameter("timestamp");

		WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();

		// // 设置微信公众号的appid 陈正全测试号
		// wxMpConfigStorage.setAppId("wxbb43ea35c0c192a2");
		// // 设置微信公众号的appSecret
		// wxMpConfigStorage.setSecret("d4624c36b6795d1d99dcf0547af5443d");
		// // 设置微信公众号的token
		// wxMpConfigStorage.setToken("168155462c1f4848a1b2ceae2aac0ef5");
		// // 设置微信公众号的EncodingAESKey
		// wxMpConfigStorage.setAesKey("houW3MM2L9hHQtaS0Wta3EOi7Sv4uT2KjxpGvoJXLfN");

		// // 设置微信公众号的appid 陈正全
		// wxMpConfigStorage.setAppId("wx8fc27d35102c6d24");
		// // 设置微信公众号的appSecret
		// wxMpConfigStorage.setSecret("45e8c9bb8bb03713b62b65161c4c9508");
		// // 设置微信公众号的token
		// wxMpConfigStorage.setToken("168155462c1f4848a1b2ceae2aac0ef5");
		// // 设置微信公众号的EncodingAESKey
		// wxMpConfigStorage.setAesKey("houW3MM2L9hHQtaS0Wta3EOi7Sv4uT2KjxpGvoJXLfN");

		// 设置微信公众号的appid 康众医生
		wxMpConfigStorage.setAppId("wxd8b1a926887393a1");
		// 设置微信公众号的appSecret
		wxMpConfigStorage.setSecret("b8a172b0b1f540e4b09fa1b549294693");
		// 设置微信公众号的token
		wxMpConfigStorage.setToken("168155462c1f4848a1b2ceae2aac0ef5");
		// 设置微信公众号的EncodingAESKey
		wxMpConfigStorage.setAesKey("houW3MM2L9hHQtaS0Wta3EOi7Sv4uT2KjxpGvoJXLfN");

		WxMpService wxMpService = new WxMpServiceImpl();
		wxMpService.setWxMpConfigStorage(wxMpConfigStorage);

		WxMpMessageHandler logHandler = new MpLogHandler();
		WxMpMessageHandler textHandler = new MpTextHandler();
		WxMpMessageRouter wxMpMessageRouter = new WxMpMessageRouter(wxMpService);
		wxMpMessageRouter.rule().handler(logHandler).next().rule().async(false).handler(textHandler).end();

		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		String echostr = request.getParameter("echostr");
		if (StringUtils.isNotBlank(echostr)) {
			// 说明是一个仅仅用来验证的请求，回显echostr
			response.getWriter().println(echostr);
			return;
		}

		String encryptType = StringUtils.isBlank(request.getParameter("encrypt_type")) ? "raw"
				: request.getParameter("encrypt_type");

		if ("raw".equals(encryptType)) {
			// 明文传输的消息
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(request.getInputStream());
			WxMpXmlOutMessage outMessage = wxMpMessageRouter.route(inMessage);
			if (outMessage != null) {
				response.getWriter().write(outMessage.toXml());
			}
			return;
		}

		if ("aes".equals(encryptType)) {
			// 是aes加密的消息
			String msgSignature = request.getParameter("msg_signature");
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(request.getInputStream(), wxMpConfigStorage,
					timestamp, nonce, msgSignature);
			WxMpXmlOutMessage outMessage = wxMpMessageRouter.route(inMessage);
			if (outMessage != null) {
				response.getWriter().write(outMessage.toEncryptedXml(wxMpConfigStorage));
			}
			return;
		}

		response.getWriter().println("不可识别的加密类型");
		return;
	}
}