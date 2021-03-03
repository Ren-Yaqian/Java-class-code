package com.peixinchen.javase.learn_extends.example6;

public class SomeClass {
    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {
        SomeClass o = new SomeClass();
        // 同一个类内部
        o.a = 10;
        o.b = 10;
        o.c = 10;
        o.d = 10;
    }
}
