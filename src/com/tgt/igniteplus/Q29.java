package com.tgt.igniteplus;
import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        int n,key;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements");
        n=in.nextInt();
        int[] a=new int[n];
        System.out.print("enter the elements in sorted order");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print("enter the key/search element");
        key=in.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid]){
                System.out.print("the key/search element is found at "+(mid+1));
                
            }
            else if(key<a[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        if(low>high)
            System.out.print("the key/search element is not found");
    }
}
