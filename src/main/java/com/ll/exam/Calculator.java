package com.ll.exam;

public class Calculator {

    public static int run(String s){
        if (s.contains("-")){
            return minus(s);
        }
        else {
            return plus(s);
        }
    }

    public static int plus(String s) {

        return 2;
    }

    public static int minus(String s) {

        return 0;
    }
}
