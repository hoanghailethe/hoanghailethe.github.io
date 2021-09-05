package com.company;

public class nineninebottles {
    public static void main(String[] args) {
        int num = 99;
        String word = "bottles";
        while (num>0) {
            if ( num==1 ) {
                word = "bottle";
            }
            System.out.println(num + "  " + word + " on the shelf");
            System.out.println("Take one down to drink and Start another round");
            num--;
        }
        if (num == 0) {
            System.out.print("There is no bottle left");
        }
    }
}
