package com.mani.customerapp;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@ComponentScan(basePackages="com.mani")
@EnableJpaRepositories("com.mani")
@EntityScan("com.mani")
@EnableSwagger2
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		
	}
	@Bean
	public Docket customerApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.mani"))
				.paths(regex("/customer.*")).build().apiInfo(metaInfo());
		
	}
	private ApiInfo metaInfo() {
		// TODO Auto-generated method stub
		ApiInfo apiInfo = new ApiInfo("springboot customer application", "provides the customer details",
				"1.0.0", "TermsOfService", new Contact("Manikandan","http:ithub.com/manikandanravi94", "manikandanravi94@gmail.com"), "licenseUrl", "licensevalue", Collections.emptyList());
		return apiInfo;
		
	}

	
}
