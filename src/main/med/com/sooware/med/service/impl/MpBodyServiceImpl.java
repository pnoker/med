package com.sooware.med.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.dao.MpBodyMapper;
import com.sooware.med.model.MpBody;
import com.sooware.med.service.MpBodyService;

@Service("mpBodyService")
public class MpBodyServiceImpl implements MpBodyService {
	@Autowired
	private MpBodyMapper mpBodyMapper;
	@Override
	public BizQuery getByMpBody(BizQuery record){//查找医生信息
		return mpBodyMapper.selectDoctor(record);
	}
	@Override
	public BizQuery addByArticle(BizQuery record) {//添加文章
		return mpBodyMapper.insertByArticle(record);
	}
	@Override
	public BizQuery alterByDoctor(BizQuery record) {//修改医生个人信息
		return mpBodyMapper.updateByDoctor(record);
	}
	@Override
	public MpBody selectByPrimaryKey(String appId) {
		// TODO Auto-generated method stub
		return mpBodyMapper.selectByPrimaryKey(appId);
	}
	

}
