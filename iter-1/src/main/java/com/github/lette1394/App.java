package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {


    long sum = 0;

    final Scanner sc = new Scanner(System.in);

    final String getOperator = sc.nextLine();


    if (getOperator.contains("I") || getOperator.contains("V") || getOperator.contains("X") || getOperator.contains("L") || getOperator.contains("C") || getOperator.contains("D") || getOperator.contains("M")) {

      romanNumberOperate(getOperator);

    } else {

      final List<String> expression = new ArrayList<>(Arrays.asList(getOperator.split("\\+")));


      for (int i = 0; i < expression.size(); i++) {


        sum += Long.parseLong(expression.get(i));

      }


      System.out.println(sum);
    }
  }

  private static void romanNumberOperate(String getOperator) {

    long sum = 0;


    final List<String> expression = new ArrayList<>(Arrays.asList(getOperator.split("\\+")));

    for (int i = 0; i < expression.size(); i++) {

      if (expression.get(i).equals("I")) {

        sum += 1L;

      }
      if (expression.get(i).equals("V")) {

        sum += 5L;

      }
      if (expression.get(i).equals("X")) {

        sum += 10L;

      }
      if (expression.get(i).equals("L")) {

        sum += 50L;

      }
      if (expression.get(i).equals("C")) {

        sum += 100L;

      }
      if (expression.get(i).equals("D")) {

        sum += 500L;

      }
      if (expression.get(i).equals("M")) {

        sum += 1000L;

      }

    }
    System.out.println(sum);

  }


}

