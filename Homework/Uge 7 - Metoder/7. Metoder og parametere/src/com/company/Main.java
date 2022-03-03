package com.company;

//Name-parts - II - metoden writeNameParts
//Capitalize - II - metoden writeCapitalized
//metoden FullName
//metoden FullName - nu med overloading
//Kombination af metoder
public class Main {

  public void sayHello(String firstName, String animalType, String animalName) {

    System.out.println("Mit navn er " + firstName + ", jeg har en " + animalType + " der heder " + animalName + "\n");
  }


  public void writeNameParts(String fullName) {
    int start = 0;
    int firstSpace = fullName.indexOf(" ");
    //int secondSpace = fullName.indexOf(" ",firstSpace+1);
    int lastspace = fullName.lastIndexOf(" ");

    if (firstSpace == lastspace) {
      String fornavn = fullName.substring(start, firstSpace);
      String efternavn = fullName.substring(lastspace + 1);

      System.out.print("Fornavn: ");
      writeCapitalized(fornavn);
      System.out.println();

      System.out.print("Efternavn: ");
      writeCapitalized(efternavn);
      System.out.println();
    } else {
      String fornavn = fullName.substring(start, firstSpace);
      String mellemnavn = fullName.substring(firstSpace + 1, lastspace);
      String efternavn = fullName.substring(lastspace +1);

      System.out.print("Fornavn: ");
      writeCapitalized(fornavn);
      System.out.println();

      System.out.print("Mellemnavn: ");
      writeCapitalized(mellemnavn);
      System.out.println();

      System.out.print("Efternavn: ");
      writeCapitalized(efternavn);
      System.out.println();

    }
  }

  public void writeCapitalized(String name) {
    String nameCap = name.substring(0, 1);
    nameCap = nameCap.toUpperCase();

    String nameLow = name.substring(1);
    nameLow = nameLow.toLowerCase();


    System.out.println(nameCap + nameLow);
  }

  public void fullName(String lastname, String firstname, String middelName) {
    String fullName;
    if (middelName != null) {
      fullName = firstname + " " + middelName + " " + lastname;
    } else {
      fullName = firstname + " " + lastname;
    }
    System.out.print(fullName + "\n");
  }

  //Overload
  public void fullName(String lastName, String firstName) {
    fullName(lastName, firstName, null);

  }


  public static void main(String[] args) {

    Main obj = new Main();
    String firstName = "Rune";
    String middelName = "Myliouse";
    String lastName = "Schwarzkopf";
    String animalType = "Hvalross";
    String animalName = "Torben";

    obj.sayHello(firstName, animalType, animalName);

    // Korrekt output
    obj.fullName(lastName, firstName, null);
    obj.fullName(lastName, firstName, middelName);
    //obj.fullName(lastName, firstName);
    // Forkert output
    // obj.fullName(firstName, lastName, middelName);
    obj.fullName("Bob", "Swampe");

    //obj.writeNameParts("Rune Non Fjæld");
    //obj.writeNameParts("Peter Heronimous Lind");
    //obj.writeNameParts("Harry James Potter");
    //obj.writeNameParts("Albus Percival Wulfric Brian Dumbledore");
    //obj.writeNameParts("James Gosling");

    obj.writeCapitalized("REGIN");
    obj.writeCapitalized("regin ellefsen");
    obj.writeCapitalized("ReGin");
    obj.writeCapitalized("rEGiN");
    obj.writeCapitalized("reGin");
    obj.writeCapitalized("reGIN");
    obj.writeCapitalized("ReGIn");


    obj.writeNameParts("peTRr hERONIMOUs LIND");
    obj.writeNameParts("HaRRy jaMes pOtteR");
    obj.writeNameParts("albus percival wulfric brian dumbledore");


  }
}