package com.sooware.med.service;

import java.util.List;

import com.sooware.med.bean.BizQuery;
import com.sooware.med.model.CaseRecord;

public interface CaseRecordService {

	CaseRecord selectByUserId(String userId);

	CaseRecord selectByPrimaryKey(Integer id);

}
