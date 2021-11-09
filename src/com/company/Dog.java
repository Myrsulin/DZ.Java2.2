package com.company;

public class Dog extends Animal  implements  Printable{
    private String dog = "Собака любит играть в мяч";

    public Dog(String name, int age, String dog) {
        super(name, age);
        this.dog = dog;
    }

    @Override
    public void print() {
        peculiarity = " 22 ";
        System.out.println(" Про собаку " + getName() + " Возраст собаки " + getAge() + " Куча " + peculiarity +
                "\n " + dog + "\n" + "-------------------------------------------------------------------");
    }
}
