package com.asiainfo.jdbc;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MysqlCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata typeMeta) {
		
		String dbType = context.getEnvironment().getProperty("spring.environment.dbtype");
		if (dbType != null && "MYSQL".equals(dbType.toUpperCase())) {
			return true;
		}
		return false;
	}
}