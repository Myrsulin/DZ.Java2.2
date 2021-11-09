package com.company;

public class Cow extends Animal implements Printable {
    private String cow = " Кот любит играть мячик";


    public Cow(String name, int age, String cow) {
        super(name, age);
        this.cow = cow;
    }




    @Override
    public void print() {
        peculiarity = " 25 ";
        System.out.println(" Про корову " + getName() + " Возраст быка " + getAge() + " Бык " + peculiarity +
                "\n " + cow + "\n" + "-------------------------------------------------------------------");
    }
}
