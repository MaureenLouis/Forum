package com.wsy.forum.entity;

import java.util.Date;
import lombok.Data;

@Data
public class DiscussPost {
	
	private int id;
	private int userId;
	private String title;
	private String content;
	private int type;	// 普通 & 置顶
	private int status;	// 精华 & 正常 & 拉黑
	private Date createTime;
	private int commentCount;
	private double score;
	
}
