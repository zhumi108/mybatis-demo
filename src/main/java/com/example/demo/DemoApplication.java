package com.example.demo;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.demo")
public class DemoApplication {

	@Autowired
	private UserMapper userMapper;

	public static void main(String[] args) {

		System.out.println("hello");
	}

}
