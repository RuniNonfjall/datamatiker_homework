package com.company;

import java.util.Scanner;

    /*
    Grænsen for hvor ung du bør date,
    beregnes ved at du tager det halve af din egen alder,
    og lægger syv år til
     */

//DinGrænse = ((DinAlder / 2) + 7 )


//Indtast din alder i hele tal

//Indtast din partners alder i hele tal

//Del 2 af program, er du for ung til din date
//DatesGrænse = ((DatesAlder / 2) + 7 )
    /*
    Programmet skal ikke fortælle hvad grænseværdien er,
    men blot fortælle brugeren om daten er for ung, eller helt i orden.
     */

    /*
    Hvis daten er for ung, skal programmet give mulighed for at indtaste en anden dates alder
    – uden at brugeren skal indtaste sin egen alder igen.
     */

//If DatesAlder < DinGrænse jump to Indtast DatsAlder

//Del 1 af program, er din date for ung til dig

//Et program hvor man kan indtaste sin egen og sin dates alder (i hele tal)

public class ErDinDateForUng {
  public static void  main(String[] args) {

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
      if (dinAlder < datesAlder){
        System.out.println(" Du må gerne gå på date med hende! ");
        exit = true;
      }
    }
  }
}














