package com.sooware.med.service;

import java.util.List;

import com.sooware.med.bean.BizQuery;

public interface MpUserService {
	List<BizQuery> getByPatient(BizQuery record);

}
