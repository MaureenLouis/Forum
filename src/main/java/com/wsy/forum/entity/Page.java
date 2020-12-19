package com.wsy.forum.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * 
 * @author wsy
 *
 */
@ToString
@Getter
@EqualsAndHashCode
public class Page {
	
	// constants
	static final int DEFAULT_CURRENT_PAGE = 1;
	
	static final int DEFAULT_MIN_POSTS = 1;
	
	static final int DEFAULT_MAX_POSTS = 100;
	
	// Current page. 1 is default. It should not be less than 1.
	private int current = 1;
	
	// Limit of pages. 10 pages is the upmost.
	private int limit = 10;

	// Total records
	private int rows;
	
	// Link
	private String path;
	
	/**
	 * Get the start page.
	 */
	public int getFrom() {
		int from = current - 2;
		return from < 1 ? 1 : from;
	}
	
	/**
	 * Get the end page.
	 */
	public int getTo() {
		int to = current + 2;
		int total = getTotal();
		return to > total ? total : to; 
	}
	
	/**
	 * Calculate offset.
	 * @return
	 */
	public int getOffset() {
		return (current - 1) * limit;
	}
	
	/**
	 * Get total count of pages.
	 * @return
	 */
	public int getTotal() {
		if (rows % limit == 0) return rows / limit;
		else return rows / limit + 1;
	}
	
	public void setCurrent(int current) {
		if (current >= DEFAULT_CURRENT_PAGE) this.current = current;
	}

	public void setLimit(int limit) {
		if (limit >= DEFAULT_MIN_POSTS && limit <= DEFAULT_MAX_POSTS) this.limit = limit;
		
	}

	public void setRows(int rows) {
		if (rows >= 0) this.rows = rows;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
}
