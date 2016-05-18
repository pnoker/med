package com.sooware.med.service;

import java.util.List;

import com.sooware.med.model.Reserve;

public interface ReserveSetService {

	List<Reserve> selectByWeek(Integer week);

	Integer countByWeek(Integer week);

	Integer countByAll(Reserve reserveInfo);


}
