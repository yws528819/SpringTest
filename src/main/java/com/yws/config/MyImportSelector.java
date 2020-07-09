package com.yws.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector{

	//返回值就是导入到容器中的组件全类名
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		
		return new String[] {"com.yws.bean.Blue", "com.yws.bean.Yellow"};
	}

}
