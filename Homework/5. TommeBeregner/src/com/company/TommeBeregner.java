package com.company;
// Vi vil gerne lave en tomme-beregner der regner tommer om til centimeter
    /*det vigtige er blot at brugeren
    både kan gense det indtastede tal, og det beregnede
    */

import java.util.Locale;
import java.util.Scanner;

public class TommeBeregner
  {
  public static void main(String[] args)
    {
       /*
       Der skal importeres en scanner,
       således at brugeren kan taste tal værdierne ind i programmet.
       */

      // Define constants
      // 1 centimeter er 0.393700787 tommer
      final double centimeterFaktor = 0.393700787;
      // 1 tommer er 2,54 centimeter
      final double tommerFaktor = 2.54;

      Scanner keyboard = new Scanner(System.in);
      keyboard.useLocale(Locale.ENGLISH);
      // Vil du beregne tommer om til centimeter?
      // Eller vil du beregne centimeter om til tommer

      boolean exit = false;

      while (!exit) {

        // Spørg bruger hvad han vælger
        System.out.println("Hvad vil du beregne?");
        System.out.println("Tommer til centimetre: (T)");
        System.out.println("Centimetre til tommer (C)");

        String beregn = keyboard.next();
        if (beregn.contains("T")) {


      
      
    /* Print først en tekst
    Her beder du brugeren taste den længde i tommer, der skal omregnes
    evt. en påmindelse om at taste tallet ind med punktum der separerer decimalerne
    */

          System.out.println("Husk at du skal bruge punktum før decimalerne! ");
          System.out.print("Indtast en længde i tommer: ");
          double tommer = keyboard.nextDouble();

          // For at det skal se lidt pænere ud laver vi et linje skift
          System.out.println();

          // Brugeren skal kunne taste det præcise tal ind, med decimaler hvis det ønskes
          // Tallet tastets ind med punktum der separerer decimalerne
          // Resultatet må ikke afrundes

          // double resultatICentimeter = (tommer * 2.54);

          double resultatICentimeter = (tommer * tommerFaktor);
          System.out.println(tommer + " tommer svarer til " + resultatICentimeter + " centimeter ");

          // For at det skal se lidt pænere ud laver vi et linje skift
          System.out.println();
          System.out.println();


        } else {


          // vil du lave en beregning fra centimeter til tommer




          System.out.println("Husk at du skal bruge punktum før decimalerne! ");
          System.out.print("Indtast en længde i centimeter: ");
          double centimeter = keyboard.nextDouble();

          // For at det skal se lidt pænere ud laver vi et linje skift
          System.out.println();

          // Brugeren skal kunne taste det præcise tal ind, med decimaler hvis det ønskes
          // Tallet tastets ind med punktum der separerer decimalerne
          // Resultatet må ikke afrundes

          // double resultatITommer = ( * 2.54);

          double resultatITommer = (centimeter * centimeterFaktor);
          System.out.println(centimeter + " centimeter svarer til " + resultatITommer + " tommer ");




        }
        //lav et loop hvor den springer til linje 26
        // vil du lave en ny beregning

        System.out.println("Ønsker du at lave en ny beregning");
        System.out.println("For at lave ny beregning tryk J ");
        System.out.println("For at afslutte tast N ");
        String nyBeregning = keyboard.next();
        if (nyBeregning.contains("N")) {
          exit = true;
        }
      }
  }
}



