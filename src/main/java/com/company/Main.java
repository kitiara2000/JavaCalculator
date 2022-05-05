package com.company;

import com.company.utility.CalcUtility;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.utility.CalcUtility.getNumber;

@Slf4j
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        do {
            double firstNumber, secondNumber;
            System.out.println("Please enter the 1st number:");
            firstNumber = getNumber(1);

            System.out.println("Choose an operator: +, -, * or /");
            char operator = reader.readLine().charAt(0);
            log.info("Operator is " + operator);

            System.out.println("Enter the 2nd number");
            secondNumber = getNumber(2);

            CalcUtility.calculate(firstNumber, secondNumber, operator);

            System.out.println("Continue? Y/N");
            input = reader.readLine();
        }
        while (input.equalsIgnoreCase("Y"));

        log.info("Program terminated on user request" + System.lineSeparator());
        reader.close();
    }
}
