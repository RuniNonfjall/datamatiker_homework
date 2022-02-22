package com.company;

import java.util.Scanner;

public class BMIBeregner {
  public static void main(String[] args) {
    // Variablerne defineres her for brugerens vægt og højde
    double vægt;
    double højde=0;


    System.out.println("Velkommen til BMI-beregneren");
    System.out.print("Indtast din vægt i kg: ");

    // Vægt, højde og input skanner er her initialiseret
    Scanner keyboard = new Scanner(System.in);
    vægt = keyboard.nextDouble();
    System.out.println();
    System.out.print("Indtast din højde i meter: ");
    højde = keyboard.nextDouble();
    System.out.println();

    // BMI beregnes her
    double bmi = vægt / (højde * højde);
    System.out.printf("Din BMI = %3.1f %n", bmi);

    System.out.println(" ");

    // Under 18,5: Undervægtig
    if (bmi <= 18.5) {
      System.out.println("Du er undervægtig");
    }
    //8,5-25: Normalvægtig
    if (bmi > 18.5 && bmi <= 25) {
      System.out.println("Du er normalvægtig");
    }
    //25-30: Overvægtig
    if (bmi > 25 && bmi <= 30) {
      System.out.println("Du er overvægtig");
    }
    //Over 30: Svært overvægtig
    if (bmi > 30) {
      System.out.println("Du er svært overvægtig");
    }

    System.out.println(" ");




  }
}
