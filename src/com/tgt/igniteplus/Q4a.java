package com.tgt.igniteplus;
import java.util.Scanner;
public class Q4a {
    public static void main(String[] args) {
        int x,y,t;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of x and y:");
        x=in.nextInt();
        y=in.nextInt();
        System.out.print("before swapping numbers:"+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.print("after the swapping:"+x+" "+y);
    }
}
