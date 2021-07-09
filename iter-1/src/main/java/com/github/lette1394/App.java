package com.github.lette1394;


import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final String[] expression;
    final long N;
    final long M;
    final String sum;
    final Scanner sc = new Scanner(System.in);

    String add = sc.nextLine();

    expression = add.split("\\+");
    N = Long.parseLong(expression[0]);
    M = Long.parseLong(expression[1]);
    sum = String.valueOf(N + M);

    System.out.println(sum);
  }
}
