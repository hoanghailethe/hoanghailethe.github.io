package com.company;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        boolean isStringAEqualStringB = false;
        boolean isStringCEqualStringD = false;
        boolean isStringEEqualStringC =false;

        String A = "HelloWorld1";
        String B = "HelloWorld1";
        String C = "A12";

        Scanner scan = new Scanner(System.in);
        String E = scan.next();

        String [] F = {"A", "B", "C", "D"};

        int D =12;
        if (A==B) {
            isStringAEqualStringB = true;
        }
        if (C== String.valueOf(D)) {
            isStringCEqualStringD =true;
        }

        if (C== (E)) {
            isStringEEqualStringC =true;
        }
        System.out.println(isStringAEqualStringB);
        System.out.println(isStringCEqualStringD);
        System.out.println(isStringEEqualStringC);
        System.out.println(E);
        System.out.println(String.valueOf(E));
        System.out.println(F);
    }
}
