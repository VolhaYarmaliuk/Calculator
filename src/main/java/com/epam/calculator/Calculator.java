package com.epam.calculator;

import java.util.Scanner;

/**
 * Created by Olga_Yarmaliuk on 9/7/2016.
 */

public class Calculator {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Manipulation manipulation = new Manipulation();
        double answer = 0;
        double inputA, inputB;
        char operator;
        boolean done = false;

        try {
            while (done == false) {
                System.out.print("Please enter your manipulation example (5 + 5) and press Enter: ") ;
                inputA = sc.nextDouble();
                operator = sc.next().charAt(0);
                inputB = sc.nextDouble();

                switch (operator) {
                    case '+':
                        answer = manipulation.add(inputA, inputB);
                        break;
                    case '-':
                        answer = manipulation.subtract(inputA, inputB);
                        break;
                    case '*':
                        answer = manipulation.multiply(inputA, inputB);
                        break;
                    case '/':
                        answer = manipulation.divide(inputA, inputB);
                        break;
                    case '^':
                        answer = manipulation.power(inputA, inputB);
                        break;
                    default:
                        System.out.println("Invalid operator");

                }
                System.out.println(answer);
            }
        } catch(Exception e){
        System.out.println("Invalid value!");
    }

    }
}
