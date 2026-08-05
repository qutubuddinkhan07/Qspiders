package com.qsp.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@ConfigurationProperties(prefix = "project")
@Setter
public class AppData {
	private String name;
	private Double version;
	private String team;
	double[] upcoming;
	List<String> database;
	Map<String, String> teams;
}
