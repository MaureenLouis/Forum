package com.wsy.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsy.forum.dao.DiscussPostMapper;
import com.wsy.forum.entity.DiscussPost;

@Service
public class DiscussPostService {
	
	@Autowired
	private DiscussPostMapper discussPostMapper;
	
	public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit)  {
		return discussPostMapper.selectDiscussPosts(userId, offset, limit);
	}
	
	public int findDiscussPostRows(int userId) {
		return discussPostMapper.selectDiscussPostRows(userId);
	}
	
	
}
