package com.smilesnake.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.smilesnake.domain.mapper.PermissionMapper;
import com.smilesnake.domain.mapper.UserMapper;
import com.smilesnake.domain.model.Permission;
import com.smilesnake.domain.model.User;

@Service
public class CustomUserService implements UserDetailsService { // 自定义UserDetailsService 接口

	@Autowired
	UserMapper userDao;
	@Autowired
	PermissionMapper permissionDao;

	@Override
	public UserDetails loadUserByUsername(String username) {
		User user = userDao.findByUserName(username);
		if (user != null) {
			List<Permission> permissions = permissionDao.findByAdminUserId(user.getId());
			List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
			for (Permission permission : permissions) {
				if (permission != null && permission.getName() != null) {

					GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
					grantedAuthorities.add(grantedAuthority);
				}
			}
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					grantedAuthorities);
		} else {
			throw new UsernameNotFoundException("admin: " + username + " do not exist!");
		}
	}
}
