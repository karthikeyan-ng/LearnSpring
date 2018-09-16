package com.techstack.spring.validator.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author KARTHIKEYAN N
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.techstack.spring.validator" })
public class AppConfig {

	//no custom defined configuration. Let Spring initialize all it's configuration by default.
	
	

}
