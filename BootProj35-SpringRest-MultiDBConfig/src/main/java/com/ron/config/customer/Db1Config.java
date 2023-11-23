package com.ron.config.customer;


import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jca.support.LocalConnectionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Primary
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef =  "db1EntityManagerFactory",
		transactionManagerRef = "db1Transactionmanager",
		basePackages = "com.ron.repo.customer"
		)
public class Db1Config {

	//configuration
	@Bean
	@ConfigurationProperties(prefix = "db1.datasource")
	@Primary
	public DataSource db1DataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	//EntityManagerFactory
	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory(EntityManagerFactoryBuilder emfb)
	{
		HashMap<String, Object> properties = new HashMap<>();
		
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return emfb.dataSource(db1DataSource()).
				packages("com.ron.config.model.customer").
				properties(properties).
				persistenceUnit("enterprisejavabatch").
				build();
		
	}
	
	//TransactionManagement
	@Bean
	@Primary
	public PlatformTransactionManager db1Transactionmanager(@Qualifier("db1EntityManagerFactory")EntityManagerFactory factory)
	{
		return new JpaTransactionManager(factory);
	}
	
	
	
}
