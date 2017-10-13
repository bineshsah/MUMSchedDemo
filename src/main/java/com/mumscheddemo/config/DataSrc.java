package com.mumscheddemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSrc {
	
	 @Autowired
	    private DataSource dataSource;

}
