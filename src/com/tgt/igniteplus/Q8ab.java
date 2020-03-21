package com.tgt.igniteplus;
import java.util.Scanner;
public class Q8ab {
    public static void main(String[] args) {
        int i,n,sume=0,sumo=0;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the n value:");
        n=in.nextInt();
        for(i=0;i<=n;i++){
            if(i%2==0){
                sume=sume+i;
            }
            else{
                sumo=sumo+i;
            }
        }
        System.out.println("the sum of even number="+sume);
        System.out.println("the sum of odd number="+sumo);
    }
}
