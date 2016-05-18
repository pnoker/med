package com.sooware.med.service;

import java.util.List;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.model.Article;

public interface ArticleService {

	List<BizQuery> getByMagazine(BizQuery record);

	List<BizQuery> getByMeeting(BizQuery record);

	List<BizQuery> getByArticle(BizQuery record);

	BizQuery getByMagazineId(String id);

	BizQuery getByArticleId(String id);

	int insertByArticle(String title, String summary, String logo, String content);

}
