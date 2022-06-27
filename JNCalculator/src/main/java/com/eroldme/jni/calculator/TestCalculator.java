package com.eroldme.jni.calculator;

/**
 * A simple JNI Test Calculator.
 *
 */
public class TestCalculator {
    public static void main( String[] args ) {
        System.out.println("A simple JNI calculator.");

        Calculator calculator = new Calculator();

        String fmt = "%-15s : %.2f"; // operation, value

        System.out.println(String.format(fmt, "Add", calculator.add(2.5, 5.65)));
        System.out.println(String.format(fmt, "Subtract", calculator.subtract(2.5, 5.65)));
        System.out.println(String.format(fmt, "Divide", calculator.divide(2.5, 5.65)));
        System.out.println(String.format(fmt, "Multiply", calculator.multiply(2.5, 5.65)));
    }
}
