package com.tgt.igniteplus;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        int a=1,n;
        System.out.print("enter length of sequence:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<=n;i++){
            if(i%3==0)
                continue;
            System.out.print(a+" ");
            a=a+4*i;
        }
    }
}
