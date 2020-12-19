package com.wsy.forum.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wsy.forum.entity.User;


@Mapper
public interface UserMapper {
	
	User selectById(int id);
	
	User selectByName(String username);
	
	User selectByEmail(String email);

	int insertUser(User user);
	
	int updateUser(int id, int status);
	
	int updateHeader(int id, String headerUrl);
	
	int updatePassword(int id, String password);
	
}