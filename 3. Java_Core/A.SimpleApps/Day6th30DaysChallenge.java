package com.company;

import java.util.Scanner;

public class Day6th30DaysChallenge {
//Task
//Given a string, S, of length N that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a
// single line (see the Sample below for more detail).
//Note: 0 is considered to be an even index.
//Input Format
//
//The first line contains an integer, T (the number of test cases).
//Each line i of the T subsequent lines contain a String, .


    public static void main(String[] args) {
        char []S = new char[10];
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = T ; i>0; i--) {
            String typedInText = scan.next();
            int x = 0;
            while ( x < typedInText.length()) {
                S[x] = typedInText.charAt(x);
                x++;
            } // end while
            // Print even
            for (int y = 0; y< S.length; y++) {
                if ( (y % 2) == 0 ) {
                    System.out.print(S[y]);
                }
            }
            System.out.println();

            //print odd character
            for (int z = 0 ; z< S.length ; z++) {
                if ( (z % 2) == 1 ) {
                    System.out.print(S[z]);
                }
            }
        } // end for

    }


}
