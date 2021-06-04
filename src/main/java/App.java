/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String firstNumString = myApp.readFirstNum();
        String secondNumString = myApp.readSecondNum();
        Integer firstNum = myApp.convertFirstNum(firstNumString);
        Integer secondNum = myApp.convertSecondNum(secondNumString);
    }

    private String readFirstNum() {
        System.out.print("What is the first number? ");
        String firstNum = in.nextLine();
        return firstNum;
    }

    private String readSecondNum() {
        System.out.print("What is the second number? ");
        String secondNum = in.nextLine();
        return secondNum;
    }

    private Integer convertFirstNum(String firstNumString) {
        int firstNum = Integer.parseInt(firstNumString);
        return firstNum;
    }

    private Integer convertSecondNum(String secondNumString) {
        int secondNum = Integer.parseInt(secondNumString);
        return secondNum;
    }
}
