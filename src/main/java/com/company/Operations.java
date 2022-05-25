package com.company;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Operations {

    public static String add(double number1, double number2) {
        double result = number1 + number2;
        String logMessage
                = number1 + " + " + number2 + " = " + result + System.lineSeparator();
        log.info(logMessage);
        return logMessage;
    }

    public static String subtract(double number1, double number2) {
        double result = number1 - number2;
        String s = number1 + " - " + number2 + " = " + result + System.lineSeparator();
        log.info(s);
        return s;
    }

    public static String multiply(double number1, double number2) {
        double result = number1 * number2;
        String s = number1 + " * " + number2 + " = " + result + System.lineSeparator();
        log.info(s);
        return s;
    }

    public static String divide(double number1, double number2) {
        double result;
//        try {
            result = number1 / number2;
            String s = number1 + " / " + number2 + " = " + result + System.lineSeparator();
            log.info(s);
            return s;
//        } catch (ArithmeticException e) {
//            log.error(number1 + " / " + number2 + System.lineSeparator() +
//                    "The divisor cant be 0" + System.lineSeparator());
//            return "The divisor cant be 0";
//        }
    }
}
