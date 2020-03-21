package com.tgt.igniteplus;
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        int base,exponent;
        System.out.print("enter the base and exponent :");
       Scanner in=new Scanner(System.in);
       base=in.nextInt();
       exponent=in.nextInt();
        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
