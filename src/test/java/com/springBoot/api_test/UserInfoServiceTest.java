package com.springBoot.api_test;

import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springBoot.entity.UserInfo;
import com.springBoot.service.UserInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceTest {

	@Resource
	private UserInfoService userInfoService;
	
	@Test
	public void testSave() {
		UserInfo userInfo = new UserInfo();
		userInfo.setBirthday(new Date());
		userInfo.setEmail("123");
		userInfo.setPassword("111");
		userInfo.setSex("nn");
		userInfo.setUserName("123");
		@SuppressWarnings("all")
		UserInfo entity = userInfoService.saveOne(userInfo);
		System.out.println(entity);
	}
	
	@Test
	@Transactional // 单元测试加入次注解解决hibernate懒加载问题
	public void findById() {
		System.out.println(userInfoService.findById("402880e765be8bee0165be8bfd2c0000"));
	}
	
	@Test
	public void findByUserName() {
		UserInfo entity = userInfoService.findByUserName("123");
		System.out.println(entity);
	}
	
	

}
