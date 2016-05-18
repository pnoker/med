package com.sooware.med.service;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.model.MpBody;

import java.util.List;

public interface MpBodyService {

	BizQuery getByMpBody(BizQuery record);//查詢醫生信息
	BizQuery addByArticle(BizQuery record);//醫生添加自己的文章
	BizQuery alterByDoctor(BizQuery record);//醫生修改自己的個人信息
	MpBody selectByPrimaryKey(String appId);

}
