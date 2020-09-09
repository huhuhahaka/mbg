package com.fruits.mbg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//是否开启 swagger，正式环境一般是需要关闭的（避免不必要的漏洞暴露！），可根据 springboot 的多环境配置进行设置
//@ConditionalOnProperty(name = "swagger.enable",  havingValue = "true")
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${mbg.package.base}")
    private String packageBase;


    // swagger2 的配置文件，这里可以配置 swagger2 的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage(packageBase)).paths(PathSelectors.any())
                .build();
    }


    // 构建 api 文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title(applicationName + " 项目 接口文档")
                // 创建人信息
                .contact(new Contact("huhuhahaka",  "https://github.com/huhuhahaka",  "1739660721@qq.com"))
                // 版本号
                .version("1.0")
                // 描述
                .description("<h2> 开发者信息 </h2>")
                .build();
    }

}
