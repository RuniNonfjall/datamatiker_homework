package com.company;

import java.util.Scanner;
import java.lang.Math;


public class Main {
  public static void main(String[] args) {
    System.out.println("Velkommen til Rune's Talgæt 2022!");
    System.out.println("Jeg tænker på et tal mellem 1 og 100");
    System.out.println("- se om du kan gætte det!");

    //Tænk på et tilfældigt tal mellem 1 og 100
    // (Husk tallet)
    int max = 100;
    int min = 1;
    int tal = (int)(Math.random()*(max - min + 1) + min);
    Scanner keyboard = new Scanner(System.in);
    int gæt;
    do {
      //Bed brugeren om et gæt
      System.out.println("Gæt engang!");
      // (Husk gættet)
      gæt = keyboard.nextInt();
      //Hvis gæt er < tal, skriv "Tallet er højere"
      if (gæt < tal) {
        System.out.println("Tallet er højere!");

      }

      //Hvis gæt er > tel, skriv "Tallet er lavere"
      if (gæt > tal) {
        System.out.println("Tallet er lavere");
      }

      //Hvis gæt ikke er lig med tal, bed om et nyt gæt
    }
    while (gæt != tal);

    //Ellers, skriv "Du gættede det", og slut spillet
    System.out.println("Du gættede det! - tak for denne gang.");

  }
}
