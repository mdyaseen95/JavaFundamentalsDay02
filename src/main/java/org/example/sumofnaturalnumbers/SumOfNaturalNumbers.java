package org.example.sumofnaturalnumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range n for natural number sum");
        int n = scan.nextInt();
        int sum = 0, i=0;
        while(  i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of "+ n + " natural numbers is "+ sum);
    }
}
/* for( int i=0; i<=n; i++){
      sum += i;
        i++;
             }*/