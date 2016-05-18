package com.sooware.med.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.model.CaseRecord;
import com.sooware.med.model.Reserve;
import com.sooware.med.model.User;
import com.sooware.med.auth.AuthPassport;
import com.sooware.med.service.ArticleService;
import com.sooware.med.service.CaseRecordService;
import com.sooware.med.service.ReserveService;
import com.sooware.med.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/content")
public class ContentController extends BaseController {
	static final Logger logger = LogManager.getLogger(ContentController.class);
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ReserveService reserveService;
	@Autowired
	private UserService userService;
	@Autowired
	private CaseRecordService caseRecordService;
	// @Autowired
	// private CaseRecordService caseRecordService;
	// @Autowired
	// private MpBodyService mpBodyService;
	// @Autowired
	// private MpUserService mpUserService;

	@AuthPassport
	@RequestMapping("/content-magazine")
	public String contentMaganize(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "id", required = false, defaultValue = "") String id) {
		// BizQuery caseRecordInfo = new BizQuery();
		// BizQuery mpBodyInfo = new BizQuery();
		// BizQuery mpUserInfo = new BizQuery();
		BizQuery magazine = articleService.getByMagazineId(id);
		// List<BizQuery> meeting = articleService.getByMeeting(articleInfo);
		BizQuery article = articleService.getByArticleId(id);
		// List<BizQuery> caseRecord =
		// caseRecordService.getByCaseRecord(caseRecordInfo);
		// BizQuery doctor = (BizQuery) mpBodyService.getByMpBody(mpBodyInfo);
		// List<BizQuery> patient = mpUserService.getByPatient(mpUserInfo);
		modelMap.addAttribute("magazine", magazine);
		// modelMap.addAttribute("meeting",meeting);
		modelMap.addAttribute("article", article);
		// modelMap.addAttribute("caseRecord",caseRecord);
		// modelMap.addAttribute("doctor",doctor);
		// modelMap.addAttribute("patient",patient);
		return "/content/content-magazine";
	}

	@AuthPassport
	@RequestMapping("/content-article")
	public String contentArticle(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "id", required = false, defaultValue = "") String id) {
		BizQuery magazine = articleService.getByMagazineId(id);
		BizQuery article = articleService.getByArticleId(id);
		modelMap.addAttribute("magazine", magazine);
		modelMap.addAttribute("article", article);
		return "/content/content-article";
	}

	@AuthPassport
	@RequestMapping("/case-history")
	public String caseHistory(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "userId", required = false, defaultValue = "") String userId,
			@RequestParam(value = "id", required = false, defaultValue = "") Integer id) {
		User user = userService.selectByUserId(userId);
		CaseRecord caseRecord = caseRecordService.selectByPrimaryKey(id);
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("caseRecord", caseRecord);
		return "/content/case-history";
	}
	@AuthPassport
	@RequestMapping("/case-history-mypatient")
	public String caseHistoryMypatient(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "userId", required = false, defaultValue = "") String userId,
			@RequestParam(value = "id", required = false, defaultValue = "") Integer id) {
		User user = userService.selectByUserId(userId);
		CaseRecord caseRecord = caseRecordService.selectByPrimaryKey(id);
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("caseRecord", caseRecord);
		return "/content/case-history-mypatient";
	}

	@AuthPassport
	@RequestMapping("/doctor-article")
	public String doctorArticle(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "id", required = false, defaultValue = "") String id) {
		BizQuery magazine = articleService.getByMagazineId(id);
		BizQuery article = articleService.getByArticleId(id);
		modelMap.addAttribute("magazine", magazine);
		modelMap.addAttribute("article", article);
		return "/content/doctor-article";
	}

	@AuthPassport
	@RequestMapping("/articles")
	public String articles(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/articles";
	}

	@AuthPassport
	@RequestMapping("/audios")
	public String audios(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/audios";
	}

	@AuthPassport
	@RequestMapping("/videos")
	public String videos(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/videos";
	}

	@AuthPassport
	@RequestMapping("/set")
	public String set(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/set";
	}

	@AuthPassport
	@RequestMapping("/tab")
	public String tab(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "week", required = false, defaultValue = "") Integer week) {
		List<User> patient = userService.selectByAppId(week);
		Integer countOfReserve = reserveService.countByWeek(week);
		modelMap.addAttribute("patient", patient);
		modelMap.addAttribute("count", countOfReserve);
		return "/content/tab";
	}

	@AuthPassport
	@ResponseBody
	@RequestMapping("/count")
	public Integer count(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "week", required = false, defaultValue = "") Integer week) {
		Integer countOfReserve = reserveService.countByWeek(week);
		// modelMap.addAttribute("count", countOfReserve);
		return countOfReserve;
	}

	@AuthPassport
	@RequestMapping("/work")
	public String work(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/work";
	}

	@AuthPassport
	@RequestMapping("/help")
	public String help(HttpServletRequest request, ModelMap modelMap) {
		BizQuery articleInfo = new BizQuery();
		List<BizQuery> article = articleService.getByArticle(articleInfo);
		modelMap.addAttribute("article", article);
		return "/content/help";
	}

	@AuthPassport
	@RequestMapping("/addArticles")
	public String addArticles(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "title", required = false, defaultValue = "") String title,
			@RequestParam(value = "summery", required = false, defaultValue = "") String summary,
			@RequestParam(value = "logo", required = false, defaultValue = "") String logo,
			@RequestParam(value = "content", required = false, defaultValue = "") String content) {
		int addArticle = articleService.insertByArticle(title, summary, logo, content);
		if (addArticle == 1) {
			return title;
		}
		return null;
	}
}