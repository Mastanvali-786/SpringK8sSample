package com.mastan.k8s.SpringK8sSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringK8sSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringK8sSampleApplication.class, args);
	}

	@GetMapping("/")
	public String getMessage(){
		return "Hello K8s Hello World Application is Running";
	}

}
