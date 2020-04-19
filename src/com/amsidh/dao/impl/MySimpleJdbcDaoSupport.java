package com.amsidh.dao.impl;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class MySimpleJdbcDaoSupport extends SimpleJdbcDaoSupport{
	
	public int getCircleCount()
	{
		String query="SELECT COUNT(*) FROM CIRCLE";
		return this.getJdbcTemplate().queryForInt(query);
	}
  
}
