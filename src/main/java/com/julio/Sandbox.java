package com.julio;

import java.io.IOException;
import java.util.Properties;

public class Sandbox {
	
	public Sandbox() throws IOException {
		Properties prop = new Properties();
		prop.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		
		System.out.println(prop.getProperty("user"));
	}
}
