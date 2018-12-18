package com.example.demo22222.hj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket myDocket(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo=new ApiInfo("憧憬",
                "如有疑问或者错误请联系下方邮箱",
                "1.0",
                "apiDocs",
                "1106377039",
                "",
                "");
        docket.apiInfo(apiInfo);
        return docket;
    }
}
