package demo;

import java.util.Scanner;

public class SwitchDemo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter food item: ");
    String food = scanner.next();

    if ("pineapple".equals(food)) {
      System.out.println("fruit");
    } else if ("pear".equals(food)) {
      System.out.println("fruit");
    } else if ("banana".equals(food)) {
      System.out.println("fruit");
    } else if ("strawberry".equals(food)) {
      System.out.println("fruit");
    } else if ("potato".equals(food)) {
      System.out.println("vegetable");
    } else if ("carrot".equals(food)) {
      System.out.println("vegetable");
    } else if ("broccoli".equals(food)) {
      System.out.println("vegetable");
    } else {
      System.out.println("Don't know that food");
    }
  }
}
