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

        String[] num = s.split(" \\+ ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        return num1 + num2;
    }

    public static int minus(String s) {

        String[] num = s.split(" \\- ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        return num1 - num2;
    }
}
