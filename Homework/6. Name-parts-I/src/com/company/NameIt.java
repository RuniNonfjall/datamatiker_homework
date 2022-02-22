
package com.company;
public class NameIt {
  public static void main(String[] args) {
    String navn= "Rune Non Fjæld";
    int start = 0;
    int firstSpace = navn.indexOf(" ");
    int secondSpace = navn.indexOf(" ",firstSpace+1);


    String fornavn = navn.substring(start,firstSpace);
    String mellemnavn = navn.substring(firstSpace+1,secondSpace);
    String efternavn = navn.substring(secondSpace+1);

    System.out.println("Fornavn: " + fornavn);
    System.out.println("Mellemnavn: " + mellemnavn);
    System.out.println("Efternavn: " + efternavn);

  }
}
    /*
    Det aller sidste ord eller navn i en sæt der indeholder fulde navn
    derfor kan vi tage lastIndexOf det sidste mellemrum +1
    som vil være starte ved første bogstav i efternavnet

    String navn = "Peter Heronimous Lind";


    */

       /*


Rói Fleygar sær í Java
        String fuldeNavn = "Hjalte Moller Hojle";

    String[] fuldeNavnSpl = fuldeNavn.split(" ");
    System.out.println(fuldeNavnSpl[0]);
    System.out.println(fuldeNavnSpl[1]);
    System.out.println(fuldeNavnSpl[2]);





Virker ikke
 String text1 = "Peter Heronimous Lind";

    int indexOf = text1 .indexOf(0 , " ");
    System.out.println("Fornavn: " + text1.substring( indexOf ));

    int lastIndex = text1.lastIndexOf(" ") +1;

    System.out.println("Efternavn: " + text1.substring( lastIndex ));
        */

  /*

    /*
Du skal lave et program der kan dele en streng med et navn som f.eks. “Peter Heronimous Lind” op i tre dele,
 fornavn, mellemnavn og efternavn, og gemme dem i hver sin variabel.

Til sidst skal programmet udskrive de tre variabler på hver sin linje, i stil med:
Fornavn: Peter
Mellemnavn: Heronimous
Efternavn: Lind

//  First indexOf ville være fornavn

// alt andet ville være mellemnavn




Du må selv om du vil bruge danske eller engelske ord i variabler og brugerflade.



Øvelsen skal løses ved hjælp af de forskellige indexOf og substring metoder
– der er ingen grund til at lede efter mere avancerede værktøjer!



Husk at du ikke må have magic numbers,
men i stedet skal skrive kode der finder ud af hvor i strengen der skal “klippes” de forskellige dele!

Når du har fået det til at virke med mit eksempel,
så prøv at ændre til dit eget navn (opfind et mellemnavn hvis du ikke har et) og tjek at programmet stadig virker!

Frivillig udvidelse
Hvis du har lyst til at udfordre dig selv en lille smule,
så lav programmet så det også virker med flere mellemnavne, som for eksempel:

"Albus Percival Wulfric Brian Dumbledore"

Hvor mellemnavnet så ender med at være alle tre mellemnavne: "Percival Wulfric Brian"

     */

