package com.ron.config.product;


import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef =  "db2EntityManagerFactory",
		transactionManagerRef = "db2Transactionmanager",
		basePackages = "com.ron.repo.product"
		)
public class Db2Config {

	//configuration
	@Bean
	@ConfigurationProperties(prefix = "db2.datasource")
	public DataSource db2DataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	//EntityManagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(EntityManagerFactoryBuilder emfb)
	{
		HashMap<String, Object> properties = new HashMap<>();
		
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return emfb.dataSource(db2DataSource()).
				packages("com.ron.config.model.product").
				properties(properties).
				persistenceUnit("springDB").
				build();
		
	}
	
	//TransactionManagement
	@Bean
	public PlatformTransactionManager db2Transactionmanager(@Qualifier("db2EntityManagerFactory") EntityManagerFactory factory)
	{
		return new JpaTransactionManager(factory);
	}
	
	
	
}
