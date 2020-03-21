package com.tgt.igniteplus;

public class Q10 {
    public static void main(String[] args) {
        int n=12344,i;
        String one[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        i=(n/10000);
        System.out.print(one[i]+" ");
        i=(n/1000)%10;
        System.out.print(one[i]+" ");
        i=(n/100)%10;
        System.out.print(one[i]+" ");
        i=(n/10)%10;
        System.out.print(one[i]+" ");
        i=n%10;
        System.out.print(one[i]);
    }
}
