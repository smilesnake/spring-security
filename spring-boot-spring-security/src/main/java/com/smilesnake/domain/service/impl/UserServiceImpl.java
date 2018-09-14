package com.smilesnake.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.smilesnake.domain.mapper.UserMapper;
import com.smilesnake.domain.model.User;
import com.smilesnake.domain.service.UserService;
import com.smilesnake.utils.MD5Util;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userDao;

//	public User create(User user) {
//		// 进行加密
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		user.setPassword(encoder.encode(MD5Util.encode(user.getPassword().trim())));
//		userDao.insertSelective(user);
//		return user;
//	}

}
