package org.example;

public class TextProcessor {

    protected static String removeExtraSpaces(String input) {
        StringBuilder result = new StringBuilder();
        boolean lastWasSpace = false;

        for (char c : input.toCharArray()) {
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
        return result.toString();
    }

    protected static String swapCharactersAroundDash(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '-' && i > 0 && i < input.length() - 1) {
                char left = input.charAt(i - 1);
                char right = input.charAt(i + 1);
                result.setCharAt(result.length() - 1, right);
                result.append(left);
                i++;
            } else {
                result.append(current);
            }
        }

        return result.toString();
    }

    protected static String replacePlusWithExclamation(String input) {
        return input.replace('+', '!');
    }

    protected static String removeDigitsAndCalculateSum(String input) {
        StringBuilder result = new StringBuilder();
        int digitSum = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitSum += Character.getNumericValue(c);
            } else {
                result.append(c);
            }
        }

        if (digitSum > 0) {
            result.append(" ").append(digitSum);
        }

        return result.toString();
    }
}
