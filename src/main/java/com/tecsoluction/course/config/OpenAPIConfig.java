package com.tecsoluction.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Workshop E-commerce API")
                        .version("1.0.0")
                        .description("Full API for e-commerce management (Orders, Products, Users, and Categories).")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact()
                                .name("João Guilhermmy")
                                .email("seu-email@gmail.com")
                                .url("https://github.com/JoaoGuilhermmy")));
    }
}