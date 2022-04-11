package com.cc.java;

public class Cat {
    

    private String name;
    private String forColor;
    private int age;

    public Cat(String name, String forColor, int age) {
        this.name = name;
        this.forColor = forColor;
        this.age = age;
    }

    public String getName() {
        if (hasPermission()) {
            return name;
        } else {
            return "No Permission!";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForColor() {
        return forColor;
    }

    public void setForColor(String forColor) {
        this.forColor = forColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private boolean hasPermission() {
        return false;
        
    }




}
