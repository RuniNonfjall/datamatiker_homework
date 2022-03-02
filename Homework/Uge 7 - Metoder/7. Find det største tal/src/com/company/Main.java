package com.company;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LargestNumber obj = new LargestNumber();
    int getUserInput = obj.getUserInput();
    obj.findLargestNumber(getUserInput);
    obj.displayLargestNumber(getUserInput);
  }
}

class LargestNumber {
  int largestNumber;


  public int getUserInput() {
    int tal1;
    int tal2;

    Scanner keyboard = new Scanner();
    tal1 = keyboard.nextInt();
    tal2 = keyboard.nextInt();
    return tal1 && tal2;
  }

  public void findLargestNumber(int tal1, int tal2) {
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

