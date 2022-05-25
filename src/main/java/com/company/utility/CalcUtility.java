package com.company.utility;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.Operations.*;

@Slf4j
public final class CalcUtility {

    private CalcUtility() {
    }

    /**Asks user to input a number in the correct format*/
    public static Double getNumber(int i) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double number = null;
        do {
            try {
                number = Double.valueOf(reader.readLine());
                log.info("Number" + i + " is " + number);
            } catch (NumberFormatException e) {
                System.out.println("It is not a number. Try again");
                log.error("Wrong number format. {}", e.getMessage());
            } catch (IOException e) {
                System.out.println("It is not a number. Try again");
                log.error("It is not a number. {}", e.getMessage());
            }
        }
        while (number == null);

        return number;
    }

    /**Selects operation accordingly the user input */
    public static void calculate(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                add(number1, number2);
                break;
            case '-':
                subtract(number1, number2);
                break;
            case '*':
                multiply(number1, number2);
                break;
            case '/':
                divide(number1, number2);
                break;
            default:
                log.error(operator + " is an invalid operator" + System.lineSeparator());
                break;
        }
    }
}
