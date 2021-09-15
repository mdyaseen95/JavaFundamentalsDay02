package org.example.nameofdigit;

import java.util.Scanner;

public class NameofDigit {
    public static void main(String[] args) {
        System.out.println("Enter a numbers 1 or 10 or 100 or 1000");
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        if ( digit == 1 )
            System.out.println("Units digit");
        else if ( digit == 10 )
            System.out.println("Tens digit");
        else if ( digit == 100 )
            System.out.println("Hundred digit");
        else if ( digit == 1000 )
            System.out.println("Thousand digit");
        else
            System.out.println("Out of Range");
    }
}
