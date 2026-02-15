package org.example;

public class Swap {
    public static void main(String[] args) {

        int a=10,b=5;
        int temp;
        System.out.println("a and b"+a+" "+b);
//        temp=a;
//        a=b;
//        b=temp;

//        a=a+b;
//        b=a-b;
//        a=a-b;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a and b"+a+" "+b);

    }
}
