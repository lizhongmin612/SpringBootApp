/**
 * $Id$
 * Copyright(C) 2014-2020 yingu, All Rights Reserved.
 */
package com.example.vo;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月21日 上午10:17:00
 */
public class Student {

	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
