package com.tgt.igniteplus;
import sun.awt.geom.AreaOp;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the number of rows n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
