package com.kiran;
import java.util.Arrays;

public class reverse_integer {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(reverse(num));
    }
    static int reverse(int num) {
        int ans = 0;
        boolean Isnegative = num < 0; // for negative number
        if (Isnegative) num = -num;
        while(num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }
        if (Isnegative) ans = -ans;
        return ans;
    }
}
