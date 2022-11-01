package com.Learning.CodeWars;

public class SecondTask {

    public static long breakChocolate (long n, long m){
        if(n==1 && m==1){
            return 0;
        }else{
            return (n*m)-1;
        }

    }

    public static void main(String[] args) {
        System.out.println(breakChocolate(3, 2));
    }

}
