package com.eshop.clothes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClothesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClothesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("usando jpa");
	}

}
