package com.ljh.config;

import com.alibaba.dubbo.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.misc.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jiahui Li
 * @DATE 2019/9/18 10:06
 */
@Configuration
public class ProviderConfig {

	@Value("${dubbo.application.name}")
	private String applicationName;

	@Value("${dubbo.registry.address}")
	private String address;

	@Value("${dubbo.registry.protocol}")
	private String protocol;

	@Value("${dubbo.registry.name}")
	private String name;

	@Value("${dubbo.registry.port}")
	private Integer port;

	/* <dubbo:application name="springboot-provider"></dubbo:application> */

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(this.applicationName);
		return applicationConfig;
	}


	/* <dubbo:registry protocol="zookeeper" address="192.168.25.135:2181"></dubbo:registry> */

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(this.address);
		registryConfig.setProtocol(this.protocol);
		return registryConfig;
	}


	/* <dubbo:protocol name="dubbo" port="8001"></dubbo:protocol> */
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName(this.name);
		protocolConfig.setPort(this.port);
		return protocolConfig;
	}

	/**
	 * <dubbo:service interface="com.atguigu.gmall.service.UserService"
	 * ref="userServiceImpl01" timeout="1000" version="1.0.0">
	 * <dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
	 * </dubbo:service>
	 */

	/*
	@Bean
	public ServiceConfig<?> serviceConfig(Object object) {
		ServiceConfig<?> serviceConfig = new ServiceConfig<>();
		serviceConfig.setInterface(object.getClass());
		serviceConfig.setRef(object);
		serviceConfig.setVersion("1.0.0");

		//配置每一个method的信息
		MethodConfig methodConfig = new MethodConfig();
		methodConfig.setName("getUserAddressList");
		methodConfig.setTimeout(1000);

		//将method的设置关联到service配置中
		List<MethodConfig> methods = new ArrayList<>();
		methods.add(methodConfig);
		serviceConfig.setMethods(methods);

		//MonitorConfig...

		return serviceConfig;

	}*/

}
