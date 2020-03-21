package com.tgt.igniteplus;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        System.out.print("Enter the no. of terms you want to print: ");
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        int n=Integer.parseInt(input);
        int result=1;
        for(int i=0;i<n;i++){
            result=result+i*i;
            if(i%2!=0)
                System.out.print(-result+ " ");
            else
                System.out.print(result+ " ");
        }
    }

}
