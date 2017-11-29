package com.company;

import java.util.Scanner;

public class antPopieriaus {

    public void popier() {


        //Ivadamas atlygis ant popieriaus
        Scanner input1 = new Scanner(System.in);
        //Ivedame vaiku skaiciu
        Scanner input2 = new Scanner(System.in);
        //Idame tevu skaiciu
        Scanner input3 = new Scanner(System.in);

        System.out.println("Iveskite atlyginimą ant popieriaus: ");
        double atlyginimas = input1.nextDouble();

        System.out.println("Iveskite turimų vaikų iki 18 metų skaičių.");
        int vaikai = input2.nextInt();
        if (vaikai == 0) {

            //Apskaiciuojame NPD
            double npd = 310 - 0.5 * (atlyginimas - 380);
            if (npd >= 0)
                System.out.println("NPD: " + npd);
            else
                System.out.println("NPD: " + 0);

            //Bendras NPD
            double bnpd = npd;
            System.out.println("Bendras NPD: " + bnpd);

            //Darbuotojo mokesciai
            System.out.println("\nDarboutojo mokesčiai:");

            //Apskaiciuojame GPM
            //Gauname neapmokestinama dali
            double nep = atlyginimas - bnpd;

            //GPM 15%
            double gpm = nep * 1.15 - nep;
            System.out.printf("Pajamu mokestis (GPM): %.2f %n", gpm);

            //Apskaiciuojame PSD 6%
            double psd = atlyginimas * 1.06 - atlyginimas;
            System.out.printf("Sveikatos draudimas (PSD): %.2f %n", psd);

            //Apskaiciuojame pensija ir soc draudima 3%
            double soc = atlyginimas * 1.03 - atlyginimas;
            System.out.printf("Pensijų ir soc. Draudimas: %.2f %n", soc);


            //Darbdavio mokesciai
            System.out.println("\nDabdavio mokami mokesčiai:");

            //Sodros imoka 30.98%
            double sod = atlyginimas * 1.3098 - atlyginimas;
            System.out.printf("Sodros įmoka (VSD): %.2f %n", sod);

            // Imoka i garantini fonda 0.2%
            double gar = atlyginimas * 1.002 - atlyginimas;
            System.out.printf("Įmokos į Garantinį fondą: %.2f %n", gar);

            //Uzmokestis i rankas
            double rank = atlyginimas - gpm - psd - soc;
            System.out.printf("%nUžmokestis gaunamas į rankas: %.2f %n", rank);

            //Darbo vietos kaina
            double viet = atlyginimas + sod + gar;
            System.out.printf("Darbo vietos kaina darbdaviui: %.2f", viet);


        } else {

            System.out.println("Keliese auginate vaikus?");
            int tevai = input3.nextInt();


            //Apskaiciuojame NPD
            double npd = 310 - 0.5 * (atlyginimas - 380);
            if (npd >= 0)
                System.out.println("NPD: " + npd);
            else
                System.out.println("NPD: " + 0);

            //Apskaiciuojame PNPD
            double pnpd = (200 * vaikai) / tevai;
            System.out.println("PNPD: " + pnpd);

            //Bendras NPD
            double bnpd = npd + pnpd;
            System.out.println("Bendras NPD: " + bnpd);

            //Darbuotojo mokesciai
            System.out.println("\nDarboutojo mokesčiai:");

            //Apskaiciuojame GPM
            //Gauname neapmokestinama dali
            double nep = atlyginimas - bnpd;

            //GPM 15%
            double gpm = nep * 1.15 - nep;
            System.out.printf("Pajamu mokestis (GPM): %.2f %n", gpm);

            //Apskaiciuojame PSD 6%
            double psd = atlyginimas * 1.06 - atlyginimas;
            System.out.printf("Sveikatos draudimas (PSD): %.2f %n", psd);

            //Apskaiciuojame pensija ir soc draudima 3%
            double soc = atlyginimas * 1.03 - atlyginimas;
            System.out.printf("Pensijų ir soc. Draudimas: %.2f %n", soc);


            //Darbdavio mokesciai
            System.out.println("\nDabdavio mokami mokesčiai:");

            //Sodros imoka 30.98%
            double sod = atlyginimas * 1.3098 - atlyginimas;
            System.out.printf("Sodros įmoka (VSD): %.2f %n", sod);

            // Imoka i garantini fonda 0.2%
            double gar = atlyginimas * 1.002 - atlyginimas;
            System.out.printf("Įmokos į Garantinį fondą: %.2f %n", gar);

            //Uzmokestis i rankas
            double rank = atlyginimas - gpm - psd - soc;
            System.out.printf("%nUžmokestis gaunamas į rankas: %.2f %n", rank);

            //Darbo vietos kaina
            double viet = atlyginimas + sod + gar;
            System.out.printf("Darbo vietos kaina darbdaviui: %.2f", viet);

        }



    }
}