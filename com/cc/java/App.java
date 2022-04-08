package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Cat cat = new Cat("PussyCat", "White", 20);
       
       output("Name: \t\t" + cat.name);
       output("Fellfarbe: \t" + cat.forColor);
       output("Alter: \t\t" + cat.age);

       output("------------------------");

       Cat cat1 = new Cat("Tom", "Black", 25);

       output("Name: \t\t" + cat1.name);
       output("Fellfarbe: \t" + cat1.forColor);
       output("Alter: \t\t" + cat1.age);

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

