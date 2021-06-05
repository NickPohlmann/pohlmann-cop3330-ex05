/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String firstNumString = myApp.readNum("first");
        String secondNumString = myApp.readNum("second");
        int firstNum = myApp.convertNumString(firstNumString);
        int secondNum = myApp.convertNumString(secondNumString);
        int sum = myApp.computeSum(firstNum, secondNum);
        int difference = myApp.computeDifference(firstNum, secondNum);
        int product = myApp.computeProduct(firstNum, secondNum);
        int quotient = myApp.computeQuotient(firstNum, secondNum);
        String outputString = myApp.generateOutputString(firstNum, secondNum, sum, difference, product, quotient);
        myApp.printOutput(outputString);
    }
    private String readNum(String orderNum) {
        System.out.print("What is the " + orderNum + " number? ");
        String num = in.nextLine();
        return num;
    }

    private Integer convertNumString(String numString) {
        int num = Integer.parseInt(numString);
        return num;
    }

    private Integer computeSum(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum;
    }

    private Integer computeDifference(int firstNum, int secondNum) {
        int difference = firstNum - secondNum;
        return difference;
    }

    private Integer computeProduct(int firstNum, int secondNum) {
        int product = firstNum * secondNum;
        return product;
    }

    private Integer computeQuotient(int firstNum, int secondNum) {
        int quotient = firstNum / secondNum;
        return quotient;
    }

    private String generateOutputString(int firstNum, int secondNum, int sum, int difference, int product, int quotient) {
        return String.format("%d + %d = %d \n%d - %d = %d \n%d * %d = %d\n%d / %d = %d", firstNum, secondNum, sum, firstNum, secondNum, difference, firstNum, secondNum, product, firstNum, secondNum, quotient);
    }

    private void printOutput(String outputString) { System.out.println(outputString); }
}


