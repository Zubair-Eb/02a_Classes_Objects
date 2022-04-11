package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Cat cat = new Cat("PussyCat", "White", 20);
       
       output("Name: \t\t" + cat.getName());
       output("Fellfarbe: \t" + cat.getForColor());
       output("Alter: \t\t" + cat.getAge());

       output("------------------------");

       Cat cat1 = new Cat("Tom", "Black", 25);

       output("Name: \t\t" + cat1.getName());
       output("Fellfarbe: \t" + cat1.getForColor());
       output("Alter: \t\t" + cat1.getAge());

       output("------------------------");


 /*    output("Blick von aussen: " +cat);
       output("Blick von innen: " + cat.tellYourAddress());
       output("-------------------------------------------");

       Cat cat1 = new Cat();
       output("Blick von aussen: " +cat1);
       output("Blick von innen: " + cat1.tellYourAddress());
       output("-------------------------------------------");
*/




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

