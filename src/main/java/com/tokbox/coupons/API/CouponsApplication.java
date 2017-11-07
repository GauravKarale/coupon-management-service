package com.tokbox.coupons.API;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 
 * Author: Gaurav Karale
 * version 1.0.0
 * Info :-Spring boot starter class for Tokbox coupons service
 * */
@SpringBootApplication
@EnableJpaRepositories("com.tokbox.coupons.repository")
@EntityScan("com.tokbox.coupons.model")
@ComponentScan("com.tokbox.coupons.service")
@ComponentScan("com.tokbox.coupons.exception")
@ComponentScan("com.tokbox.coupons.controller")
@ComponentScan("com.tokbox.coupons.config")
public class CouponsApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder() 
		.sources(CouponsApplication.class)
		.run(args);
	}
}
