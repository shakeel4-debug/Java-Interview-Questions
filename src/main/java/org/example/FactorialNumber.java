package org.example;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        int resutl=1;

        for (int i=1;i<=5;i++){
            resutl*=i;
        }
        System.out.println(resutl);
    }
}
