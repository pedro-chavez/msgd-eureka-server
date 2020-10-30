package com.edu.udec.gdmtsrk.msgdeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsgdeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgdeurekaserverApplication.class, args);
	}

}
