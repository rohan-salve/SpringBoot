package com.ron.config;


import java.util.Collections;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig {

	public Docket createDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ron.restcontroller"))
				.paths(PathSelectors.regex("/api/tourist.*"))
				.build()
				.useDefaultResponseMessages(true)
				.apiInfo(getApiInfo());
		
	}

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("rohan", "http://indent.io", "rohan@indent.com");
		return new ApiInfo("TouristInfo", "Providing info of Tourist", "2.0.1.RELEASE", "https:", contact, "GNU PUBLIC", "http://apacahe.org/license/guru",Collections.emptyList());
	}
}
