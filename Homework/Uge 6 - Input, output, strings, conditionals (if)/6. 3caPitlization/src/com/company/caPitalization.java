package com.company;

import java.util.Locale;

public class caPitalization {
  public static void main(String[] args) {
    // toUpperCase() metoden, der kan lave alle bogstaver store.
    /*
    Denne og resten af øvelserne i dag, bør du alle lave i det samme projekt
    - gerne i den samme main-metode. Hvis du bliver forstyrret af de tidligere løsninger,
     så vælg evt at udkommentere dem (Menuen: Code->Comment with block comment)


     3caPitalization
     Du skal lave et program der kan ændre en vilkårlig streng til at det tredje bogstav er stort,
      og alle de andre er små. Så for eksempel “peter” eller “PETER” eller “Peter” alle bliver til “peTer”

      Programmet har bare strengen som en variabel i sourcekoden, og udskriver den resulterende streng til System.out.

      Øvelsen skal løses ved hjælp af de forskellige substring, toUpperCase og toLowerCase metoder.

      Husk at du ikke kan ændre i en streng, så du er nødt til at konkatenere flere del-strenge sammen til det endelige resultat.


      Prøv din kode af med forskellige vilde udgaver af dit eget navn, såsom “pETer”, “PEter”, “peteR”, “PEtER” og så videre, og tjek at det altid virker!

Test også med længere navne – men tag dig ikke af at det ikke virker med navne på under tre tegn ...




Aflevering
Paste din program-kode ind som aflevering her.

Der gives ikke feedback, men så har du en backup til senere!
     */


     String name = "REGIN";


    String førsteToBogstaver = name.substring(0,2);
    førsteToBogstaver = førsteToBogstaver.toLowerCase();

    String tredjeBogstav = name.substring(2,3);
    tredjeBogstav = tredjeBogstav.toUpperCase();

    String resten =name.substring(3);
    resten = resten.toLowerCase();

    System.out.println( førsteToBogstaver + tredjeBogstav + resten);



  //String førsteBogstav = name.toLowerCase();



/*
String tekst = "Mit navn er Rune";

    String mitNavn = tekst.substring(12,17);

    System.out.println("Mit navn er: _ " + mitNavn + " ");
 */


/*
/
    String text2 = "Rune Nonfjæld";
    String textStor = text2.toUpperCase();

    System.out.println(textStor);
 */


  }
}
