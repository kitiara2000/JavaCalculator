package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.Utility.writeToFile;
import static com.company.Operations.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        do {
            double number1, number2;
            System.out.println("Please enter the 1st number:");
            try {
                number1 = Double.valueOf(reader.readLine());
                writeToFile("1st number is " + number1+ "\n\r");
            } catch (NumberFormatException e) {
                System.out.println("It is not a number.");
                input = "Y";
                continue;
            }

            System.out.println("Choose an operator: +, -, * or /");
            char operator = reader.readLine().charAt(0);
            writeToFile("Operator is " + operator + "\n\r");

            System.out.println("Enter the 2nd number");
            try {
                number2 = Double.valueOf(reader.readLine());
                writeToFile("2nd number is " + number2 + "\n\r");
            } catch (NumberFormatException e) {
                System.out.println("It is not a number.");
                input = "Y";
                continue;
            }

            switch (operator) {
                case '+':
                    System.out.println(add(number1, number2));
                    break;
                case '-':
                    System.out.println(subtract(number1, number2));
                    break;
                case '*':
                    System.out.println(multiplicate(number1, number2));
                    break;
                case '/':
                    System.out.println(divide(number1, number2));
                    break;
                default:
                    System.out.println("Invalid operator");
                    writeToFile(operator + " is an invalid operator\r\n");
                    break;
            }

            System.out.println("Continue? Y/N");
            input = reader.readLine();
        }
        while (input.equalsIgnoreCase("Y"));

        System.out.println("Program terminated");
        writeToFile("Program terminated on user request\r\n");
        reader.close();
    }
}
