package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    final Scanner sc = new Scanner(System.in);
    final String getOperator = sc.nextLine();

    final List<String> expression = new ArrayList<>(Arrays.asList(getOperator.split("\\+")));
    final long operand1 = Long.parseLong(expression.get(0));
    final long operand2 = Long.parseLong(expression.get(1));
    final long operand3 = Long.parseLong(expression.get(2));

    if (expression.size() == 2) {
      final String sum = String.valueOf(operand1 + operand2);
      System.out.println(sum);
    }
    if (expression.size() == 3) {
      final String sum = String.valueOf(operand1 + operand2 + operand3);
      System.out.println(sum);
    }

  }
}
