package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
  private static long romanNumberSum = 0;
  private static long decimalNumberSum = 0;
  private static long octalNumberSum = 0;

  public static void main(String[] args) {

    final Scanner get = new Scanner(System.in);
    final String getOperator = get.next();

    final List<String> expression = new ArrayList<>(Arrays.asList(getOperator.split("\\+")));

    for (int i = 0; i < expression.size(); i++) {

      if (expression.get(i).contains("I") || expression.get(i).contains("V") || expression.get(i).contains("X") || expression.get(i).contains("L") || expression.get(i).contains("C") || expression.get(i).contains("D") || expression.get(i).contains("M")) {
        romanNumberOperate(expression.get(i));
      }
      if (expression.get(i).contains("(8)")) {
        octalNumberOperate(expression.get(i));
      }
      if (expression.get(i).contains("(10)")) {
        decimalNumberSumOperate(expression.get(i));
      }
    }
    System.out.println(romanNumberSum + decimalNumberSum + octalNumberSum);
  }

  private static void decimalNumberSumOperate(String decimalNumber) {

    String number = decimalNumber.replace("(10)", "");

    decimalNumberSum += Long.parseLong(number);

  }

  private static void octalNumberOperate(String octalNumber) {

    String number = octalNumber.replace("(8)", "");
    long octalLongNumber = Integer.valueOf(number, 8);
    octalNumberSum += octalLongNumber;
  }

  private static void romanNumberOperate(String romanNum) {

    if (romanNum.equals("I")) {
      romanNumberSum += 1L;
    }
    if (romanNum.equals("V")) {
      romanNumberSum += 5L;
    }
    if (romanNum.equals("X")) {
      romanNumberSum += 10L;
    }
    if (romanNum.equals("L")) {
      romanNumberSum += 50L;
    }
    if (romanNum.equals("C")) {
      romanNumberSum += 100L;
    }
    if (romanNum.equals("D")) {
      romanNumberSum += 500L;
    }
    if (romanNum.equals("M")) {
      romanNumberSum += 1000L;
    }
  }
}

