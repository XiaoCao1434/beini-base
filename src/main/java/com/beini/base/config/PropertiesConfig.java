package com.beini.base.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Configuration
@ConfigurationProperties(prefix="base")
@Data
public class PropertiesConfig {
	private String myname;
	private String myname2;
}
