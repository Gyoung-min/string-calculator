package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    long sum = 0;
    long romanNumberSum = 0;

    final Scanner sc = new Scanner(System.in);

    final String getOperator = sc.nextLine();

    if (getOperator.contains("I") || getOperator.contains("V") || getOperator.contains("X") || getOperator.contains("L") || getOperator.contains("C") || getOperator.contains("D") || getOperator.contains("M")) {

      romanNumberSum = romanNumberOperate(getOperator);

    }
    final String integerOperator = removeRomanNumber(getOperator);

    final List<String> expression = new ArrayList<>(Arrays.asList(integerOperator.split("\\+")));

    for (int i = 0; i < expression.size(); i++) {

      if (!expression.get(i).equals("")) {

        sum += Long.parseLong(expression.get(i));

      }
    }
    System.out.println(sum + romanNumberSum);
  }

  private static String removeRomanNumber(String getOperator) {

    String integerOperator = getOperator.replace("I", "")
      .replace("V", "")
      .replace("X", "")
      .replace("L", "")
      .replace("C", "")
      .replace("D", "")
      .replace("M", "");
    return integerOperator;
  }

  private static long romanNumberOperate(String getOperator) {
    long romanNumberSum = 0;
    final List<String> expression = new ArrayList<>(Arrays.asList(getOperator.split("\\+")));

    for (int i = 0; i < expression.size(); i++) {

      if (expression.get(i).equals("I")) {
        romanNumberSum += 1L;
      }
      if (expression.get(i).equals("V")) {
        romanNumberSum += 5L;
      }
      if (expression.get(i).equals("X")) {
        romanNumberSum += 10L;
      }
      if (expression.get(i).equals("L")) {
        romanNumberSum += 50L;
      }
      if (expression.get(i).equals("C")) {
        romanNumberSum += 100L;
      }
      if (expression.get(i).equals("D")) {
        romanNumberSum += 500L;
      }
      if (expression.get(i).equals("M")) {
        romanNumberSum += 1000L;
      }
    }
    return romanNumberSum;
  }
}

