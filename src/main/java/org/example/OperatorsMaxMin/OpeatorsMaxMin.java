package org.example.OperatorsMaxMin;

public class OpeatorsMaxMin {
    public static void main(String[] args) {
        int a = 3 , b = 8 , c = 3;
        int result1 = a + b * c ;
        double result2 = c + a / b ;
        int result3 = a % b + c ;
        int result4 = a * b + c ;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("Max of two numbers is " +Math.max(a,b));
        System.out.println("Min of two numbers is " +Math.min(b,c));
    }
}
