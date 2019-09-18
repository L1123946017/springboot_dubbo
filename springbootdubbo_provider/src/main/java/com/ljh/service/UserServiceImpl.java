package com.ljh.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ljh.commons.UserService;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/18 10:49
 */
@Service(version = "1.0.0",timeout = 3000)
public class UserServiceImpl implements UserService {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}
}
