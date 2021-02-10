package com.example.SmallWebApp.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration 
{
	@Value("${db.driver}")
	private String driver;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	@Value("${hibernate.dialect}")
	private String dialect;
	@Value("${hibernate.show_sql}")
	private String showSql;
	@Value("${hibernate.hbm2ddl}")
	private String hbm2ddl;
	@Value("${hibernate.package_to_scan}")
	private String packageToScan;
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(packageToScan);
		Properties pro = new Properties();
		pro.put("hibernate.dialect", dialect);
		pro.put("hibernate.show_sql", showSql);
		pro.put("hibernate.hbm2ddl", hbm2ddl);
		sessionFactory.setHibernateProperties(pro);
		return sessionFactory;
	}
	@Bean
	public TransactionManager transactionManager()
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
}
