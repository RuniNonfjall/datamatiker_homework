package com.company;

import java.util.Scanner;

//Er din date for ung 2.0
public class Main {


  public static void main(String[] args) {
    //Version 2.0
    System.out.println("Velkommen til programmet Er din date for ung");
    System.out.println("Dette er den nye og forbedrede version v2.0 \n");
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Indtast din alder her: ");
    int dinAlder = keyboard.nextInt();

    boolean exit = false;

    while (!exit) {
      // Indtast din datesAlder
      System.out.print("Indtast din dates alder her: ");
      int datesAlder = keyboard.nextInt();

      // Tal der ikke vil forekomme under normale omstændigheder
      // Hvis i er på samme alder afsluttes rutinen
      // Hvis du er ældre end din partner, hop til del 1
      // Hvis din partner er ældre end dig, hop til del 2

      // I er på samme alder!
      if (dinAlder == datesAlder) {
        System.out.println("Du må gerne gå på date med hende! ");
        exit = true;
      }

      // Du er ældre end din date! Del 1.
      if (dinAlder > datesAlder) {

        int dinNedreGrænse = ((dinAlder / 2) + 7);
        if (dinNedreGrænse < datesAlder) {
          System.out.println("Du må gerne gå på date med hende! ");
          exit = true;
        }

        // Din date er for ung, du må derfor
        if (dinNedreGrænse >= datesAlder) {
          System.out.println("Du må ikke gå på date med hende! ");
          System.out.println("Du bliver nød til at finde en der er lidt ældre! ");
        }
      }
      //Hun er ældre end dig! Del 2.
      if (dinAlder < datesAlder) {

        int dinØvereGrænse = ((dinAlder - 7) * 2);
        if (dinØvereGrænse >= datesAlder) {
          System.out.println("Du må gerne gå på date med hende! ");
          exit = true;
        }
        // Din date er for gammel, du må derfor
        if (dinØvereGrænse < datesAlder) {
          System.out.println("Du må ikke gå på date med hende! ");
          System.out.println("Du bliver nød til at finde en der er lidt yngre! ");
        }

      }
    }


  }
}

//int minAlder = 16;
//int maxAlder = 60;
//Importer Scanne til keyboard

/*
    boolean firstExit = false;

    while (!firstExit) {

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Indtast din alder her: ");
      int dinAlder = keyboard.nextInt();
        if (dinAlder > maxAlder) {
        System.out.println("Du har tastet et tal der ikke giver mening prøv Igen! \nIndtast Din alder her: ");
        }
        if (dinAlder < minAlder) {
          System.out.println("Du har tastet et tal der ikke giver mening prøv Igen! \nIndtast Din alder her: ");
        }
        // hvis du er yngre end Højst tilladte alder
        if (dinAlder <= maxAlder) {
          firstExit = true;
        }
        //Hvis du er yngre end Mindst tilladte alder
        if (dinAlder >= minAlder) {
          firstExit = true;
        }
      }
      */


/*
    boolean exit = false;

    while (!exit) {
      // Indtast din datesAlder
      System.out.print("Indtast din dates alder her: ");
      int datesAlder = keyboard.nextInt();

      // Tal der ikke vil forekomme under normale omstændigheder
      // Hvis i er på samme alder afsluttes rutinen
      // Hvis du er ældre end din partner, hop til del 1
      // Hvis din partner er ældre end dig, hop til del 2

      // I er på samme alder!
      if (dinAlder == datesAlder) {
        System.out.println("Du må gerne gå på date med hende! ");
        exit = true;
      }

      // Du er ældre end din date! Del 1.
      if (dinAlder > datesAlder) {

        int dinNedreGrænse = ((dinAlder / 2) + 7);
        if (dinNedreGrænse < datesAlder) {
          System.out.println("Du må gerne gå på date med hende! ");
          exit = true;
        }

        // Din date er for ung, du må derfor
        if (dinNedreGrænse >= datesAlder) {
          System.out.println("Du må ikke gå på date med hende! ");
          System.out.println("Du bliver nød til at finde en der er lidt ældre! ");
        }
      }
      //Hun er ældre end dig! Del 2.
      if (dinAlder < datesAlder) {

        int dinØvereGrænse = ((dinAlder - 7) * 2);
        if (dinØvereGrænse >= datesAlder) {
          System.out.println("Du må gerne gå på date med hende! ");
          exit = true;
        }
        // Din date er for gammel, du må derfor
        if (dinØvereGrænse < datesAlder) {
          System.out.println("Du må ikke gå på date med hende! ");
          System.out.println("Du bliver nød til at finde en der er lidt yngre! ");
        }

      }
    }
    */

