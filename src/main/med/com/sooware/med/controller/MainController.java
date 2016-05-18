package com.sooware.med.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.model.CaseRecord;
import com.sooware.med.model.MpBody;
import com.sooware.med.model.Reserve;
import com.sooware.med.model.User;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;
import com.sooware.med.auth.AuthPassport;
import com.sooware.med.service.ArticleService;
import com.sooware.med.service.CaseRecordService;
import com.sooware.med.service.MpBodyService;
import com.sooware.med.service.MpUserService;
import com.sooware.med.service.ReserveService;
import com.sooware.med.service.ReserveSetService;
import com.sooware.med.service.UserService;

@Controller
@RequestMapping("/main")
public class MainController extends BaseController {
	static final Logger logger = LogManager.getLogger(HomeController.class);
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CaseRecordService caseRecordService;
	@Autowired
	private MpBodyService mpBodyService;
	@Autowired
	private MpUserService mpUserService;
	@Autowired
	private ReserveService reserveService;
	@Autowired
	private UserService userService;
	@Autowired
	private ReserveSetService reserveSetService;


	@AuthPassport
	@RequestMapping("/kznews")
	public String kznews(HttpServletRequest request,ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> magazine = articleService.getByMagazine(articleInfo);
		List<BizQuery> meeting = articleService.getByMeeting(articleInfo);
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("magazine", magazine);
		modelMap.addAttribute("meeting", meeting);
		modelMap.addAttribute("article", article);
		return "/main/kznews";
	}
	
	@AuthPassport
	@RequestMapping("/mypatient")
	public String mypatient(HttpServletRequest request,ModelMap modelMap) {
		Calendar cal = Calendar.getInstance();
		Integer week = cal.get(Calendar.DAY_OF_WEEK)-1;/*星期是从周日开始的，且周日是1*/
		List<User> patient = userService.selectByAppId(week);
		Reserve reserveInfo = new Reserve();
		Integer count = reserveService.countByAll(reserveInfo);
		modelMap.addAttribute("patient", patient);
		modelMap.addAttribute("count", count);
		return "/main/mypatient";
	}
	
	@AuthPassport
	@ResponseBody
	@RequestMapping("/countByAll")
	public Integer countByAll(HttpServletRequest request,ModelMap modelMap) {
		Reserve reserveInfo = new Reserve();
		Integer count = reserveService.countByAll(reserveInfo);
		return count;
	}

	@AuthPassport
	@RequestMapping("/myservice")
	public String myservice(HttpServletRequest request,ModelMap modelMap) throws IOException {
		String serverPath = request.getSession().getServletContext().getRealPath("/images/");/*服务器上的images的真实位置*/
	/*
		
		URL url = new URL("http://img.hexun.com/2011-06-21/130726386.jpg");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5 * 1000);
		InputStream is = conn.getInputStream();读取数据
		byte[] bs = new byte[1024];
		int len;
		String dirname = "/logo";创建一个放logo的文件
		String filename = "TestPic.jpg";
		File dircontent = new File(serverPath + dirname);文件夹的位置
		File file = new File(dircontent,filename);
		if(!dircontent.exists()) {
			dircontent.mkdirs();
			if(!file.exists()) {
				file.createNewFile();
				OutputStream os = new FileOutputStream(file);输出数据
				while ((len = is.read(bs)) != -1) {
					os.write(bs, 0, len);
				}
			}
		}
		
		
		
		*/
		
		List<User> patient = userService.selectByAppId(7);
		Integer countOfReserve = reserveSetService.countByWeek(7);
		modelMap.addAttribute("patient", patient);
		modelMap.addAttribute("count", countOfReserve);
		return "/main/myservice";
	}

	@AuthPassport
	@RequestMapping("/myself")
	public String myself(ModelMap modelMap) {
		String appId = "wx09e64c648cb48d16";
		MpBody doctor = mpBodyService.selectByPrimaryKey(appId);
		modelMap.addAttribute("doctor", doctor);
		return "/main/myself";
	}
}