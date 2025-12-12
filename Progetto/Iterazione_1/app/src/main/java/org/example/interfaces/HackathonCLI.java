package org.example.interfaces;

import java.util.Scanner;

public class HackathonCLI {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static Scanner scanner = new Scanner(System.in);

    public static int menu() {

        System.out.println();

        System.out.println(ANSI_CYAN + "╔════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_YELLOW + "           MENU PRINCIPALE              " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "╠════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_CYAN + "║ " + ANSI_RESET + "1. Crea nuovo Hackathon                " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║ " + ANSI_RED +   "0. Esci                                " + ANSI_CYAN + "║" + ANSI_RESET);

        System.out.println(ANSI_CYAN + "╚════════════════════════════════════════╝" + ANSI_RESET);

        System.out.print("\nSeleziona un'opzione: ");

        while (!scanner.hasNextInt()) {
            System.out.println(ANSI_RED + "Inserisci un numero valido!" + ANSI_RESET);
            System.out.print("Seleziona un'opzione: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
}
