package com.qh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qh.mapper.UserMapper;

public class SpringTest {

	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-common.xml");
		 UserMapper userMapper = (UserMapper)ctx.getBean("userMapper");
		 System.out.println(userMapper.findAll());
	 }
}
