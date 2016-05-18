package com.sooware.med.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooware.med.dao.UserMapper;
import com.sooware.med.model.User;
import com.sooware.med.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectByAppId(Integer week) {
		// TODO Auto-generated method stub
		return userMapper.selectByAppId(week);
	}

	@Override
	public User selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public User selectByUserId(String userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserId(userId);
	}

}
