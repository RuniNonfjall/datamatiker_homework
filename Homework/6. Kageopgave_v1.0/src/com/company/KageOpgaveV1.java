package com.company;

import java.util.Scanner;

public class KageOpgaveV1 {
  public static void main(String[] args) {

/*
//
    Banankage 12 pers
    6 æg
    2 tsk. Vaniljesukker
    2 tsk. Bagepulver
    125 g Smør
    600 g Bananer
    225 g Mæl
    150 g koge Chokolade
    315 g Sukker

*/
    //Omregnings faktorer fra et hver masse i gram pr. enhed
    final int ægFaktor = 56;
    final int tskVaniljesukkerFaktor = 2;
    final int tskBagepulverFaktor = 2;

    //Definering af portioner, hvert ækelt ingredient og mængde
    double portion;
    //double mængdeTotal;
    //double mængdeBagt;

    //Opskriften er beregnet til 12 personer.
    final int orgPortion = 12;
    //Indtast den ønskede værdi, for hvor mange personer opskriften skal være til
    System.out.print("Til hvor mange personer skal der være?: ");
    Scanner keyboard = new Scanner(System.in);
    portion = keyboard.nextDouble();



    //6 æg
    final double orgMængde1;
    orgMængde1 = 6;

    // 2 tsk. Vaniljesukker
    final double orgMængde2;
    orgMængde2 = 2;

    // 2 tsk. Bagepulver
    final double orgMængde3;
    orgMængde3 = 2;

    //125 g Smør
    final double orgMængde4;
    orgMængde4 = 125;

    //600 g Bananer
    final double orgMængde5;
    orgMængde5 = 600;

    //225 g Mæl
    final double orgMængde6;
    orgMængde6 = 225;

    //150 g koge Chokolade/
    final double orgMængde7;
    orgMængde7 = 150;

    //315 g Sukker
    final double orgMængde8;
    orgMængde8 = 315;


    String heading2 = "Opskrift på værdens lækreste Banankage! ";
    String heading1 = "Ingredienser:";

    // 6 æg
    double mængde1=((orgMængde1/orgPortion) * portion);
    String enhed1= "stk";
    String ingredient1 = "Æg";


    //2 tsk. Vaniljesukker
    double mængde2 =((orgMængde2/orgPortion) * portion);
    String enhed2= "tsk";
    String ingredient2 = "Vaniljesukker";

    //2 tsk. Bagepulver
    double mængde3 =((orgMængde3/orgPortion) * portion);
    String enhed3= "tsk";
    String ingredient3 = "Bagepulver";

    //125 g Smør
    double mængde4 =((orgMængde4/orgPortion) * portion);
    String enhed4= "gram";
    String ingredient4 = "Smør";

    //600 g Bananer
    double mængde5 =((orgMængde5/orgPortion) * portion);
    String enhed5= "gram";
    String ingredient5 = "Bananer";

    //225 g Mæl
    double mængde6 =((orgMængde6/orgPortion) * portion);
    String enhed6= "gram";
    String ingredient6 = "Mæl";

    //150 g koge Chokolade
    double mængde7 =((orgMængde7/orgPortion) * portion);
    String enhed7= "gram";
    String ingredient7 = "Koge Chokolade";

    //315 g Sukker
    double mængde8 =((orgMængde8/orgPortion) * portion);
    String enhed8= "gram";
    String ingredient8 = "Sukker";


    //Kriterie for listen af ingredienser er at den er stillet nydeligt op!

    System.out.println("");
    System.out.println("");
    //Overskrift
    System.out.printf("%12s %n", heading2);
    //Det pynter med et linjeskift12
    System.out.println("");
    System.out.printf("%15s%n", heading1);
    System.out.println("");
    System.out.printf("%3.0f %s \t %s %n", mængde1, enhed1, ingredient1);
    System.out.printf("%3.0f %s \t %s %n", mængde2, enhed2, ingredient2);
    System.out.printf("%3.0f %s \t %s %n", mængde3, enhed3, ingredient3);
    System.out.printf("%.0f %s \t %s %n", mængde4, enhed4, ingredient4);
    System.out.printf("%.0f %s \t %s %n", mængde5, enhed5, ingredient5);
    System.out.printf("%.0f %s \t %s %n", mængde6, enhed6, ingredient6);
    System.out.printf("%.0f %s \t %s %n", mængde7, enhed7, ingredient7);
    System.out.printf("%.0f %s \t %s %n", mængde8, enhed8, ingredient8);


    // Æggets vægt i gram
    double mængde1G = (mængde1 * ægFaktor);
    // Vaniljesukkerets vægt i gram
    double mængde2G =  (mængde2 * tskVaniljesukkerFaktor);
    // Bagepulverets vægt i gram
    double mængde3G = (mængde3 * tskBagepulverFaktor);
    // Den samlede masse af kagen
    double mængdeTotal=( mængde1G + mængde2G + mængde3G + mængde4 + mængde5 + mængde6 + mængde7 + mængde8 );

    System.out.println();
    System.out.print("Den samlede vægt er: ");
    System.out.print(mængdeTotal);
    System.out.println(" gram");
    System.out.println();


    double mængdeBagt = (mængdeTotal * 0.9);

    System.out.println();
    System.out.print("Når kagen har været i ovnen vejer den nu: ");
    System.out.print(mængdeBagt);
    System.out.println(" gram");
    System.out.println();



  }
}


/*


    Med gramSukker vil en enhed være 1 gram, og derfor selvfølgelig veje 1 gram.
    Med antalÆg vil en enhed være hvad end et æg vejer. Find tallene på nettet
    eller find på, eller gæt, det er ikke så vigtigt at det er korrekt.

     Lav en variabel for den samlede vægt, hvor du ganger antallet af hver ingrediens med vægten af en enhed,
    og lægger dem alle sammen.
      Udskriv den samlede vægt på en pæn og letforståelig måde under listen af ingredienser.
      Programmet skal også angive den samlede vægt af den færdige kage
      Vi gætter på at kagen vejer 10% mindre end vægten af alle ingredienserne
      Lav den beregning, og udskriv også resultatet på en, for brugeren, letforståelig måde.
      Husk: Det vigtige i denne opgave er at dit program udskriver resultatet pænt OG at det er opbygget pænt! Så brug evt.
      lidt tid på at rette op i din færdige kode, efter programmet virker.

      5. Frivillige udvidelser
      Har du tid, lyst og overskud, så tilføj også beregninger for den samlede energi,
      altså hvor mange kilojoule hver ingrediens giver til kagen, og hvor meget energi kagen derfor indeholder.
      Udvid eventuelt med energifordelingen, altså hvor meget fedt, kulhydrat og protein der er fra hver ingrediens,
      og samlet for hele kagen.



Anbefalet procedure
Tag en etape ad gangen, og ignorer hvad der skal ske i de efterfølgende.

Lav alle de variabler du skal bruge – sæt dem eventuelt først til nogle standard-værdier,
og test at udskriften virker, før du ændrer dem til beregnede værdier.

Udkommenter eventuelt brugerindtastningen i etape 2, og erstat den med en test-variabel,
så du kan køre programmet igen og igen, uden at skulle bøvle med at indtaste et antal hver eneste gang.
Husk at fjerne udkommenteringen igen, inden aflevering.
 */