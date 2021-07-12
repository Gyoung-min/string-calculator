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


    long sum = 0;

    for (int i = 0; i < expression.size(); i++) {

      sum += Long.parseLong(expression.get(i));

    }

    System.out.println(sum);
  }
}
