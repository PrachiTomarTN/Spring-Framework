package com.example.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingAgorithmService sortingAgorithmService;

    //Constructor Injection
    public BinarySearchImpl(SortingAgorithmService sortingAgorithmService) {
       this.sortingAgorithmService = sortingAgorithmService;
   }
    int binarysearch(int [] numbers,int key) {

        //loosely coupled
        int [] arr= sortingAgorithmService.sort(numbers);

        //binarysearch
        int first=0;
        int last=arr.length;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }
            else if ( arr[mid] == key ){
                //System.out.println("Element is found at index: " + mid);
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            //System.out.println("Element is not found!");
            return -1;
        }
        return -1;
    }
    

}
