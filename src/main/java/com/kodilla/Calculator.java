package com.kodilla;

public class Calculator
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(7.3, 4.5));
        System.out.println(calculator.subtraction(5.6, 2.3));
    }

    public double addition (double x, double y)
    {
        return x+y;
    }

    public double subtraction (double x, double y)
    {
        return x-y;
    }

}
