package com.company;

import java.util.ArrayList;

public class tryArrayList {
    public static void printAL (ArrayList<String> a1) {
        for (String i : a1 ) {
            System.out.print (i + " ");
        }
        System.out.println ();
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"one");
        a.add(1, "two");
        a.add(2,"three");
        printAL(a);

        if (a.contains("three")) {
            a.add (3,"four");
            a.remove(2);
            printAL(a);
        }

    }
}
