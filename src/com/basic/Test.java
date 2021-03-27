package com.basic;

public class Test {

    public void recursive(int number){
        if(number == 0)
            return;
        System.out.println("before making recursive call");
        recursive(number-1);
        System.out.println("this is after returning recrusive call");
    }

    public int factorial(int n){
        int result = -1;
        //base condition
        if(n == 1)
            return n;
        System.out.println("incoming call "+n);
        int value = factorial(n-1);
        result = value * n;
        System.out.println("leaving call "+result);


        return result;
    }

    public static void main(String[] args) {
        System.out.println("this is for the basic stuff");
        //new Test().recursive(3);
        int output = new Test().factorial(5);
        System.out.println(output);

    }
}
