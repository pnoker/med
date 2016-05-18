package com.sooware.med.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.dao.ReserveMapper;
import com.sooware.med.model.Reserve;
import com.sooware.med.service.ReserveService;
@Service("reserveService")
public class ReserveServiceImpl implements ReserveService {
	@Autowired
	private ReserveMapper reserveMapper;

	@Override
	public List<Reserve> selectByWeek(Integer week) {
		// TODO Auto-generated method stub
		return reserveMapper.selectByWeek(week);
	}

	@Override
	public Integer countByWeek(Integer week) {
		// TODO Auto-generated method stub
		return reserveMapper.countByWeek(week);
	}

	@Override
	public Integer countByAll(Reserve reserveInfo) {
		// TODO Auto-generated method stub
		return reserveMapper.countByAll(reserveInfo);
	}

}
