package com.example.demo;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired()
	private UserMapper userMapper;

	@Test
	public void testSelectUser() {
		System.out.println(("----- 开始测试 mybatis-plus 查询数据 ------"));
		//  selectList() 方法的参数为 mybatis-plus 内置的条件封装器 Wrapper，这里不填写表示无任何条件，全量查询
		List<User> userList = userMapper.selectList(null);

		userList.forEach(System.out::println);
	}

}
