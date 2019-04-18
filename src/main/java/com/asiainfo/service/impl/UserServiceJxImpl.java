package com.asiainfo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.asiainfo.dao.IUserDao;
import com.asiainfo.service.IUserService;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年3月27日  下午12:29:38
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Profile("jx")
@Service
public class UserServiceJxImpl implements IUserService {

    final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IUserDao userDao;
	
	/* 
	 * @Description: TODO
	 * @param userId
	 * @return
	 * @see com.asiainfo.service.IUserService#getUserName(java.lang.String)
	 */
	@Override
	public String getUserName(String userId) {
		
		logger.info("调用jx实现，参数为：{}", userId);
		
		return this.userDao.getUserName(userId);
	}
}
