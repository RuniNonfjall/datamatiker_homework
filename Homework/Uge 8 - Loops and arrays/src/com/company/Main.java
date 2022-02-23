package com.company;
//Udskriv et tegn ad gangen
//Find Index of
//Reverce String
//mOcKify
//

public class Main {

  public static void main(String[] args) {

    Main obj = new Main();
    String fornavn = "Rune";
    obj.udskrivEtTegnAdGangen(fornavn);
    int findIndexOf = obj.findIndexOf(fornavn, 'b');
    if (findIndexOf >= 0) {
      System.out.println("Den er fundet på index: " + findIndexOf);
    } else {
      System.out.println("Fejl bokstavet er ikke fundet! ERRORCODE404");
    }
  }


  public void udskrivEtTegnAdGangen(String fornavn) {
    for (int i = 0; i < fornavn.length(); i++) {
      char letter = fornavn.charAt(i);
      System.out.println(letter);

    }
  }

  public int findIndexOf(String input, char letter) {
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (letter == ch) {
        return i;
      }

    }
    return -1;
  }
}