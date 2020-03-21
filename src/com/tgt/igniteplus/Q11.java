package com.tgt.igniteplus;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        int i,n,N;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the  length of the sequence:");
        N=in.nextInt();
        for(i=1;i<=N;i++){
            if(i%2==0)
            {
                n=i*i;
                System.out.print(+n+",");
            }
        }
    }
}
