package com.company ;
// Task two : Second day at HACKER RANK 30 DAYS CHALLENGE
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
//Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!
//
//Input Format
//There are  lines of numeric input:
//The first line has a double,  (the cost of the meal before tax and tip).
//The second line has an integer,  (the percentage of  being added as tip).
//The third line has an integer,  (the percentage of  being added as tax).
//
//Output Format
//Print the total meal cost, where  is the rounded integer result of the entire bill ( with added tax and tip).

import java.util.Scanner ;

public class Second_Meal_Calculator {
    static void solve(double mealCost, double tipPercent, double taxPercent) {
        int totalCost = (int) Math.round( mealCost +
                                            mealCost * tipPercent / 100 +
                                            mealCost * taxPercent / 100 );
        int result2 = (int)Math.round(mealCost * (1+ tipPercent/100 + taxPercent/100));


        System.out.println (mealCost);
        System.out.println (tipPercent);
        System.out.println (taxPercent);
        System.out.println (totalCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mealCost = scanner.nextDouble();
        double tipPercent = scanner.nextInt();
        double taxPercent = scanner.nextInt();
        scanner.close();
        solve(mealCost, tipPercent, taxPercent);
    }
}
