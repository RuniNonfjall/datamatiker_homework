package com.company;

import java.util.Random;
import java.util.Scanner;

//Er din date for ung 2.0
public class Main {

  public static void main(String[] args) {

    //Importer Scanne til keyboard

    Scanner keyboard = new Scanner(System.in);


    // Indtast din EgenAlder
    System.out.print("Indtast din alder her: ");
    int dinAlder = keyboard.nextInt();

    boolean exit = false;

    while (!exit) {
      // Indtast din DatesAlder
      System.out.print("Indtast din dates alder her: ");
      int datesAlder = keyboard.nextInt();


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

        int dinGrænse = ((dinAlder / 2) + 7);
        if (dinGrænse < datesAlder) {
          System.out.println("Du må gerne gå på date med hende! ");
          exit = true;
        }

        // Din date er for ung, du må derfor
        if (dinGrænse > datesAlder) {
          System.out.println("Du må ikke gå på date med hende! ");
          System.out.println("Du bliver nød til at finde en der er lidt ældre! ");
        }
      }
      //Hun er ældre end dig!
      if (dinAlder < datesAlder) {
        System.out.println(" Du må gerne gå på date med hende! ");
        exit = true;
      }
    }

  }
}
