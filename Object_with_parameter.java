package com.company;

public class Test {
    void Testmethod(int a, int b){
        System.out.println(a+" "+b);
    }

    void Testmethod(int c, int d, int e){
        System.out.println(c+" "+d+" "+e);
    }
    void Testmethod(int c, int d, int e, int f){
        System.out.println(c+" "+d+" "+e+" "+f);
    }
    public static void main(String[] args){
        Test obj= new Test();
        obj.Testmethod(10,20);
        obj.Testmethod(30,40,50);
        obj.Testmethod(60,70,80,90);

    }
}
