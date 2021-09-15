package org.example.palindromenumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check palindrome or not");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalnumber = number;
        int reverse = 0;
        for (; number != 0; number /= 10){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder ;
        }

        if ( reverse == originalnumber)
            System.out.println("Number is Palindrome ");
        else
            System.out.println("Number is not a Palindrome");
    }
}
