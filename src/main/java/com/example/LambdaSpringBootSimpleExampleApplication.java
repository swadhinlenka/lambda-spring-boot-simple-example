package com.example;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaSpringBootSimpleExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaSpringBootSimpleExampleApplication.class, args);
	}
	
	@Bean
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }

}
