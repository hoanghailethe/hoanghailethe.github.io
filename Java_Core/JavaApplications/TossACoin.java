package com.company;

import java.util.Random;

public class TossACoin {

  /*  public String tossACoin () {
        Random randomNumber = new Random();
        int zeroOrOne = (Math.abs(randomNumber.nextInt()) % 2);
        if ( zeroOrOne == 1 ) {
            return "Heads";
        } else {
            return "Tails";
        }
    } */

    String headsOrTails;
    public TossACoin () {
        Random randomNumber = new Random();
        int zeroOrOne = Math.abs(randomNumber.nextInt()) % 2;
        if (zeroOrOne == 1) {
            headsOrTails = "HEADS";
        } else {
            headsOrTails = "TAILS";
        }
    }

    public static void main (String [] args) {
        TossACoin newGame = new TossACoin();
        /*
        System.out.println(newGame.tossACoin());
        System.out.println(newGame.tossACoin());
        System.out.println(newGame.tossACoin());
        System.out.println(newGame.tossACoin());
        System.out.println(newGame.tossACoin());
        System.out.println(newGame.tossACoin());
         */
        System.out.println(newGame.headsOrTails);
        System.out.println(newGame.headsOrTails);
        System.out.println(newGame.headsOrTails);
        System.out.println(newGame.headsOrTails);
        System.out.println(newGame.headsOrTails);
    }
}
