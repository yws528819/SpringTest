package com.yws.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class WindowsCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String osName = context.getEnvironment().getProperty("os.name");
		if(osName.contains("Win")) {
			return true;
		}
		return false;
	}

}
