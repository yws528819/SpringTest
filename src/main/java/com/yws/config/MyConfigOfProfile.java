package com.yws.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringValueResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@ComponentScan(value = {"com.yws.bean","com.yws.dao"})
//@Profile("test")
@PropertySource("classpath:jdbc.properties")
@Configuration
public class MyConfigOfProfile implements EmbeddedValueResolverAware{

	@Value("${db.user}")
	private String user;
	
	
	private StringValueResolver valueResolver;
	
	private String driverClass;
	
	
	
	@Profile("default")
	@Bean
	public DataSource dataSourceTest(@Value("${db.pwd}") String pwd)  throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=GMT%2B8");
		return dataSource;
	}
	
	@Profile("dev")
	@Bean
	public DataSource dataSourceDev(@Value("${db.pwd}") String pwd) throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=GMT%2B8");
		return dataSource;
	}
	
	@Profile("prod")
	@Bean
	public DataSource dataSourceProd(@Value("${db.pwd}") String pwd) throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=GMT%2B8");
		return dataSource;
	}

	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.valueResolver = resolver;
		String resolveStringValue = valueResolver.resolveStringValue("${db.driverClass}");
		driverClass = resolveStringValue;
	}
	
	@Bean
	public JdbcTemplate createJdbcTemplate(DataSource dataSource) {
		JdbcTemplate j = new JdbcTemplate();
		j.setDataSource(dataSource);
		return j;
	}
	
}
