package com.company;

public class CarModel {
// Instance Variables
    String name;
    int maxSpeed = 500;
    int minSpeed = 0;
    int version = 0;

    double weight = 4000.344;
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 120;

    int numberOfPeopleInCar = 1;

    boolean isTheCarOn = false;


    public void upgradingCar() {
        maxSpeed = maxSpeed + 123;
        weight = weight + 300;
        version++;
    }

    public void printVariables() {
        System.out.println(name + " version " + version);
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("Min Speed:" + minSpeed);
        System.out.println("Weight:" + weight);
        System.out.println("The Car is on:" + isTheCarOn);
        System.out.println("Number of People in the Car:"+ numberOfPeopleInCar);
    }

    public void getInCar () {
        numberOfPeopleInCar++;
    }

    public void getOutCar () {
        numberOfPeopleInCar--;
    }

    public CarModel (int customMaxSpeed, double customWeight) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
    }

    public double maxMileTillNextFillUp () {
        return maxFuel * mpg;
    }

    public double mileTillOutOFGas () {
        return currentFuel * mpg ;
    }

    public void solve () {
        double gasUsedFromLastFilledUp = maxFuel - currentFuel;
        System.out.println("Gas used from last filled up:" + gasUsedFromLastFilledUp);
    }
    public static void main (String[] args) {
        //buy another Car
        CarModel christmasPresent = new CarModel(270,3700);
        christmasPresent.name = "Angel XIX ";
        System.out.println("I've bought a Christmas gift for mom, branch new car");

        //Upgrade her
        christmasPresent.upgradingCar();
        christmasPresent.isTheCarOn = true;

        //People get in the car
        christmasPresent.getInCar();
        christmasPresent.getInCar();

        christmasPresent.printVariables();
        christmasPresent.solve();
    }
}