package com.asiainfo.jdbc;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OracleCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata typeMeta) {
		
		//default to oracle implement
		String dbType = context.getEnvironment().getProperty("spring.environment.dbtype");
		if (dbType == null || "".equals(dbType) || "ORACLE".equals(dbType.toUpperCase())) {
			return true;
		}
		return false;
	}
}