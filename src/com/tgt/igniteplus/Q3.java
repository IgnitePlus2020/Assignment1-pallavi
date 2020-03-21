package com.tgt.igniteplus;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        float p, r, t, sinterest;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principal:");
        p = in.nextFloat();
        System.out.print("enter the rate of intrest:");
        r = in.nextFloat();
        System.out.print("enter the time period:");
        t = in.nextFloat();
        sinterest=(p*r*t)/100;
        System.out.print("simple intrest is:"+sinterest);
    }
}
