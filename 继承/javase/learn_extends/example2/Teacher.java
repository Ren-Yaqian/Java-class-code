package com.peixinchen.javase.learn_extends.example2;

public class Teacher extends Person {
    public Teacher() {
        // super();
    }

    public Teacher(String name) {
        // super();
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Hello");
    }
}
