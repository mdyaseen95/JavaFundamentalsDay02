package org.example.switchvowel;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        System.out.println("Enter the Alphabet");
        Scanner scan = new Scanner(System.in);
        char alpha = ((scan.nextLine()).charAt(0));

        switch (alpha){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Alphabet is a vowel");
                break;
            default :
                    System.out.println("Alphabet is a cosonant");
        }
    }
}
