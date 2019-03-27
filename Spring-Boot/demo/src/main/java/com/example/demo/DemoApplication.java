package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl a = new BinarySearchImpl(new BubbleSort());
		System.out.println(a.search(new int[]{1,2,3,4}, 3));
	}

}
