package com.example.importantquestions.ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of coins");
        int n = sc.nextInt();
        System.out.printf("Enter the coins");
        int coins[]=new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        System.out.printf("Enter the amount");
        int amount = sc.nextInt();
        System.out.print(coinchange(coins,amount));
    }
    public static int coinchange(int[] coins,int amount) {
        int amt[]=new int[amount+1];
        Arrays.fill(amt,amount+1);
        amt[0] = 0;
        for(int i=1; i<=amount; i++){
            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    amt[i]=Math.min(amt[i],1+amt[i-coins[j]]);
                }
            }
        }
        if(amt[amount]<amount+1){
            return amt[amount];
        }
    return -1;
    }
}
