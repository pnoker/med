package me.chanjar.weixin.common.api;

import me.chanjar.weixin.common.exception.WxErrorException;

/**
 * WxErrorException处理器
 */
public interface WxErrorExceptionHandler {

  public void handle(WxErrorException e);

}
