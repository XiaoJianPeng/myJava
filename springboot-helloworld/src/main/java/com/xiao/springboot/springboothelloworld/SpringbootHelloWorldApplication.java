package com.xiao.springboot.springboothelloworld;

import com.xiao.springboot.springboothelloworld.service.JobTestHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloWorldApplication {
	private static Logger log = LoggerFactory.getLogger(JobTestHello.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldApplication.class, args);
		log.info("***********SpringbootHelloWorldApplication is start************");
	}

}
