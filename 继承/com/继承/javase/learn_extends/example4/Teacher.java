package com.peixinchen.javase.learn_extends.example4;

public class Teacher extends Person {
    public String name = "teacher";

    public void printWithoutName() {
        System.out.println(name);   // teacher
        System.out.println(this.name);  // teacher
        System.out.println(super.name); // person
    }

    public void print(String name) {
        System.out.println(name);   // 实参的值，这里是 local
        System.out.println(this.name);  // teacher
        System.out.println(super.name); // person
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", name='" + super.name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();

        System.out.println(t);
    }
}
