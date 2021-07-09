package com.github.lette1394;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    final Scanner sc = new Scanner(System.in);
    String add = sc.nextLine();

    final List<String> expression = new ArrayList<>(Arrays.asList(add.split("\\+")));
    final long N = Long.parseLong(expression.get(0));
    final long M = Long.parseLong(expression.get(1));
    final String sum = String.valueOf(N + M);

    System.out.println(sum);
  }
}
