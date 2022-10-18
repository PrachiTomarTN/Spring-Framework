package com.example.TightCoupling;

public class BinarySearchImpl {

    public int BinarySearch (int [] numbers,int key){

        BubbleSort bubbleSort=new BubbleSort();
        // Sorting
        int [] arr=bubbleSort.bubblesort(numbers);

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

