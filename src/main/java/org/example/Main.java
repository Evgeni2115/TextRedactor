package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputStr = console.nextLine();
        System.out.println(textModifier(inputStr));
    }

    public static String textModifier(String inputStr) {
        StringBuilder result = new StringBuilder();
        boolean lastWasSpace = false;
        for (char c : inputStr.toCharArray()) {
            if (c == ' ') {
                if (!lastWasSpace) {
                    result.append(c);
                    lastWasSpace = true;
                }
            } else {
                result.append(c);
                lastWasSpace = false;
            }
        }

        StringBuilder swappedResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            char current = result.charAt(i);

            if (current == '-' && i > 0 && i < result.length() - 1) {
                char left = result.charAt(i - 1);
                char right = result.charAt(i + 1);
                swappedResult.setCharAt(swappedResult.length() - 1, right);
                swappedResult.append(left);
                i++;
            } else {
                swappedResult.append(current);
            }
        }

        String replacedResult = swappedResult.toString().replace('+', '!');

        StringBuilder finalResult = new StringBuilder();
        int digitSum = 0;
        for (char c : replacedResult.toCharArray()) {
            if (Character.isDigit(c)) {
                digitSum += Character.getNumericValue(c);
            } else {
                finalResult.append(c);
            }
        }
        if (digitSum > 0) {
            finalResult.append(" ").append(digitSum);
        }
        return finalResult.toString();
    }
}