package com.fengyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling	//开启定时任务
@EnableAsync	//开启异步任务
public class FengyueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FengyueApplication.class, args);
	}

}
