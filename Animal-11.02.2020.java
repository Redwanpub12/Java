package com.company;

public class Animal {
    String color = "White";


    Animal() {
        System.out.println("This is Super Constructor");
    }

    void CallMethod() {
        System.out.println("This is Super Method");

    }


}

class Dog extends Animal {
    String color = "Black";


    Dog() {
        super();
    }

    void AnimalColor() {
        System.out.println("Dog Color is " + super.color);
    }

    void MethodTest() {
        super.CallMethod();
    }


}


class Output {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.AnimalColor();
        obj.MethodTest();
    }
}
