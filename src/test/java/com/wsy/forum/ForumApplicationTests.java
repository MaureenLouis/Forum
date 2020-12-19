package com.wsy.forum;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.wsy.forum.dao.UserMapper;
import com.wsy.forum.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=ForumApplication.class)
class ForumApplicationTests {
	
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectDiscussPosts() {
		userMapper.updatePassword(101, "ThisIsAPassword.");
	}
	
	
	
}
