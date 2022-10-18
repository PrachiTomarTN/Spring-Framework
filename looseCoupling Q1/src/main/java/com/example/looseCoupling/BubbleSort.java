package com.example.looseCoupling;

import org.springframework.stereotype.Component;

import java.util.Arrays;
 @Component
public class BubbleSort implements SortingAgorithmService{

    @Override
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("BubbleSort");
        return numbers;
    }
}
