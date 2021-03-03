package com.peixinchen.javase.learn_extends.example1;

// 1. 子类的构造方法中，必须调用父类的构造方法（隐式/显式）
// 2. 调用的关键字是 super，必须是第一条语句
// 3. 符合语法，调用的构造方法在父类中得存在
public class Teacher extends Person {
    public String course = "JavaSE";

    public Teacher() {
        super("陈沛鑫");    // 调用父类的构造方法
                                  // 调用父类的无参构造方法
    }
}
