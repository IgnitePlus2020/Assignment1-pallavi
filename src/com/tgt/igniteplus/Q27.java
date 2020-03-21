package com.tgt.igniteplus;
import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        int c=0,a,temp;
        int n;//It is the number to check armstrong
        System.out.print("enter the 3 digit number:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
