/**
 * $Id$
 * Copyright(C) 2014-2020 yingu, All Rights Reserved.
 */
package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月21日 上午10:24:00
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ExceptionInfo jsonErrorHandler(HttpServletRequest req,Exception e) throws Exception{
		ExceptionInfo info = new ExceptionInfo();
		info.setCode(400);
		info.setData("some data");
		info.setMessage(e.getMessage());
		info.setUrl(req.getRequestURL().toString());
		return info;
	}

}
