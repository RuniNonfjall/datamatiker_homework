package com.company;

public class Main {

  public void sayHello(String firstName, String animalType, String animalName) {

    System.out.println("Mit navn er " + firstName + ", jeg har en " + animalType + " der heder " + animalName);
  }

  public void writeName (String fornavn, String mellemnavn, String efternavn) {

    System.out.println("Fornavn: " + fornavn);
    System.out.println("Mellemnavn: " + mellemnavn);
    System.out.println("Efternavn: " + efternavn);


  }

  public void  writeNameParts( String fullName ) {


    int start = 0;
    int firstSpace = fullName.indexOf(" ");
    int secondSpace = fullName.indexOf(" ",firstSpace+1);


    String fornavn = fullName.substring(start,firstSpace);
    String mellemnavn = fullName.substring(firstSpace+1,secondSpace);
    String efternavn = fullName.substring(secondSpace+1);

    System.out.println("Fornavn: " + fornavn);
    System.out.println("Mellemnavn: " + mellemnavn);
    System.out.println("Efternavn: " + efternavn);

  }
  public void writeCapitalized( String name ) {


  }


  public static void main(String[] args) {
    Main obj= new Main();
    String firstName = "Rune";
    String animalType = "Hvalross";
    String animalName= "Torben";

    obj.sayHello(firstName, animalType, animalName);

    obj.writeNameParts("Rune Non Fjæld");
    obj.writeNameParts("Peter Heronimous Lind");
    obj.writeNameParts("Harry James Potter");
    //obj.writeNameParts("Albus Percival Wulfric Brian Dumbledore");
    //obj.writeNameParts("James Gosling");


  }

}
