package com.company;

abstract class Bike {
    Bike() {
        System.out.println("Bike is created.");
    }
    abstract void run();
    void changeGear() {
        System.out.println("gear Changed.");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("running safely.");
    }
}
class TestAbs {
    public static void main(String[] args) {
        Bike ob = new Honda();
        ob.run();
        ob.changeGear();
    }
}
