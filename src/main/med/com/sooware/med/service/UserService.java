package com.sooware.med.service;

import java.util.List;

import com.sooware.med.model.User;

public interface UserService {

	List<User> selectByAppId(Integer week);

	User selectByPrimaryKey(String userId);

	User selectByUserId(String userId);

}
