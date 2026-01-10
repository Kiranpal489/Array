package com.kiran;
public class find_peak_element{
public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    int peak = findElement(nums);
    System.out.println(peak);
}
static int findElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid]>nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;// start and end points to same value so you can return either start or end

    }
}