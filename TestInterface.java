package com.company;

interface TestInterface {
    void show();
}
interface Show2{
    public void showOut();
}

class A implements TestInterface,Show2{
    public void show(){
        System.out.println("Hello World.");
    }
    public void showOut(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        ob.showOut();
    }
}
