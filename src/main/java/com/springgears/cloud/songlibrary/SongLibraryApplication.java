package com.springgears.cloud.songlibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SongLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongLibraryApplication.class, args);
	}
}
