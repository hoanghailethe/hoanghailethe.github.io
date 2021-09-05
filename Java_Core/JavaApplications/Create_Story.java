package com.company;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Create_Story {
    String name1, name2;
    String verb1, verb2;
    String story;
    Scanner scan = new Scanner(System.in);

    //Getter
    public String getName1 () {
        return this.name1;
    }
    public String getName2 () {
        return this.name2;
    }
    public String getVerb1 () {
        return this.verb1;
    }
    public String getVerb2 () {
        return this.verb2;
    }
    public String getStory () {
        return this.story;
    }
 /*   public String getAdj1 () {
        return this.adj1;
    }
    public String getAdj2 () {
        return this.adj2;
    }
*/
    //Setter
    public void setName1 (String newName1) {
        this.name1 = newName1;
    }

    public void setName2 (String newName2) {
        this.name2 = newName2;
    }
    public void setVerb1 (String newVerb1) {
        this.verb1 = newVerb1;
    }
    public void setVerb2 (String newVerb2) {
        this.verb2 = newVerb2;
    }

    // Put it all together and print
    public void createStory () {
        int x = (int) (Math.random() *10);
        if ( (x % 2) == 0) {
            story = ( getName1() + " is a wonderful dog and she likes to " + getVerb1() + " stranger!. One day, there is a " +
                    "stranger names " + getName2() +
                    " comes to the house. And She " + getVerb2() + " with the dog. And they lives happily together!");
            this.getStory ();
            System.out.println(this.getStory());
        } else {
            story = (getName1() + " is a naughty cat, she likes to " + getVerb2() + " with other animals! One day there is a mouse called "+ getName2() +" see it. " +
                    "The two creatures stare at each others. And then they runs straight to" +
                    " their opponent and start to "+ getVerb1() + " very loudly");
            System.out.println(this.getStory());
        }
    }

    //Give some Input Data
    public void newName1 () {
        System.out.println ("Give a name :");
        setName1(scan.nextLine());
    }
    public void newName2 () {
        System.out.println ("Give a name :");
        setName2(scan.nextLine());
    }
    public void newVerb1 () {
        System.out.println ("Give a Verb :");
        setVerb1(scan.nextLine());
    }
    public void newVerb2 () {
        System.out.println ("Give a Verb :");
        setVerb2(scan.nextLine());
    }

    public void playIt () {
        newName1();
        newName2();
        newVerb1();
        newVerb2();
    }
    public static void main(String[] args) {
        Create_Story one = new Create_Story();
        Create_Story two = new Create_Story();

        System.out.println ("Give me some required Input Data, in return, I will give you back an Interesting Story ");
        System.out.println ("now let begin the first Story");
        one.playIt();
        one.createStory();

        System.out.println ("Let's do it again");
        two.playIt();
        two.createStory();
    }
}
