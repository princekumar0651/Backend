package com.wiproworkspan.config;

import javax.sql.DataSource;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
   basePackages = "com.wiproworkspan.db1",
   entityManagerFactoryRef = "db1EntityManagerFactory",
   transactionManagerRef = "db1TransactionManager"
)
public class DB1Config {
   @Primary
   @Bean(name = "db1DataSource")
   @ConfigurationProperties(prefix = "spring.datasource.db1")
   public DataSource dataSource() {
       return DataSourceBuilder.create().build();
   }

   @Primary
   @Bean(name = "db1EntityManagerFactory")
   public LocalContainerEntityManagerFactoryBean entityManagerFactory(
           org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder builder,
           @Qualifier("db1DataSource") DataSource dataSource) {
       return builder
               .dataSource(dataSource)
               .packages("com.wiproworkspan.db1")
               .persistenceUnit("db1")
               .build();
   }

   @Primary
   @Bean(name = "db1TransactionManager")
   public PlatformTransactionManager transactionManager(
           @Qualifier("db1EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
       return new JpaTransactionManager(entityManagerFactory);
   }
}
