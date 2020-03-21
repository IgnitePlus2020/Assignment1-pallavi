package com.tgt.igniteplus;

import java.util.Scanner;

public class Q4b {
    public static void main(String[] args) {
        int x,y,z,t;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of x and y and z:");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        System.out.print("before swapping numbers:"+x+" "+y+ " "+z);
        t=x;
        x=z;
        z=y;
        y=t;
        System.out.print("after the swapping:"+x+" "+y+ " "+z);
    }
}
