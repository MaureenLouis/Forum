package com.wsy.forum.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsy.forum.entity.DiscussPost;
import com.wsy.forum.entity.Page;
import com.wsy.forum.entity.User;
import com.wsy.forum.service.DiscussPostService;
import com.wsy.forum.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private DiscussPostService discussPostService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String getIndexPage(Model model, Page page) {
		
		int postRows = discussPostService.findDiscussPostRows(0);
		page.setRows(postRows);
		page.setPath("/index");
		
			
		List<Map<String, Object>> discussPosts = new ArrayList<>();
		List<DiscussPost> postList = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
		
		if (postList != null) {
			for (DiscussPost post : postList) {
				
				int postOwnerId = post.getUserId();
				User postOwner = userService.findUserById(postOwnerId);
				
				Map<String, Object> map = new HashMap<>();
				map.put("post", post);
				map.put("user", postOwner);
				
				discussPosts.add(map);
			}
		}
		
		model.addAttribute("discussPosts", discussPosts);
		return "/index";
		
	}
	
}
