package com.kiran;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
     int[] arr = {50,34,20,10,5,4,2,-12,-20};
     int target = -20;
     //Arrays.sort(arr);
     int ans = binarysearch(arr,target);
     System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // for Ascending order
        while(start <= end){
            // start + end might be possible that exceeds the range of int
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
               end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
