package com.ljh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ljh.commons.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/18 10:53
 */
@RestController
@RequestMapping("/api/dubbo")
public class UserController {


	@Reference(version = "1.0.0",timeout = 3000)
	private UserService userService;


	@RequestMapping(value = "/sayHello",method = RequestMethod.POST)
	public void test(){
		System.out.println("aaaaa");
		userService.sayHello();
	}
}
