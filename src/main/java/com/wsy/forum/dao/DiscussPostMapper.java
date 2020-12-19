package com.wsy.forum.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wsy.forum.entity.DiscussPost;

@Mapper
public interface DiscussPostMapper {
	
	/**
	 * The posts that I have published. If userId=0, given all the posts
	 * needed in the index page.
	 * @param userId The id of a user.
	 * @param offset The starting line number.
	 * @param limit The limit of a page.
	 * @return A list of posts that published by a user.
	 */
	List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
	
	/**
	 * How many posts that a user spicified has published. Userid = 0 means 
	 * that the total count of all the posts will be returned.
	 * @param userId The id of a user.
	 * @return Count of posts.
	 */
	int selectDiscussPostRows(@Param("userId") int userId);
}
