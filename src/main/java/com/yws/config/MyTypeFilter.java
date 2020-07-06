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
	 * metadataReader�� ��ȡ���ĵ�ǰ����ɨ�������Ϣ
	 * metadataReaderFactory�� ���Ի�ȡ�������κ�����Ϣ��
	 * 
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		//��ȡ��ǰ��ע����Ϣ
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//��ȡ��ǰ����ɨ����������Ϣ
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//��ȡ��ǰ����Դ�����·����
		Resource resource = metadataReader.getResource();
		
		
		/*
		 * ��ӡ�������£�
		 *  ---:org.springframework.stereotype.Controller
		 *  ---:org.springframework.stereotype.Repository
		 *	---:org.springframework.stereotype.Service
		 */
//		Set<String> types = annotationMetadata.getAnnotationTypes();
//		for(String type : types) {
//			System.out.println("---:"+type);
//		}
		
		
		String className = classMetadata.getClassName();
		
		System.out.println("->" + className);
		
		if (className.contains("er")) {
			return true;
		}
		

		
		return false;
	}

}
