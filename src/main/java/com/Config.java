package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com")//context replacement
public class Config {
	
@Bean
	public InternalResourceViewResolver getView() {
		
		InternalResourceViewResolver iv = new InternalResourceViewResolver();
		iv.setPrefix("/WEB-INF/views/");
		iv.setSuffix(".jsp");
		
		return iv;
	}
@Bean
	public DataSource getData() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/mydata");
		dmds.setUsername("root");
		dmds.setPassword("Raviteja96@");
		return dmds;
	}

@Bean
public JdbcTemplate getjdbc() {
	JdbcTemplate tem = new JdbcTemplate(getData());
	return tem;
}
}
