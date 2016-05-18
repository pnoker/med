package com.sooware.med.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.dao.CaseRecordMapper;
import com.sooware.med.model.CaseRecord;
import com.sooware.med.service.CaseRecordService;

@Service("caseRecordService")
public class CaseRecordServiceImpl implements CaseRecordService {

	@Autowired
	private CaseRecordMapper caseRecordMapper;

	@Override
	public CaseRecord selectByUserId(String userId) {
		return caseRecordMapper.selectByUsrId(userId);
	}

	@Override
	public CaseRecord selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return caseRecordMapper.selectByPrimaryKey(id);
	}

}
