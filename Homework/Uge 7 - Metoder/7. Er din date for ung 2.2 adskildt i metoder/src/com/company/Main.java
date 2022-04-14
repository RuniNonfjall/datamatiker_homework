package com.company;

import java.util.Scanner;

public class Main {
  int minAge = 16;
  int maxAge = 60;
  //int i;

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);




    Main obj = new Main();

    boolean amValidAge = false;
    while (!amValidAge) {
      int userAge = 0;

      try {
        System.out.print("Indtast din alder: ");
        userAge = keyboard.nextInt();
      } catch (Exception ex) {
        System.out.println("Please input an integer. Try again.");
        keyboard.next();

      }

      // Check if I am too young
      if (userAge <= obj.minAge) {
        System.out.println("Du er for ung til at gå på date.");
        continue;
      } // Check if I am too old
      if (userAge > obj.maxAge) {
        System.out.println("Du er for gammel til at gå på date.");
        continue;
      }

      amValidAge=true;
    }

    boolean foundValidAge = false;
    while (!foundValidAge) {

      int dateAge;

      try {
        System.out.print("Indtast dine date's alder: ");
        dateAge = keyboard.nextInt();
      } catch (Exception ex) {
        System.out.println("Please input an integer. Try again.");
        keyboard.next();
        continue;
      }



      // Check if date is too young
      if (dateAge <= obj.minAge) {
        System.out.printf("Din date er for ung til at tage på en date! \nHun skal som minimum være %d år gammel\n", obj.minAge);
        continue;
      }

      // Check if date is too old
      if (dateAge > obj.maxAge) {
        System.out.printf("Din date er for gammel til at tage på en date! \nHun er %d år eller ældre og er derfor for gammel til at gå på date\n", obj.maxAge);
        continue;
      }

      // Check if date is within my lower threshold

      int userAge = 0;
      boolean dateIsToYoung = obj.tooYoung(dateAge, userAge);
      if (dateIsToYoung) {
        System.out.println("Din date er for ung til dig, vælg en der er lidt ældre! ");
        continue;
      }

      // Check if date is within my max threshold
      boolean dateIsToOld = obj.tooOld(dateAge, userAge);
      if (dateIsToOld) {
        System.out.println("Din date er for gammel til dig, vælg en der er lidt yngre");
        continue;
      }

      // If we get all the way down to this line, we found a suitable date!
      System.out.println("Du har fundet en passende date!");
      break;

    }




  }

  public boolean tooYoung(int dateAge, int userAge) {
    int userAgeLowerLimit = ((userAge / 2) + 7);
    return (userAgeLowerLimit >= dateAge);

    }



  public boolean tooOld(int dateAge, int userAge) {
    int userAgeUpperLimit = ((userAge - 7) * 2);
    return userAgeUpperLimit < dateAge;

  }


}
