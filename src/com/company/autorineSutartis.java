package com.company;

import java.util.Scanner;

public class autorineSutartis {

    public void autor() {

        double gpm;
        double soc;
        double socd;
        double iran;
        double darb;

        //Ivedame norima gauti suma ant popieriaus
        Scanner input1 = new Scanner(System.in);

        //Paklausiame ar dirba ar ne
        Scanner input2 = new Scanner(System.in);

        System.out.println("Įveskite norimą gauti atlygį ant popieriaus: ");
        double atlygis = input1.nextDouble();

        System.out.println("Pasirinkite Jūs dirbatis ar ne: 1 - dirbantis, 0 - nedirbatis");
        int darbas = input2.nextInt();
        if (darbas == 1) {

            //Autoriaus mokesciai
            System.out.println("Autoriaus mokesčiai: ");

            //GPM mokestis 15%
            gpm = atlygis * 1.15 - atlygis;
            System.out.printf("Gyventojų pajamų mokestis (GPM): %.2f", gpm);

            //Soc. draudimas 9%
            soc = atlygis * 1.09 - atlygis;
            System.out.printf("%nSocialinio draudimo mokesčiai: %.2f", soc);

            //Gaunama suma i rankas
            iran = atlygis - gpm - soc;
            System.out.printf("%n%nGaunama suma į rankas: %.2f", iran);

            //Uzsakovo mokesciai
            System.out.println("\n\nUžsakovo sumokami mokesčiai:");

            //Soc. draudimas 30,48%
            socd = atlygis * 1.3048 - atlygis;
            System.out.printf("Socialinio draudimo mokesčiai: %.2f", socd);


            //Uzsakovo suma
            darb = atlygis + socd;
            System.out.printf("%n%nUžsakymo kaina su mokesčiais: %.2f", darb);
        } else {
            //Autoriaus mokesciai
            System.out.println("Autoriaus mokesčiai: ");

            //GPM mokestis 15%
            gpm = atlygis * 1.15 - atlygis;
            System.out.printf("Gyventojų pajamų mokestis (GPM): %.2f", gpm);

            //Soc. draudimas 9%
            soc = (atlygis / 2) * 1.09 - (atlygis / 2);
            System.out.printf("%nSocialinio draudimo mokesčiai: %.2f", soc);

            //Gaunama suma i rankas
            iran = atlygis - gpm - soc;
            System.out.printf("%n%nGaunama suma į rankas: %.2f", iran);

            //Uzsakovo mokesciai
            System.out.println("\n\nUžsakovo sumokami mokesčiai:");

            //Soc. draudimas 30,48%
            socd = (atlygis / 2) * 1.2870 - (atlygis / 2);
            System.out.printf("Socialinio draudimo mokesčiai: %.2f", socd);


            //Uzsakovo suma
            darb = atlygis + socd;
            System.out.printf("%n%nUžsakymo kaina su mokesčiais: %.2f", darb);
        }


    }
}
