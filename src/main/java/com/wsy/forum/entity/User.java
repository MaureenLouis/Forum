package com.wsy.forum.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	
	private int id;
	private String username;
	private String password;
	private String salt;
	private String email;
	private int type;
	private int status;
	private String activetionCode;
	private String headerUrl;
	private Date createTime;
	
}