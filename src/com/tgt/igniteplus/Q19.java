package com.tgt.igniteplus;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the decimal number:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println(Integer.toBinaryString(n));
    }
}
