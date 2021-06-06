package com.company;

import java.util.Random;
import java.util.Scanner;

public class SinkADotCom {

}
class ShipConstructing {
        // Random direction of the Three ship
        String direction;

        //int[] address = new int [4];

        String[] giaTriHoanhDo = {"A","B","C","D","E","F","J"};

        int[] xValue = new int [3];
        String[] yValue = new String [3];

        Boolean theShipIsDown1 = false;
        Boolean theShipIsDown2 = false;
        Boolean theShipIsDown3 = false;
        Boolean theShipIsDown = false;

        String a,b,c;

        public void randomTheDirection() {
            int random1 = (int) ((Math.random() * 10) % 2);
            if (random1 == 0) {
                direction = "Up";
            } else {
                direction = "Right";
            }
        }

        //Randomly create address of the Ship
        public void createAddressOfTheShip() {
            int x1, x2, x3;
            int y1, y2, y3;

            Random random2 = new Random();
            Random random3 = new Random();

            // x se co gia tri ngau nhien tu 1 - 7; y co gia tri ngau nhien 1-4
            if (this.direction == "Up") {
                x1 = (1+(Math.abs(random2.nextInt())) % 7);
                y1 = (Math.abs(random3.nextInt()) % 5);
                y2 = y1 + 1;
                y3 = y2 + 1;

                /*address [0] = x1;
                address [1] = y1;
                address [2] = y2;
                address [3] = y3;*/

                //chuyen doi gia tri he toa do

                yValue[0] = giaTriHoanhDo [y1];
                yValue[1] = giaTriHoanhDo [y2];
                yValue[2] = giaTriHoanhDo [y3];
                xValue[0] = x1;

                System.out.println (yValue[0]+xValue[0]+","+ yValue[1]+xValue[0] +","+ yValue[2] + xValue[0]);

                //chuyen doi toa do thanh cac chuoi String:
                a = yValue[0] + String.valueOf(xValue[0]);
                b = yValue[1] + String.valueOf(xValue[0]);
                c = yValue[2] + String.valueOf(xValue[0]);
            } else {
                //Truong hop nay Ship nam Ngang tu trai sang phai. Tuong ung Direction = Right.
                x1 = (1+(Math.abs(random2.nextInt())) % 5);
                y1 = (Math.abs(random3.nextInt()) % 7);
                x2 = x1 +1;
                x3 = x2 +1;

                /*address [0] = y1;
                address [1] = x1;
                address [2] = x2;
                address [3] = x3;*/

                //chuyen doi gia tri he toa do
                yValue[0]= giaTriHoanhDo[y1];
                xValue[0] = x1;
                xValue[1] = x2;
                xValue[2] = x3;
                System.out.println(yValue[0]+xValue[0] + ","+  yValue[0]+xValue[1] +"," + yValue[0]+xValue[2]);

                //chuyen doi toa do thanh cac chuoi String:
                a = yValue[0] + String.valueOf(xValue[0]);
                b = yValue[0] + String.valueOf(xValue[1]);
                c = yValue[0] + String.valueOf(xValue[2]);
            }

            //System.out.println("Address of the ship is " + address[0] + address[1] +","+address[0]+ address[2] +"," + address[0]+ address[3]);
        }
    }
class TestDriverShipContructing {

    public static void main(String[] args) {
        ShipConstructing test1 = new ShipConstructing();
        test1.randomTheDirection();
        test1.createAddressOfTheShip();
        System.out.println(test1.a);
        System.out.println(test1.b);
        System.out.println(test1.c);

        ShipConstructing test2 = new ShipConstructing();
        test2.randomTheDirection();
        test2.createAddressOfTheShip();
        System.out.println(test2.a);
        System.out.println(test2.b);
        System.out.println(test2.c);

        // Code chong trung toa do cua hai tau
        if (!test1.equals(test2.a) && !test1.a.equals(test2.b)  && !test1.a.equals(test2.c)
                && test1.b.equals(test2.a) && test1.b.equals(test2.b) && test1.equals(test2.c)
                && test1.c.equals(test2.a) && test1.c.equals(test2.b) && test1.c.equals(test2.c)) {
            System.out.println("2 tau khac nhau va khong trung toa do");
        } else {
            System.out.println("Tau 2 co toa do va cham voi tau 1, tau 2 se bi xoa va tao moi");
            test2 = null;
            ShipConstructing test3 = new ShipConstructing();
            test3.randomTheDirection();
            test3.createAddressOfTheShip();
            test2 = test3;
            System.out.println(test2.a);
            System.out.println(test2.b);
            System.out.println(test2.c);
        }

        Scanner scan = new Scanner(System.in);
        test1.theShipIsDown = false;
        test1.theShipIsDown1 = false;
        test1.theShipIsDown2 = false;
        test1.theShipIsDown1 = false;


        while (true) {
            //here is the Address given in by player
            String playerGuess = scan.next();
            if (!playerGuess.equals(test1.a) && !playerGuess.equals(test1.b) && !playerGuess.equals(test1.c)) {
                System.out.println(" MISS !!!");
            } else {
                if (playerGuess.equals(test1.a)) {
                    test1.theShipIsDown1 = true;
                    System.out.println("HIT!!!");
                }
                if (playerGuess.equals(test1.b)) {
                    test1.theShipIsDown2 = true;
                    System.out.println("HIT!!!");
                }
                if (playerGuess.equals(test1.c)) {
                    test1.theShipIsDown3 = true;
                    System.out.println("HIT!!!");
                }
            }
            if ((test1.theShipIsDown1 = true) & (test1.theShipIsDown2 = true) & (test1.theShipIsDown3 = true)) {
                test1.theShipIsDown = true;
                System.out.println(test1.theShipIsDown);
                System.out.println("thuyen lon da bi ban ban ha:" + test1.theShipIsDown);
                break;
            } else {
                System.out.println("Hay tiep tuc !! ");
            }
        }
    }
}
/*
    public static void main(String[] args) {
        System.out.println("Game begin. You can shoot at the Location adress on map. X.Y. ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            float d = scan.nextFloat();
            String e = String.valueOf(d);
        }
    }
} */
