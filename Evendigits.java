package com.kiran;

public class Evendigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumbers(nums));
        //System.out.println(digits(-254));
    }
    // Function to check whether the number contains even digits or not
    static int findnumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int ans = digits(num);
        if(ans % 2 == 0){
            return true;
        }
        return false;
    }
    // Count number of digits in the number
    static int digits(int num){
        int count = 0;
        if(num == 0){
            return 1;
        }
        if(num<0){
            num = num *-1;
        }
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
