
package org.example;

import org.example.hackathon.Hackathon;
import org.example.interfaces.HackathonCLI;
import org.example.interfaces.ICreaHackathon;

public class App {
    public static void main(String[] args) {

        HackathonCLI cli = new HackathonCLI();
        ICreaHackathon iCrea = new ICreaHackathon();
        int scelta = cli.menu();
        while(scelta != 0){
            if (scelta == 1) {
                Hackathon hackathon = iCrea.creaHackathon();
                System.out.println(hackathon);
            }
            scelta = cli.menu();
        }
        System.out.println("Fine programma! Ciao");
    }
}
