package com.kiran;

import java.util.Arrays;

public class twosumnum {
        public static void main(String[] args){
            /*int[] num = {11,2,7,15};
            int target = 9;
            int[] ans = twosum(num, target);
            System.out.println(Arrays.toString(ans));
        }

    static int[] twosum(int[] num, int target){
            for(int i=0;i<num.length;i++){
                for(int j=i+1;j<num.length;j++){
                    if(num[i] + num[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
        return new int[]{};*/
            int num = 123;
            reverse(num);
    }
    static void reverse(int num){
            int ans = 0;
            while(num>0){
                int rem = num % 10;
                ans = ans * 10 + rem;
                num = num/10;
            }
            System.out.println(ans);
    }
    }

