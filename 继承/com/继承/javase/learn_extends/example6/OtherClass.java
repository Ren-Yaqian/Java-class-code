package com.peixinchen.javase.learn_extends.example6;

public class OtherClass {
    public static void main(String[] args) {
        SomeClass o = new SomeClass();

        o.a = 10;
        o.b = 10;
        o.c = 10;
        // o.d 无法被访问，因为 d 的访问修饰符是 private
    }
}
