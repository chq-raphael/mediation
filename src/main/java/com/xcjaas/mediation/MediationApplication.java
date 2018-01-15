package com.xcjaas.mediation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xcjaas.mediation.mapper")
public class MediationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediationApplication.class, args);
	}
}
