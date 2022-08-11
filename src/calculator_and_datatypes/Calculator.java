public class Calculator {

    public static void main(String[] args) {

        /*
         * Simple Calculator
         * Author: Simon Wandera
         *
         *
         * OPERATIONS SUPPORTED
         * +,-, /, *,
         *
         * Values supported
         * int, float
         *
         * Decimal places 4
         * */

//        integers
        addIntegers(2, 4);
        subtractIntegers(3, 3);
        divideIntegers(10,3);
        multiplyIntegers(23, 4);

//        floats
        addFloats(101.1234f, 101.12345F);
        subtractFloats(12.34f, 0.000034f);
        divideFloats(12.34f, 0.000034f);
        multiplyFloats(12.34f, 0.000034f);

//        Short
//        addShort((short) 800, (short) 360);
//        subtractShort((short) 800, (short) 360);
//        divideShort((short) 800, (short) 360);
//        multiplyShort((short) 800, (short) 360);

        /*
         * variables supported
         * operators supported
         * */


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

        System.out.printf("\nDivision of %d and %d : %.4    f", a, b,  ((float)(a)/(float)(b)));
    }

    public static void multiplyIntegers(int a, int b){
        System.out.printf("\nMultiplication of %d and %d is %.4f", a, b, ((float)(a)/(float)(b)));
    }

    //           ========================FLOATS=========================

    private static void addFloats(float a, float b){
        System.out.println("\nSum of floats i = " + (float)(a + b));
    }
    private static void subtractFloats(float a, float b) {
        if(a>b){
            System.out.printf("\nThe difference of %f and %f is %.4f ", a, b, (a - b));
        }else {
            System.out.printf("\nThe difference of %f and %f is %.4f ", a, b, (b - a));
        }
    }
    public static void divideFloats(float a, float b){

        System.out.printf("\nDivision of %f and %f is %.4f", a, b,  (a/b));
    }

    public static void multiplyFloats(float a, float b){
        System.out.printf("\nMultiplication of %f and %f is %.4f", a, b, (a*b));
    }




}
