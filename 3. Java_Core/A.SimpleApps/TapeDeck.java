package com.company;

public class TapeDeck {
    NewTape one = new NewTape();
    NewTape two = new NewTape();
    void tryTheTape () {
        one.name = " Hello";
        one.TapeisGood = true;
        two.name = " Blue Album";

        one.playing();
        System.out.println ("Tape nay hay: " + one.TapeisGood);
        one.reviewAndBuy();

        System.out.println("-----------------");

        two.playing();
        System.out.println ("Tape nay hay: " + two.TapeisGood);
        two.reviewAndBuy();
    }

    class NewTape {
        String name;
        boolean TapeisGood = false;
        void buyTape () {
            System.out.println("BUY THE TAPE: " + name);
        }

        void playing () {
            System.out.println (" Playing the Tape:  " + name);
        }

        void reviewAndBuy () {
            if (TapeisGood == true) {
                buyTape();
            }
            else {
                System.out.println ("Do not touch the Tape again ");
            }
        }

    }
}

class TestDriveTapeDeck {
    public static void main(String[] args) {
        TapeDeck one = new TapeDeck();
        one.tryTheTape();
    }
}