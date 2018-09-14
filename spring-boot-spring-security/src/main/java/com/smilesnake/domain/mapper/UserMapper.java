package com.smilesnake.domain.mapper;

import com.smilesnake.domain.model.User;

public interface UserMapper {
	User findByUserName(String username);

	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}