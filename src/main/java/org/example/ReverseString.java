package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String a="automation";
        String result="";
        int vowels=0;
        int constants=0;
        for (int i=a.length()-1;i>=0;i--){
            result+=a.charAt(i);
            if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                vowels++;
            }
            else {
                constants++;
            }
        }
        System.out.println("Reverse  "+result);
        System.out.println("Vowels count "+vowels);
        System.out.println("constants count "+constants);
    }
}
