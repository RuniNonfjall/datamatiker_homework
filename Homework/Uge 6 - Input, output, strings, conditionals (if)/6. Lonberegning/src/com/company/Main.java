package com.company;

import java.util.Scanner;

/*
Krav
Programmet opbygges i to etaper.
Sørg for at programmere første etape helt færdig, før du kaster dig over kravene til den næste.

1. Der beregnes bruttoløn.
- Ugentlig bruttoløn afhænger af timeløn. Evt. overarbejde som aflønnes med “en og en halv”.
- Lad brugeren indtaste faktisk ugentlig timeforbrug (i hele timer).
- Beregn bruttolønnen.
- Udskriv bruttolønnen på skærmen. Prøv resultatet efter med en lommeregner.
- Har du overvejet at gøre faste værdier til Java konstanter? Brug final.
*/

/*
2. Der beregnes nettoløn,hvilket straks er mere besværligt, fordi der er flere regler.
- Der skal betales arbejdsmarkedbidrag (kaldes også am-bidrag) på 8% af bruttolønnen,
    dvs. før personfradrag og A-skat .
- Personfradraget, er den del af indkomsten som ikke bliver beskattet.
    Fradraget er et inviduelt beløb og fremgår af forskudsopgørelsen.
- A-skat, er skat, som bliver indeholdt af arbejdsgiver, og baserer sig på lønmodtagerens trækprocent.
    Trækprocenten afhænger indkomst, hvilken kommune man bor i m.m.
- Nettolønnen er således det beløb, man som lønmodtager har til rådighed på bankkontoen,
    når am-bidrag og skat er betalt.
- Beregn nettoløn.
- Udskriv nettolønnen på skærmen Prøv resultatet af med en lommeregner.

*/

public class Main {

    public static void main(String[] args) {
    //Time sats
        final double timeLon=150;
    //Overtids sats
        double timeLonOvertid=timeLon*1.5;

    //Importer Scanne til keyboard  
       Scanner keyboard = new Scanner(System.in);

    //Timer skrives ind i hele timer
       System.out.println("Velkommen til din lønberegner ");
       System.out.print("Indtast venligst dine timer for denne uge: ");
       int timerGrundlag=keyboard.nextInt();
    //OvertidsTimer
        System.out.print("Indtast venligst dine Overtids timer for denne uge: ");
        int timerOvertid=keyboard.nextInt();
        System.out.println(" ");

        //int timerGrundlag=40;
        //int timerOvertid=5;

        String specifikation="Specification";
        String grundlag="Grundlag";
        String sats="Sats";
        String belob="Beløb";
        String brutto="Bruttoløn: ";
        String valuta="kr";
        String timer="timer";
        String lon="kr/t";
        String ambidrag="AM-Bidrag: ";
        String amSats="8%";
        String fradragBerettet="Fradrag: ";
        String trukketISkat="A-Skat: ";
        String traekprocent="36%";
        String netto="Nettoløn: ";
        String overTid="50% timer";

        //Overskrifter
        System.out.printf("%s %15s %10s %15s %n",specifikation, grundlag, sats, belob);
        //Bruttoløn er ((Timer*TimeSats)+(Overtid*TimeLønOvertid)
        double bruttolon = ((timeLon * timerGrundlag) + (timeLonOvertid * timerOvertid));

        boolean exit = false;

        while (!exit) {

            if (timerOvertid == 0) {
                System.out.printf("%s %11s %s %11.1f %s %10.1f %s %n", brutto, timerGrundlag, timer, timeLon, lon, bruttolon, valuta);
                exit= true;
            }

            else {
                System.out.printf("%s %11s %s %11.1f %s %n", brutto, timerGrundlag, timer, timeLon, lon);
                System.out.printf("%s %13s %s %11.1f %s %10.1f %s %n", overTid, timerOvertid, timer, timeLonOvertid, lon, bruttolon, valuta);
                exit = true;
            }
        }

        //am-bidrag udgør 8% af bruttolønnen
            double amBidrag=bruttolon*0.08;
            System.out.printf("%s %27s %17.1f %s %n", ambidrag, amSats, amBidrag, valuta);

            //Fradragsberettet
            double personsfradrag=900.00;
             System.out.printf("%s %47.1f %s %n", fradragBerettet, personsfradrag, valuta);
             //A-Skat udgør ved en trækprocent på 36%
        double skattepligtigBelob=(bruttolon-amBidrag-personsfradrag);
        //System.out.println("Skatteberettet beløb: " +skattepligtigBelob + " kr");
        double aSkat=skattepligtigBelob*0.36;
        System.out.printf("%s %16.1f %s %10s %17.1f %s %n", trukketISkat, skattepligtigBelob, valuta, traekprocent, aSkat, valuta);

    //Efter skat
        double beskattetBelob=skattepligtigBelob*0.64;
        //System.out.println("Beskattet beløb: " +beskattetBelob + " kr");


    //Nettoløn
        double nettoLon=beskattetBelob+personsfradrag;
        System.out.printf("%s %46.1f %s %n", netto, nettoLon, valuta);

/*
    Sæt fradrag til lidt under 900

    Gældende satser for personfradrag i 2022?

    46.600 kr. til dig, der er fyldt 18 år.

    Lægge fradraget til efter skat er trukket
       */
    }
}
