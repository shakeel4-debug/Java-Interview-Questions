package org.example;

public class FibonacciSequence {
    public static int fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));

//        int first = 0, second = 1;
//        System.out.print("Fibonacci Series: " + first + ", " + second);
//
//        for (int i = 2; i < 5; i++) {
//            int next = first + second;
//            System.out.print(", " + next);
//            first = second;
//            second = next;
//        }



    }
}
