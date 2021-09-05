package com.company;

public class WhoWhatWhen {
    public static void main(String[] args) {
        String [] list1 = {"Anh","Lam","Quang","Truc","Hai","Ha"};
        String [] list2 = {"dog","cat","fish","clock","car","tie"};
        String [] list3 = {"now","21/4","next year","next month"};

        int leng1 = list1.length;
        int leng2 = list2.length;
        int leng3 = list3.length;

        int ran1 = (int) (Math.random()*leng1);
        int ran2 = (int) (Math.random()*leng2);
        int ran3 = (int) (Math.random()*leng3);

        System.out.print (list1[ran1] +" needs a " +list2[ran2] + " at this time: " + list3[ran3]);
    }
}
