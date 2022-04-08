package com.company;

import static com.company.Utility.writeToFile;

public class Operations {
    static String s = "\r\n-------------------------------------\r\n";

    public static String add(double number1, double number2) {
        double result = number1 + number2;
        writeToFile(number1 + " + " + number2 + " = " + result + "\r\n" + s);
        return number1 + " + " + number2 + " = " + result + s;
    }

    public static String subtract(double number1, double number2) {
        double result = number1 - number2;
        writeToFile(number1 + " - " + number2 + " = " + result + "\r\n" + s);
        return number1 + " - " + number2 + " = " + result + s;
    }

    public static String multiplicate(double number1, double number2) {
        double result = number1 * number2;
        writeToFile(number1 + " * " + number2 + " = " + result + "\r\n" + s);
        return number1 + " * " + number2 + " = " + result + s;
    }

    public static String divide(double number1, double number2) {
        double result;
        try {
            result = number1 / number2;
            writeToFile(number1 + " / " + number2 + " = " + result + "\r\n" + s);
            return number1 + " / " + number2 + " = " + result + s;
        } catch (ArithmeticException e) {
            writeToFile(number1 + " / " + number2 +
                    "\n The divisor cant be 0\r\n\r\n");
            return "The divisor cant be 0" + s;
        }
    }
}
