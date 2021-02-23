package com.peixinchen.javase.learn_extends.example5;

public class Test {
    public static void main(String[] args) {
        老师专用门禁卡 c1 = new 老师专用门禁卡();

        学生专用门禁卡 c2 = new 学生专用门禁卡();

        c1.进出大门();  // 在子类中找到了定义的方法了，所以执行子类的

        c2.进出大门();  // 没有在子类中找到，但在父类中找到了，所以执行父类的
    }
}
