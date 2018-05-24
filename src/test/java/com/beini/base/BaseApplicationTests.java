package com.beini.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.beini.base.config.PropertiesConfig;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BaseApplicationTests {
	@Autowired
	private PropertiesConfig config;
	@Test
	public void contextLoads() {
		log.info("yml文件："+config.getMyname());
		log.info("properties文件："+config.getMyname2());
		
		Properties prop = readFile();
		log.info("readProperties : "+prop.get("base.myname2"));
	}
	
	private Properties readFile() {
		Properties prop = new Properties();
		String fileName = "application.properties";
		try(BufferedReader br= new BufferedReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(fileName),
				"UTF-8"))) {
			prop.load(br);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
