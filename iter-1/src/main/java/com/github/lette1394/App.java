package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    final Scanner sc = new Scanner(System.in);
    final String add = sc.nextLine();

    final List<String> expression = new ArrayList<>(Arrays.asList(add.split("\\+")));
    final long leftOperand = Long.parseLong(expression.get(0));
    final long rightOperand = Long.parseLong(expression.get(1));
    final String sum = String.valueOf(leftOperand + rightOperand);

    System.out.println(sum);
  }
}
