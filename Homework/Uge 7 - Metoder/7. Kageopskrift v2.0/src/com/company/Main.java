package com.company;
/*
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

import java.util.Scanner;

class Ingredients {

    //mængde ingredient for en person
    final double mængdeÆg = 0.5;
    final double mængdeVaniljesukker = 0.167;
    final double mængdeBagepulver = 0.167;
    final double mængdeSmør = 10;
    final double mængdeBananer = 50;
    final double mængdeMæl = 18.75;
    final double mængdeChokolade = 12.5;
    final double mængdeSukker = 26.25;

    //Omregnings faktorer fra et hver masse i gram pr. enhed
    final int ægFaktor = 56;
    final int tskVaniljesukkerFaktor = 2;
    final int tskBagepulverFaktor = 2;

    //Enheder
    String stykker = "Stk. ";
    String gram = "Gram ";
    String teaSke = "tsk. ";

    //Ingredient
    String æg = "Æg ";
    String vaniljesukker = "Vaniljesukker ";
    String bagepulver = "Bagepulver ";
    String smør = "Smør ";
    String bananer = "Bananer ";
    String mæl = "Mæl ";
    String chokolade = "Chokolade ";
    String sukker = "Sukker ";


    public int inputPortion() {
        //Definering af portioner, hvert ækelt ingredient og mængde
        int portion;

        //Indtast den ønskede værdi, for hvor mange personer opskriften skal være til
        System.out.print("Til hvor mange personer skal der være?: ");
        Scanner keyboard = new Scanner(System.in);
        portion = keyboard.nextInt();
        return portion;
    }

    public void printIngredient(int portion) {
        //Kriterie for listen af ingredienser er at den er stillet nydeligt op!
        String heading2 = "Opskrift på værdens lækreste Banankage! ";
        String heading1 = "Ingredienser:";
        //Det pynter med et linjeskift
        System.out.println("");
        System.out.println("");
        //Overskrift
        System.out.printf("%12s %n", heading2);
        //Det pynter med et linjeskift
        System.out.println("");
        System.out.printf("%15s%n", heading1);
        System.out.println("");
        System.out.printf("%3.0f %s \t %s %n", mængdeÆg*portion , stykker, æg);
        System.out.printf("%3.0f %s \t %s %n", mængdeVaniljesukker*portion, teaSke, vaniljesukker);
        System.out.printf("%3.0f %s \t %s %n", mængdeBagepulver*portion, teaSke, bagepulver);
        System.out.printf("%.0f %s \t %s %n", mængdeSmør*portion, gram, smør);
        System.out.printf("%.0f %s \t %s %n", mængdeBananer*portion, gram, bananer);
        System.out.printf("%.0f %s \t %s %n", mængdeMæl*portion, gram, mæl);
        System.out.printf("%.0f %s \t %s %n", mængdeChokolade*portion, gram, chokolade);
        System.out.printf("%.0f %s \t %s %n", mængdeSukker*portion, gram, sukker);
    }

    public void printVægt(int portion) {
        //Omregn alle enheder til gram

        // Æggets vægt i gram
        double mængdeÆgIGram = (mængdeÆg * ægFaktor);
        // Vaniljesukkerets vægt i gram
        double mængdeVaniljesukkerIGram =  (mængdeVaniljesukker * tskVaniljesukkerFaktor);
        // Bagepulverets vægt i gram
        double mængdeBagepulverIGram = (mængdeBagepulver * tskBagepulverFaktor);

        //læg massen af hver ingredient i gram sammen
        // Den samlede masse af kagen
        double mængdeTotal= (mængdeÆgIGram + mængdeVaniljesukkerIGram
                          + mængdeBagepulverIGram + mængdeSmør
                          + mængdeBananer + mængdeMæl
                          + mængdeChokolade + mængdeSukker) * portion;

        System.out.println();
        System.out.printf("Den samlede vægt er: %.2f %s %n", mængdeTotal, gram );
        System.out.println();


        //Efter kagen har været i ovnen vejer kagen 10% mindre
        double mængdeBagt = (mængdeTotal * 0.9);
        System.out.println();
        System.out.printf("Når kagen har været i ovnen vejer den nu: %1.2f %s %n", mængdeBagt, gram);
        System.out.println();

    }
}

public class Main {
    public static void main(String[] args) {
        Ingredients obj = new Ingredients();
        int portion = obj.inputPortion();

        obj.printIngredient(portion);
        obj.printVægt(portion);

    }
}
