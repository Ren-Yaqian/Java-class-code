package com.peixinchen.javase.learn_extends.example6.other_package;

import com.peixinchen.javase.learn_extends.example6.SomeClass;

public class AClass {
    public static void main(String[] args) {
        SomeClass o = new SomeClass();
        o.a = 10;
        //o.b = 10;   // protected
        //o.c = 10;   // package-level / default-level
        //o.d = 10;   // private
    }
}
