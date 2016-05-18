package com.sooware.med.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import com.sooware.med.auth.AuthPassport;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {
	static final Logger logger = LogManager.getLogger(HomeController.class);

	@AuthPassport
	@RequestMapping("/index")
	public String index(HttpServletRequest request, ModelMap modelMap) {
		return "/index-doctor";
	}
}