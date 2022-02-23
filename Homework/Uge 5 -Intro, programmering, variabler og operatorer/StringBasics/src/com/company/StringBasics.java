package com.company;

public class StringBasics {
  public static void main(String[] args) {
    /*

   //StringBasics hvor du fortæller Programmet hvilken del at teksten er dit navn.

    String text1 = "Mit navn er Rune";
    String ord ="Rune";
    int startIndex = text1.indexOf(ord);
    int slutIndex = startIndex + ord.length();


    System.out.println("Start er: " + startIndex);
    System.out.println("Slut er: " + slutIndex);

    System.out.println("Hej " + text1.substring( startIndex, slutIndex ) + " hvordan går det?");
     */

      String text1 = "Mit navn er Rune";
      int startIndex = text1.lastIndexOf(" ") +1;

      System.out.println("Hej " + text1.substring( startIndex ) + " hvordan går det?");



    // toUpperCase() metoden, der kan lave alle bogstaver store.

    String text2 = "Dette er en tekst";
    String textStor = text2.toUpperCase();

    System.out.println(textStor);



  }
}


/*
String tekst = "Mit navn er Rune";

    String mitNavn = tekst.substring(12,17);

    System.out.println("Mit navn er: _ " + mitNavn + " ");
 */