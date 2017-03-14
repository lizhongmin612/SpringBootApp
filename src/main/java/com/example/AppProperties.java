/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月14日 15:29:00
 */
@Component
public class AppProperties {

	@Value("${com.example.title}")
	private String title;
	@Value("${com.example.content}")
	private String content;
	@Value("${com.example.value}")
	private String randomString;

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getRandomString() {
		return randomString;
	}
}
