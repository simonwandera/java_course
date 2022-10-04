package com.calculator_and_datatypes;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        /*
        * Simple Calculator
        * Author: Simon Wandera
        *
        * OPERATIONS SUPPORTED
        * +,-, /, *,
        *
        * Values supported
        * int, float
        *
        * Decimal places 4
        * */

        Boolean employed = false;

        Byte x = 127;

        Short num = 800;
        int IntNum = 10000000;
        Long LongNum = 12700000000000000L;
        Float FloatNum = 2.345000500000008900000007800f;

        System.out.println("numss = " + num);

        addIntegers(2, 4);
        subtractIntegers(3, 3);
        divideIntegers(10,3);
        multiplyIntegers(23, 4);


           }
//           ========================INTEGERS=========================
    private static void addIntegers(int a, int b){
        System.out.println("IntSum = " + (a + b));
    }
    private static void subtractIntegers(int a, int b) {
        if(a>b){
            System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
    }else {
            System.out.println("The difference of " + a + " and " + b + " is " + (b - a));
        }
    }

    public static void divideIntegers(int a, int b){

        System.out.printf("\nDivision of %d and %d : %.4f", a, b,  ((float)(a)/(float)(b)));
    }

    public static void multiplyIntegers(int a, int b){
        System.out.printf("\nMultiplication of %d and %d is %.4f", a, b, ((float)(a)/(float)(b)));
    }

    //           ========================FLOATS=========================

    private static void addFloats(float a, float b){
        System.out.println("FloatSum = " + (a + b));
    }

    private static void subtractFloats(float a, float b) {
        if(a>b){
            System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        }else {
            System.out.println("The difference of " + a + " and " + b + " is " + (b - a));
        }
    }

    public static void divideFloats(float a, float b){
        System.out.printf("\nDivision of %d and %d : %.4f", a, b,  (float)(a/b));
    }

    public static void multiplyFloats(float a, float b){
        System.out.printf("\nMultiplication of %d and %d is %.4f", a, b, (a*b));
    }
}