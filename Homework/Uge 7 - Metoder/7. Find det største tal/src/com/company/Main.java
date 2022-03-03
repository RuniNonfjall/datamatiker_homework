package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LargestNumber obj = new LargestNumber();
    obj.getUserInput();
    obj.findLargestNumber();
    obj.displayLargestNumber();
  }
}

class LargestNumber {
  int tal1;
  int tal2;
  int largestNumber;

  public void getUserInput() {
    Scanner keyboard = new Scanner(System.in);
    tal1 = keyboard.nextInt();
    tal2 = keyboard.nextInt();
  }

  public void findLargestNumber() {
    largestNumber = Math.max(tal1, tal2);
  }

  public void displayLargestNumber() {
    System.out.printf("Largest number is! %d", largestNumber);
  }
}


/*
    int tal1 = 6789;
    int tal2 = 435;
    int størsteTal = Math.max(tal1, tal2);
    System.out.println(størsteTal);



*/

