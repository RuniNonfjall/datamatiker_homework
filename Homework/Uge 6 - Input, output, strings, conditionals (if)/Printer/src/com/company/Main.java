package com.company;

public class Main {
  //Butikkens Navn
//et unikt nummer (løbenummer for kvitteringen)
//dags dato
//kundens navn
//det samlede beløb der er købt for
//betalingsmetode (fx kreditkort, mobilepay, kontant, etc.)
//sælgerens navn
    public static void main(String[] args) {

      //Main obj = new Main();
      //obj.input(String);
      //System.out.println("Velkommen til den syngende pølsevogn");
      //System.out.println("Unikke nummer: 2659");
      //System.out.println("Dato: 01.03.2022");
      //System.out.println("Kunde: Jens Petur Omanlop");
      //System.out.println("Beløb: 569 Dansker kroner");
      //System.out.println("Betalings metode: Jyske Dollars");
      //System.out.println("De er I dag expederet af: Jenis av Rana");




      //Variabler
      String shopName= "Den syngende Pølsevogn";
      String receipNumber = "651321653";
      String date = "01.03.2022";
      String customer = "Jens petur Omanlop";
      String ammount = "6.846.841kr";
      String paymentMethode = "Vis Elektron";
      String clerk = "Jenis av Rana";


      //Print
      System.out.printf("Velkommen til %s! %n %n", shopName);
      System.out.printf("Kvitering nr: \t \t %10s %n", receipNumber);
      System.out.printf("Dato: \t \t  %18s %n", date);
      System.out.printf("Kunde:\t \t  %26s %n", customer);
      System.out.printf("Beløb: \t \t %20s %n", ammount);
      System.out.printf("Betalingsmetode: \t  %1s %n", paymentMethode);
      System.out.printf("Betjent af: \t \t %14s %n %n", clerk);
      System.out.println("Tak for dit besøg og på gensyn");


    }
}
