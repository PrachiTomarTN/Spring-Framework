package com.example.looseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Primary
public class QuicKSort implements SortingAgorithmService{


    @Override
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("QuickSort");
        return numbers;
    }
}
