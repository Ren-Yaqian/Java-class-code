package com.peixinchen.javase.learn_extends.example2;

public class Main {
    public static void main(String[] args) {
        学生用门镜卡 c1 = new 学生用门镜卡();
        c1.进出大门();
        c1.进出宿舍门();

        老师用门镜卡 c2 = new 老师用门镜卡();
        c2.进出大门();
        c2.进出办公室();
    }
}
