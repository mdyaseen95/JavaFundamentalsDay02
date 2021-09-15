package org.example.reversingnumber;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev = 0;
        while ( num > 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The Reverse of Entered number is " +rev);
    }
}
/* for( ; num != 0; num/=10 ){
            rev = rev * 10 + num % 10;
            num = num / 10;
 */