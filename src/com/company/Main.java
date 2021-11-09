package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Cow").print();


    }
    private static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Cat":
                printable = new Cat("Barsik", 9, "Cat");
                break;
            case "Dog":
                printable = new Dog("Bobik", 15, "Dog");
                break;
            case "Cow":
                printable = new Cow("Mymy", 30, "Cow");
                break;
            default:
                return printable;
        }
        return printable;



    }
}
