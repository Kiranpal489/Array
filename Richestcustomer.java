package com.kiran;

public class Richestcustomer {
    public static void main(String[] args){
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
        static int maximumWealth(int[][] accounts) {
            int maxvalue = accounts[0][0];
            for(int i=0;i<accounts.length;i++) {
                int rowsum = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    rowsum += accounts[i][j];
                }
                //System.out.println(rowsum);
                if (rowsum > maxvalue) {
                    maxvalue = rowsum;
                }
            }
            return maxvalue;
        }
    }

