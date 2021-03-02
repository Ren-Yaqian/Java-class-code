package com.peixinchen.javase.learn_extends.example1;

public class Main {
    public static void main(String[] args) {
        猫 cat = new 猫();

        cat.卖萌();

        // 由于猫 is 逮老鼠动物，猫具备 走、跑、逮老鼠的能力
        cat.走();
        cat.跑();
        cat.逮老鼠();

        // 由于猫 is 动物，猫具备 叫的能力
        cat.叫();
    }
}
