package com.company;

public class Rating_Movie {
    // This is Warm-up Writing Exercise on 11.24.2020.
    // I am serious on becoming a software developer.
    // IT Director, Software Development Director, Start-up founder
    Movie one = new Movie();
    Movie two = new Movie();
    Movie three = new Movie();

    void showingFilmInfo() {
        one.name = "Em la ba noi cua anh";
        one.genre ="Tinh cam, hai huoc";
        one.rating =4;

        two.name ="Cuop bien Caribean";
        two.rating =4;
        two.genre ="hanh dong";

        three.name ="Mat biec";
        three.rating =2;
        three.genre ="tinh cam";

        two.playIt();
        one.movieReviewInfo();
        two.movieReviewInfo();
        three.movieReviewInfo();
    }
}
class Movie {
        String name;
        String genre;
        int rating;

        void playIt() {
            System.out.println(" Playing the movie "+ name);
        }

        void movieReviewInfo() {
            System.out.println("______________");
            System.out.println(name);
            System.out.println(genre);
            System.out.println(rating);
        }
}

class MovieTestDrive {
        public static void main(String[] args) {
            Rating_Movie firstTry = new Rating_Movie();
            firstTry.showingFilmInfo();
            }
        }

