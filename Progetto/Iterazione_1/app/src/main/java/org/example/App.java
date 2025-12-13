package org.example;

import org.example.interfaces.HackathonCLI;
import org.example.interfaces.ICreaHackathon;

public class App {
    public static void main(String[] args) {
        ICreaHackathon iCrea = new ICreaHackathon();
        int scelta = HackathonCLI.menu();

        while (scelta != 0) {
            if (scelta == 1) {
                iCrea.creaHackathon();
            } else {
                System.out.println(HackathonCLI.ANSI_RED + "Opzione non valida!" + HackathonCLI.ANSI_RESET);
            }
            scelta = HackathonCLI.menu();
        }

        System.out.println("\n" + HackathonCLI.ANSI_GREEN + "Fine programma! Ciao" + HackathonCLI.ANSI_RESET);
        HackathonCLI.scanner.close();
    }
}