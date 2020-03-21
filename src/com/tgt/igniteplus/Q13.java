package com.tgt.igniteplus;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Q13 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the  length of the sequence:");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print(pow(i,i)+" ");
    }
}
