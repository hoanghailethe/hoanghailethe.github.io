package com.company;

public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    int x = 0;

    void StartGame() {
        while (x<5) {
            x = x+ 1;

            p1.guess();
            p2.guess();
            p3.guess();

            int soNgauNhienTrungThuong = (int) (Math.random() * 10);

            boolean nguoi_choi_1_thang = false;
            boolean nguoi_choi_2_thang = false;
            boolean nguoi_choi_3_thang = false;

            System.out.println ("     ");
            System.out.println ("Day la luot choi thu " + x);
            System.out.println("Hay du doan 1 con so tu 0 den 9");
            System.out.println("Nguoi choi thu 1 du doan con so la " + p1.guessnumber);
            System.out.println("Nguoi choi thu 2 du doan con so la " + p2.guessnumber);
            System.out.println("Nguoi choi thu 3 du doan con so la " + p3.guessnumber);
            System.out.println("Con so trung thuong la "+ soNgauNhienTrungThuong);

            if ((p1.guessnumber == soNgauNhienTrungThuong) || (p2.guessnumber == soNgauNhienTrungThuong) || (p3.guessnumber == soNgauNhienTrungThuong)) {
                System.out.println("Chung ta co nguoi chien thang");
                if (p1.guessnumber == soNgauNhienTrungThuong) {
                    nguoi_choi_1_thang = true;
                }
                if (p2.guessnumber == soNgauNhienTrungThuong) {
                    nguoi_choi_2_thang = true;
                }
                if (p3.guessnumber == soNgauNhienTrungThuong) {
                    nguoi_choi_3_thang = true;
                }
                System.out.println("nguoi choi thu 1 thang " + nguoi_choi_1_thang);
                System.out.println("Nguoi choi thu 2 thang " + nguoi_choi_2_thang);
                System.out.println("Nguoi choi thu 3 thang " + nguoi_choi_3_thang);
            }
            else {
                System.out.println(" Chưa có người chiến thắng");
            }
        }
    }
}
class Player {
        int guessnumber = 0;
        void guess() {
            guessnumber = (int) (Math.random() * 10);
        }
}

class GameLauncher {
        public static void main(String[] args) {
            GuessGame game = new GuessGame();
            game.StartGame();
        }
    }
