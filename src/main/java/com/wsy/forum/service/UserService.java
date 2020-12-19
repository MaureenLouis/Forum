package com.wsy.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsy.forum.dao.UserMapper;
import com.wsy.forum.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User findUserById(int id) {
		return userMapper.selectById(id);
	}
	
}
