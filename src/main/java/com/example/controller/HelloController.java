/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package com.example.controller;

import com.example.persistence.domain.Car;
import com.example.persistence.mapper.CarMapper;
import com.example.vo.Student;
import me.oldriver.commons.mybatis.plugin.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2017年03月14日 14:52:00
 */
@RestController
public class HelloController {

	@Autowired
	private CarMapper carMapper;

	@RequestMapping("hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("exception")
	public String exception(){
		throw new RuntimeException("hehe");
	}

	@RequestMapping("student")
	public Student student() {
		return new Student("小明", 2);
	}

	@RequestMapping("car/{brandId}")
	public Car getCar(@PathVariable("brandId") long brandId){
		System.out.println("汽车:"+brandId);
		return carMapper.selectByPrimaryKey(brandId);
	}

	@RequestMapping("carlist/{currentPage}")
	public List<Car> getCarList(@PathVariable(name="currentPage") int currentPage){
		Page page = new Page();
		page.setPageSize(2);
		page.setCurrentPage(currentPage);
		return carMapper.selectAll(page);
	}
}
