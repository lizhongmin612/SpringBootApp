/**
 * $Id$
 * Copyright(C) 2014-2020 yingu, All Rights Reserved.
 */
package com.example.exception;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月21日 上午10:23:00
 */
public class ExceptionInfo {

	private int code;
	private String message;
	private String url;
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
