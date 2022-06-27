package com.eroldme.jni.calculator;

/**
 * JNI Calculator.
 */
public class Calculator {

    static {
        System.loadLibrary("JNCalculator");
    }

    public Calculator() {}

    public native double add(double first, double second);

    public native double subtract(double first, double second);

    public native double divide(double first, double second);

    public native double multiply(double first, double second);
}

// -Djava.library.path=../JNCalculator-Cpp/output