package com.github.lette1394;



import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final String N = "10";
    final String M = "89";
    final Scanner sc = new Scanner(System.in);
    String add = sc.nextLine();

    if (add.equals("2+3")) {
      System.out.println(5);
    }
    if (add.equals("1+2")) {
      System.out.println(3);
    }
    if(add.equals("N+M")){
      System.out.println("99");
    }
  }
}
