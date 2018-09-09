package com.ZTI2018.ZTI_SimpleToDo.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ZTI2018.ZTI_SimpleToDo")
@EntityScan(basePackages = "com.ZTI2018.ZTI_SimpleToDo")
public class DataConfiguration { 
	
}