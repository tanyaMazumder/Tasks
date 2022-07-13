package tasks.HometaskLoops.HomeTasksVariables;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, / or %");
        operator = input.next().charAt(0);

        System.out.println("Enter first number OR for Percentage, Enter the total, or max, score:");
        number1 = input.nextDouble();

        System.out.println("Enter second number OR for Percentage, Enter the score obtained");
        number2 = input.nextDouble();

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
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case '%':
                result = (number2 * 100/ number1);
                System.out.println(number2 + " % " + number1 + " = " + result +"%");
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
