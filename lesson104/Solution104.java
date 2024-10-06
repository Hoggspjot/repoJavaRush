package com.javarush.task.pro.task09.task0906;


import java.util.regex.Pattern;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 54321;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1101010000110001";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <=0) {
            return "";
        }
        int x = 0;
        String str ="";
        while (decimalNumber != 0){
            x = (decimalNumber % 2) + x;
            str = x + str;
            x = 0;
            decimalNumber = decimalNumber / 2;
        }

        return str;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || (binaryNumber.trim().isEmpty())){
            return 0;
        }
        int y = binaryNumber.length();
        int x = 0;
        for (int i = 0; i < y; i++) {
            String strNum = binaryNumber.substring(binaryNumber.length() - (i+1), binaryNumber.length() - i );
            int a = Integer.parseInt (strNum);
            x = (int) (x + a * Math.pow(2, i));
        }
        return x;
    }
}
