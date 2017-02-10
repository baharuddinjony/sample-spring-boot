package com.bahar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.bahar.utils.UrlConstants;

@Configuration
public class WebConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(UrlConstants.VERSION + "/**").allowedOrigins("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("Content-Type", " Accept")
						.allowCredentials(true).maxAge(3600);

			}
		};
	}
}
