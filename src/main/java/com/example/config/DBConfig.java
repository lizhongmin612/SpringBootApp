/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月14日 17:20:00
 */
@Component
@PropertySource("classpath:db.properties") //指定配置文件位置
@ConfigurationProperties() //指定配置文件中属性的前缀信息
public class DBConfig {

	private String password;
	private String username;
	private String testNull = "i am default";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {

		return password;
	}

	public String getTestNull() {
		return testNull;
	}

	public void setTestNull(String testNull) {
		this.testNull = testNull;
	}
}
