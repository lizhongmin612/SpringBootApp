/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月21日 14:53:00
 */
@PropertySource("classpath:testConfig.properties") //指定配置文件位置
@ConfigurationProperties()
public class TestConfig {

	private String testName;
	private String testNull = "i am default";

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestNull() {
		return testNull;
	}

	public void setTestNull(String testNull) {
		this.testNull = testNull;
	}
}
