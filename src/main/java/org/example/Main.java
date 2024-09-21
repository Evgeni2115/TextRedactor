package org.example;

import java.util.Scanner;

public class Main extends TextProcessor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputStr = console.nextLine();
        System.out.println(textModifier(inputStr));
    }

    public static String textModifier(String inputStr) {
        inputStr = removeExtraSpaces(inputStr);
        inputStr = swapCharactersAroundDash(inputStr);
        inputStr = replacePlusWithExclamation(inputStr);
        inputStr = removeDigitsAndCalculateSum(inputStr);
        return inputStr;
    }
}