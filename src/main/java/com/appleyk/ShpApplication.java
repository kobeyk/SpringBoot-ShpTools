package com.appleyk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 *   下面是一个典型的结构：
 *
 *   com
 *     +- example
 *     +- myproject
 *     +- Application.java --
 *
 *  注意这个位置，习惯性的放在项目的一开始，也就是根包的第一层 | + - domain | +- Customer.java | +-
 *  CustomerRepository.java | + - service | +- CustomerService.java | + - web +-
 *  CustomerController.java
 *  文件将声明 main 方法， 还有基本的 @Configuration
 *
 * <p>SpringBoot启动类</p>
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 上午 11:54 2018-10-12
 */
@SpringBootApplication// same as @Configuration @EnableAutoConfiguration  @ComponentScan
public class ShpApplication extends SpringBootServletInitializer {

    /**
     * SpringApplication类提供了一种从main()方法启动Spring应用的便捷方式。 在很多情况下， 你只需委托给
     * SpringApplication.run这个静态方法：
     * @param args 输入参数
     */
    public static void  main(String[] args) {
        SpringApplication.run(ShpApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ShpApplication.class);
    }

    /**
     * Spring-Boot启动的时候，加载、创建、初始化数据
     * @return 初始化信息
     */
	@Bean
    CommandLineRunner demo() {
        return args -> {
            System.out.println("<<<<<<<<<    Hello,Spring Boot !    >>>>>>>>");
        };
    }

}
