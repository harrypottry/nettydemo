package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Value("${test}")
	private  static String test;

	public static void main(String[] args) {
		//String arg0 = args[0];
		//String arg1 = args[1];
		//System.out.println(arg0 + ":" + arg1);
		//String name = System.getProperty("name");
		//String age = System.getProperty("age");
		System.out.println(test);
		//System.out.println(name + ":" + age);
		SpringApplication.run(Application.class, args);
	}

}
