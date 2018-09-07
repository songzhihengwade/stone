package com.stone.stone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stone.stone.mapper")
public class StoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoneApplication.class, args);
	}

}
