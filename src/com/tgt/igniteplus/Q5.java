package com.tgt.igniteplus;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        n=in.nextInt();
        if(n%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
