package com.ljh;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/18 10:40
 */
@EnableDubbo
@SpringBootApplication
public class SpringbootProvider {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProvider.class, args);
	}
}
