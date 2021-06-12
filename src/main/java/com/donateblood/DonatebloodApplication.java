package com.donateblood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DonatebloodApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonatebloodApplication.class, args);
		// comment
	}

	@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer corsConfig() {
		
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
				registry.addMapping("/**")
					.allowedMethods("POST","GET","PUT")
					.allowedOrigins("*")
					.allowedHeaders("*");
			}
		};
		}

}
