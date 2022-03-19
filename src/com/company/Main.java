package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        do {
            System.out.println("Please enter the 1st number:");
            double number1, number2, result;
            number1 = Double.valueOf(reader.readLine());
            System.out.println("Choose an operator: +, -, * or /");
            char operator = reader.readLine().charAt(0);
            System.out.println("Enter the 2nd number");
            number2 = Double.valueOf(reader.readLine());

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                    } else
                        System.out.println("The divisor cant be 0");
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.println("Continue? Y/N");
            input = reader.readLine();
        }
        while (input.equalsIgnoreCase("Y"));

        System.out.println("Program terminated");
        reader.close();
    }
}
