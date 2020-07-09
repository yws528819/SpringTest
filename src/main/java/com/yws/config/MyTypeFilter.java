package com.yws.config;

import java.io.IOException;
import java.util.Set;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

	/**
	 * metadataReader： 读取到的当前正在扫描的类信息
	 * metadataReaderFactory： 可以获取到其他任何类信息的
	 * 
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//获取当前类注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取当前类资源（类的路径）
		Resource resource = metadataReader.getResource();
		
		
		/*
		 * 打印内容如下：
		 *  ---:org.springframework.stereotype.Controller
		 *  ---:org.springframework.stereotype.Repository
		 *	---:org.springframework.stereotype.Service
		 */
		
		
		String className = classMetadata.getClassName();
		
		System.out.println("->" + className);
		
		if (className.contains("er")) {
			return true;
		}
		

		
		return false;
	}

}
