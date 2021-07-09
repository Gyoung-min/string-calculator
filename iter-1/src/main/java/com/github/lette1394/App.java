package com.github.lette1394;


import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final String[] expression;
    final long number1;
    final long number2;
    final String sum;
    final Scanner sc = new Scanner(System.in);

    String add = sc.nextLine();

    expression = add.split("\\+");
    number1 = Long.parseLong(expression[0]);
    number2 = Long.parseLong(expression[1]);
    sum = String.valueOf(number1 + number2);

    System.out.println(sum);
  }
}
