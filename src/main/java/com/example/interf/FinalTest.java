package com.example.interf;

interface A{
    static final String str = "a";
}

abstract class B{
    B(){
        System.out.println("InitialLized");
    }
    static final String str = "b";
}

public class FinalTest extends B{
    public static void main(String[] args) {
        System.out.println(str);
    }
}
