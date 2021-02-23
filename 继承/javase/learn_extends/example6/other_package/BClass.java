package com.peixinchen.javase.learn_extends.example6.other_package;

import com.peixinchen.javase.learn_extends.example6.SomeClass;

public class BClass extends SomeClass {
    public void method() {
        // 由于 BClass 继承了 SomeClass，并且这里处于普通方法中
        // 所以，可以有权限访问 protected 修饰的属性/方法

        super.a = 10;
        super.b = 10;   // protected
        //super.c = 10;
        //super.d = 10;
    }

    public static void main(String[] args) {
        SomeClass o = new SomeClass();
        o.a = 10;
        // o.b = 10; protected
        // o.c = 10; default-level
        // o.d = 10; private
    }
}
