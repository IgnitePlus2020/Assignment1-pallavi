package com.tgt.igniteplus;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        int a,b,c,large,secondlarge;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the 3 numbers:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b&&a>c){
            large=a;
            secondlarge=(b>c)?b:c;
        }
        else if(b>a&&b>c){
            large=b;
            secondlarge=(a>c)?a:c;
        }
        else{
            large=c;
            secondlarge=(a>b)?a:b;
        }
        System.out.println("largest="+large);
        System.out.println("second largest="+secondlarge);
    }
}
