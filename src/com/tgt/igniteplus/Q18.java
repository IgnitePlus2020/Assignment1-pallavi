package com.tgt.igniteplus;
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {

        int num ;
        System.out.print("enter the number to find factorial:");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
    }
