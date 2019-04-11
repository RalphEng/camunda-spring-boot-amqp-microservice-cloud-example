package com.camunda.demo.springboot.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class DataSourceCloudConfiguration {

    @Autowired
    public Cloud cloud;
    
//    @Bean
//    public Cloud cloud() {
//        return new CloudFactory().getCloud();
//    }

    @Bean
    public DataSource dataSource() {
        return cloud.getSingletonServiceConnector(DataSource.class, null);
    }

}
