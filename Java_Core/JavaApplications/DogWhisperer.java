package com.company;

public class DogWhisperer {
    /*This is the Programme I write to control my Dogs, I have three Robot dogs which have functions: bark, chase cat and eat
    So how can I control them by name and orders in the remote I have.
    Also I will add one more important function: Attack illegal broke in Strangers.
     */
    public static void main(String[] args) {
        //Creating a dog array
        Dog [] myDogs = new Dog[3];

        //Put some dogs in the array
        myDogs [0] = new Dog();
        myDogs [1] = new Dog();
        myDogs [2] = new Dog();

        //Give my dogs their names
        myDogs [0].name = "Stacy";
        myDogs [1].name = "James";
        myDogs [2].name = "Tiger";

        //give my dogs some orders;
        System.out.println("I have three dogs, they are " + myDogs[1].name + " and " + myDogs[0].name + " and " + myDogs[2].name);
        myDogs[0].bark();
        myDogs[1].chaseCat();
        myDogs[2].attackStrangers();

        int x = 0;
        while ( x < myDogs.length) {
            System.out.print(myDogs[x].name);
            System.out.println(" is a good dog, it is loyal and it protects the Master ");
            x++;
        }
    }
}

class Dog {
    String name;
    public void bark () {
        System.out.println( name + " says Ruff Ruff Ruff ");
    }
    public void chaseCat () {
        System.out.println( name + " is chasing a Cat ");
    }
    public void attackStrangers () {
        System.out.println( name + " is attacking some dangerous strangers as Master's order");
    }
}

