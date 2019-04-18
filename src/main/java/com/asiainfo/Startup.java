package com.asiainfo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.asiainfo.service.IUserService;

/**
 * @Description: JAVA_OPTS="-Dspring.profiles.active=jx -Dspring.environment.dbtype=mysql"
 * 
 * @author       zq
 * @date         2017年3月27日  下午12:10:56
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Component
public class Startup {

	@Autowired
	private IUserService service;
	
	public static void main(String[] args) {
		
		//xml配置
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:config/application-core-configure.xml"});

		Startup startup = context.getBean(Startup.class);
		System.out.println(startup.service.getUserName("chenzq"));
		
		context.close();
	}
}
