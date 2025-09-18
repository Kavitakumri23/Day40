package com.polymorphism;


public class Overloading {

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading ov = new Overloading();

        System.out.println(ov.sum(3,5));
        System.out.println( ov.sum(3,6,8));
    }
}
