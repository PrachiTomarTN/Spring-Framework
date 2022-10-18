package com.example.TightCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCouplingApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch=new BinarySearchImpl();
		int result = binarySearch.BinarySearch(new int []{1,8,7,6,9},8);
		System.out.println(result);
		SpringApplication.run(TightCouplingApplication.class, args);
	}

}
