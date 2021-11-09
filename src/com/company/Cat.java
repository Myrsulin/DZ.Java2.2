package com.company;

public class Cat extends Animal implements Printable{
    private String cat = " Кот любит играть мячик";

    public Cat(String name, int age, String cat) {
        super(name, age);
        this.cat = cat;
    }



    @Override
    public void print() {
        peculiarity = " 22 ";
        System.out.println( " Про кота " + getName() + " Возраст кота " + getAge() + " лет "+ peculiarity +
                "\n " + cat + "\n" + "-------------------------------------------------------------------");
    }
}
