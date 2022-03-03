package com.company;
//Udskriv et tegn ad gangen
//Find Index of
//Reverce String
//mOcKify
//(Extra øvelse) toUpper
//Mulitplikationstabel
//Starblock

public class Main {

  public static void main(String[] args) {

    Main obj = new Main();
    String fornavn = "Rune";

    obj.udskrivEtTegnAdGangen(fornavn);
    System.out.println();

    int i = obj.findIndexOf("bob", 'o');
    //System.out.printf("Find Index Of! %nFinder bogstaven %c i navnet %s: \t", letter, input);
    System.out.println("Den er fundet på index: " + i);
    //System.out.println("Fejl bokstavet er ikke fundet! ERRORCODE404");
    System.out.println("");

    obj.reverceString();
    System.out.println("");

    String mOcKify = obj.mOcKify("Kukka i buks");
    System.out.println(mOcKify);
    obj.starBlock(50, 20);
    obj.multiplikationstabel(10, 10);

  }

  //Udskriv et tegn ad gangen vi bruger fornavnet opgivet i main metoden
  public void udskrivEtTegnAdGangen(String fornavn) {
    System.out.println("");
    System.out.printf("Udskriv et Tegna ad gangen! %nUdskriver %s et tegn ad gangen: \t", fornavn);
    for (int i = 0; i < fornavn.length(); i++) {
      char letter = fornavn.charAt(i);
      System.out.printf("%c \t", letter);
    }
    System.out.println("");

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

  public void reverceString() {
    String fornavn = "Thomas";
    String reversedString = "";


    for (int i = fornavn.length() - 1; i >= 0; i--) {
      reversedString = reversedString + fornavn.charAt(i);
    }
    System.out.printf("Reverse String! %nPrinter %s i omvendt rækkefølge: %3s", fornavn, reversedString);

  }

  public String mOcKify(String input) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      boolean toUpperCase = Math.random() > 0.5;
      if (toUpperCase) {
        result += Character.toUpperCase(ch);
      } else {
        result += Character.toLowerCase(ch);
      }
    }
    return result;
  }

  public void starBlock(int width, int height) {

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void multiplikationstabel(int width, int height) {

    for (int i = 1; i < height +1 ; i++) {
      for (int j = 1; j < width +1 ; j++) {
        System.out.printf("%2d ", i*j);
      }
      System.out.println();
    }
  }

}