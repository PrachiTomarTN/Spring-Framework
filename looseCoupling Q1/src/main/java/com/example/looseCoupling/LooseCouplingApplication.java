package com.example.looseCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSort());

		ApplicationContext applicationContext=SpringApplication.run(LooseCouplingApplication.class, args);

		BinarySearchImpl binarySearchimpl=applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1= applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("Getting the properties of beans");
		System.out.println(binarySearchimpl);
		System.out.println(binarySearch1);

		int result = binarySearchimpl.binarysearch(new int []{1,8,7,6,9},8);
		System.out.println(result);

	}

}
