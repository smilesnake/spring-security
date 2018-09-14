package com.smilesnake.domain.mapper;

import java.util.List;

import com.smilesnake.domain.model.Permission;

public interface PermissionMapper {

	public List<Permission> findAll();

	public List<Permission> findByAdminUserId(Long userId);

	int deleteByPrimaryKey(Long id);

	int insert(Permission record);

	int insertSelective(Permission record);

	Permission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Permission record);

	int updateByPrimaryKey(Permission record);
}