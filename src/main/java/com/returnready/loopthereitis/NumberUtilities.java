package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++ ){
            if(i % 2 == 0){
                System.out.println(i);
                evenNumbers = evenNumbers + i;
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
                oddNumbers = oddNumbers + i;
            }
        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop; i+=step ){
            System.out.println(i*i);
            squareNumbers = squareNumbers + i * i;
        }
        return squareNumbers;

    }

    public static String getRange(int start) {
        String range = "";
        for (int i = 0; i < start; i++ ){
            System.out.println(i);
            range = range + i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";


        for (int i = start; i <stop ; i++ ){
            System.out.println(i);
            range = range + i;
        }
        return range;

    }


    public static String getRange(int start, int stop, int step) {
        String range = "";


        for (int i = start; i <stop ; i+=step){
            System.out.println(i);
            range = range + i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentNumbers = "";
        for (int i = start; i < stop; i+=step ){
            System.out.println(Math.pow(i,exponent));
            exponentNumbers = exponentNumbers + (int) Math.pow(i, exponent);

        }
        return exponentNumbers;
    }
}
