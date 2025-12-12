
package org.example;

import org.example.interfaces.HackathonCLI;
import org.example.interfaces.ICreaHackathon;

public class App {
    public static void main(String[] args) {

        HackathonCLI cli = new HackathonCLI();
        ICreaHackathon iCrea = new ICreaHackathon();
        int scelta = cli.menu();
        while(scelta != 0){
            switch (scelta){
                case 1: iCrea.creaHackathon();
                    break;
            }

            scelta = cli.menu();
        }


    }
}