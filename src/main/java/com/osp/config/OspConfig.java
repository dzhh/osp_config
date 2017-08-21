package com.osp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * 2017/08/21
 * OSP 注册中心
 * @author fly
 *
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class OspConfig {

	public static void main(String[] args) {
		SpringApplication.run(OspConfig.class, args);
	}
}
