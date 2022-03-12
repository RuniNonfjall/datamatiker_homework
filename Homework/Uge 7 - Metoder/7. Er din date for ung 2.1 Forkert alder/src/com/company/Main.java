package com.company;

public class Main {


    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in);
        //int dinAlder = keyboard.nextInt();
        Main obj = new Main();
        //int dinAlder=15;
        double dinAlder=25;
        //double dinAlder= Math.PI;
        int i = obj.unAuthorisedInput(dinAlder);
        System.out.println(i);
    }

    public int unAuthorisedInput(double dinAlder) {
        //unAuthorisedInputs
        int i;
        boolean usableAge = false;

        while (!usableAge) {
            // tal der ikke giver mening i forbindelse med alder
            if (dinAlder % 1 !=0) {
                i=1;
                System.out.println("Du har tastet et ubrugeligt tal ind! ");
            }
            //60 = max tiladte dating alder
            else if (dinAlder > 60) {
                i=2;
                System.out.println("Du er for gammel til at gå på date!");
            }
            // 16 = lavest tilladte alder at gå på date
            else if (dinAlder < 16) {
                i=3;
                System.out.println("Du er for ung til at gå på date!");
            }
            else {
                i=4;
                usableAge = true;
                System.out.printf("din alder er %.0f %n", dinAlder);

            }
            return i;
        }
        return -1;
    }
}
