package com.desafio.apirest.config;

import java.util.ArrayList;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {    
    
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.desafio.apirest"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "UBS API REST",
                "API REST consulta a UBS.",
                "1.0",
                "Terms of Service",
                new Contact("Lucival Sousa", "https://www.linkedin.com/in/lucival-sousa/",
                        "lucivalsouza05@hotmail.com"),
                "https://github.com/Lucival12",
                "https://github.com/Lucival12", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
