package com.tgt.igniteplus;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        int i,n;
        System.out.print("enter length of sequence:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for( i=0;i<=n;i++){
            if(i%4==0)
                continue;
            System.out.print((i*i)+" ");

        }
    }
}


