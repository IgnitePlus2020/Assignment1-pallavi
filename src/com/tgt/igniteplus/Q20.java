package com.tgt.igniteplus;
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        System.out.print("enter the binary number:");
        Scanner in=new Scanner(System.in);
        String binaryString =in.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}
