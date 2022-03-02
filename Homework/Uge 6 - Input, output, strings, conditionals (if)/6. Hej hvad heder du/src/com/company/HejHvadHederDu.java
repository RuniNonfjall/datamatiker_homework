package com.company;

import java.util.Scanner;

public class HejHvadHederDu {
  public static void main(String[] args) {

    System.out.print("Hvad er dit navn? ");
    Scanner keyboard = new Scanner(System.in);
    String name = keyboard.next();

    System.out.printf("Værhilset %s! Hvor gammel er du? ", name);
    int age = keyboard.nextInt();

    System.out.printf("%n%s! hvis du er %sår ", name, age);
    int yearOfBirth = 2022 - age;
    int yearOfBirthAlt = yearOfBirth - 1;

    System.out.printf("Så er du født i %d eller også har du ikke haft fødselsdag endnu og er født i %d %n", yearOfBirth, yearOfBirthAlt);


    System.out.printf("Hvordan går det? har du det godt? (J/N) ");

    boolean exit = false;

    while (!exit) {

      String answer = keyboard.next();
      String yesOrNo = answer.toUpperCase();
      if (yesOrNo.contains("N")) {
        System.out.printf("Det er jeg ked af at høre %s, " +
            "men det er også helt okay at have det skidt,%n" +
            "det er hvad gør os til mennesker og dermed skiller os fra aberne.%n", name);
        return;
      }
      if (yesOrNo.contains("J")) {
        System.out.print("Det glæder mig at høre, håber du får en rigtig dejlig dag!");
        return;
      }
      if (yesOrNo.contains("0")) {
        System.out.printf("På gensyn %s! Vi Tales ved", name);
        return;
      }
      System.out.printf("Du har tastet en ugyldig commando, vil du prøv igen?");
      System.out.printf("%nTryk J for Ja %nTryk N for Nej %nTryk 0 for at afslutte %n Dit svar: ");
    }
  }
}
