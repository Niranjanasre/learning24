package com.niranjana.util;

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	
	private static  HikariDataSource ds =null;

	
	public static Connection getConnection() throws IOException, Exception {
		if (ds==null) {
		FileInputStream fis = new FileInputStream(new File("C:\\ashokitjava\\BookProject\\src\\main\\java\\DB.properties"));
		Properties p = new Properties();
		p.load(fis);
		
		String url =p.getProperty("db.url");
		String uname=p.getProperty("db.uname");
		String pwd =p.getProperty("db.pwd");
		String driver =p.getProperty("db.driver");
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(uname);
		config.setPassword(pwd);
		config.setDriverClassName(driver);
		
		 ds = new HikariDataSource(config);
		}
		
		return ds.getConnection();
	
	
}}
