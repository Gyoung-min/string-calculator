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
    final long Operand1 = Long.parseLong(expression.get(0));
    final long Operand2 = Long.parseLong(expression.get(1));
    final long Operand3 = Long.parseLong(expression.get(2));
    if(expression.size()==2) {
      final String sum = String.valueOf(Operand1 + Operand2);
      System.out.println(sum);
    }
    if(expression.size()==3){
      final String sum = String.valueOf(Operand1 + Operand2+Operand3);
      System.out.println(sum);
    }

  }
}
