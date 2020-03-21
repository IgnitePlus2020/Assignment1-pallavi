package com.tgt.igniteplus;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        int num,reverse=0;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        num=in.nextInt();
        while(num!=0)
        {
            int temp=num%10;
            reverse=reverse*10+temp;
            num=num/10;
        }
        System.out.print("reversed number :"+reverse);
    }
}
