package com.asiainfo.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Repository;

import com.asiainfo.config.DBConfig;
import com.asiainfo.dao.IUserDao;
import com.asiainfo.jdbc.OracleCondition;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年3月27日  下午12:25:22
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Conditional(OracleCondition.class)
@Repository
public class UserDaoOracleImpl implements IUserDao {

    final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private DBConfig config;
    
	/* 
	 * @Description: TODO
	 * @param userId
	 * @return
	 * @see com.asiainfo.dao.IUserDao#getUserName(java.lang.String)
	 */
	@Override
	public String getUserName(String userId) {
	    
	    logger.info("db config:{}", config);
		return "Oracle:" + userId;
	}
}
