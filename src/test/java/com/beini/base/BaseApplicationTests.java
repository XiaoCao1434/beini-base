package com.beini.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.beini.base.config.PropertiesConfig;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {
	@Autowired
	private PropertiesConfig config;
	@Test
	public void contextLoads() {
		System.out.println("yml文件："+config.getMyname());
		System.out.println("properties文件："+config.getMyname2());
	}

}
