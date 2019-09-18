package com.ljh;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/18 10:03
 */
@SpringBootApplication
@ImportResource(locations="classpath:application.xml")
@EnableDubbo
public class SpringBootDubboProvied {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboProvied.class, args);
	}
}
