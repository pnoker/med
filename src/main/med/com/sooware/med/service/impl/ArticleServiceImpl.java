package com.sooware.med.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.dao.ArticleMapper;
import com.sooware.med.model.Article;
import com.sooware.med.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public List<BizQuery> getByMagazine(BizQuery record) {
		return articleMapper.selectMagazine(record);
	}

	@Override
	public List<BizQuery> getByMeeting(BizQuery record) {
		return articleMapper.selectMeeting(record);
	}

	@Override
	public List<BizQuery> getByArticle(BizQuery record) {
		return articleMapper.selectArticle(record);
	}

	@Override
	public BizQuery getByMagazineId(String id) {
		return articleMapper.selectArticleId(id);
	}

	@Override
	public BizQuery getByArticleId(String id) {
		return articleMapper.selectArticleId(id);
	}

	@Override
	public int insertByArticle(String title, String summary, String logo, String content) {
		return articleMapper.insertByArticle(title,summary,logo,content);
	}

}
