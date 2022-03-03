package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    //Variabler
    String shopName = "Den syngende Pølsevogn";

    //Løbenummer
    int min1 = 25000;
    int max1 = 50000;
    int receiptNumber = (int) (Math.random() * (max1 - min1 + 1) + min1);

    //Dato
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();

    //Kundenavn
    String[] customer = {"Peter", "Ole", "Jens", "Rune", "Emil", "Kristian", "Boryslav"};
    int min2 = 0;
    int max2 = customer.length - 1;
    int randomPersonIndex = (int) (Math.random() * (max2 - min2 + 1) + min2);
    String person = customer[randomPersonIndex];

    //Beløb
    int min3 = 500;
    int max3 = 5000;
    int ammount = (int) (Math.random() * (max3 - min3 + 1) + min3);
    String valuta = "kr";

    //Betalingsmetode
    String[] paymentMethode = {"Kontant", "Debit kort", "Check", "MobilePay",
        "Bitcoins", "Jyske Dollars!", "Hryvnia", "Cash Money!"};
    int min4 = 0;
    int max4 = paymentMethode.length - 1;
    int randomPaymentIndex = (int) (Math.random() * (max4 - min4 + 1) + min4);
    String payMe = paymentMethode[randomPaymentIndex];

    //Medarbejder
    String[] clerk = {"Anna", "Kristine", "Maria", "Laila", "Emma", "Johanne", "Svetlana"};
    int min5 = 0;
    int max5 = clerk.length - 1;
    int randomEmployeeIndex = (int) (Math.random() * (max5 - min5 + 1) + min5);
    String employee = clerk[randomEmployeeIndex];

    //Print
    System.out.printf("%nVelkommen til %s! %n", shopName);
    System.out.printf("%nKvitering nr:...  %12d %n", receiptNumber);
    System.out.printf("Dato:...........  %12s %n", formatter.format(date));
    System.out.printf("Kunde:..........  %12s %n", person);
    System.out.printf("Beløb:..........  %10d%s %n", ammount, valuta);
    System.out.printf("Betalingsmetode:  %12s %n", payMe);
    System.out.printf("Betjent af:.....  %12s %n %n", employee);
    System.out.println("Tak for dit besøg og på gensyn");
  }
}


//Butikkens Navn
//et unikt nummer (løbenummer for kvitteringen)
//dags dato
//kundens navn
//det samlede beløb der er købt for
//betalingsmetode (fx kreditkort, MobilePay, kontant, etc.)
//sælgerens navn


//Main obj = new Main();
//obj.input(String);
//System.out.println("Velkommen til den syngende pølsevogn");
//System.out.println("Unikke nummer: 2659");
//System.out.println("Dato: 01.03.2022");
//System.out.println("Kunde: Jens Petur Omanlop");
//System.out.println("Beløb: 569 Dansker kroner");
//System.out.println("Betalings metode: Jyske Dollars");
//System.out.println("De er I dag expederet af: Jenis av Rana");

//String receipNumber = "651321653";
//String date = "01.03.2022";
//String ammount = "6.846.841kr";
//String customer = "Jens petur Omanlop";
//String paymentMethode = "Vis Elektron";
//String clerk = "Jenis av Rana";


//SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
//Date date = new Date();