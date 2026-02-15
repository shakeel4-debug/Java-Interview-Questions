package org.example;

public class EvenOROdd {
    public static void main(String[] args) {
        int a=33;
        /**
        if (a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("Odd");
        }
         */

        /**

        if(a/2*2==a){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
         */

        /**

        if ((a&1)==0){
            System.out.println(a+"is even");
        }
        else{
            System.out.println(a+"is odd");
        }
         */

        String result=(a%2==0)?"Even" :"Odd";
        System.out.println(a+"is"+result);


    }
}
