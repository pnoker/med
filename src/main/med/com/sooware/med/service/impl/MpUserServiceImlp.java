package com.sooware.med.service.impl;

import com.sooware.med.service.MpUserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.dao.MpUserMapper;

@Service("mpUserService")
public class MpUserServiceImlp implements MpUserService {
	@Autowired
	private MpUserMapper mpUserMapper;
	@Override
	public List<BizQuery> getByPatient(BizQuery record){
		return mpUserMapper.selectPatient(record);
	}

}
