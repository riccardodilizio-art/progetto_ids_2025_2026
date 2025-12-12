package org.example.interfaces;

import java.util.Scanner;

public class HackathonCLI {

    // --- Definizioni Colori ANSI ---
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        // Pulisco un po' la console prima di stampare (opzionale)
        System.out.println();

        // Esempio: Bordo Ciano, Titolo Giallo
        System.out.println(ANSI_CYAN + "╔════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_YELLOW + "           MENU PRINCIPALE              " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "╠════════════════════════════════════════╣" + ANSI_RESET);

        // Esempio: Opzioni in verde (o default)
        System.out.println(ANSI_CYAN + "║ " + ANSI_RESET + "1. Crea nuovo Hackathon                " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║ " + ANSI_RED +   "0. Esci                                " + ANSI_CYAN + "║" + ANSI_RESET);

        System.out.println(ANSI_CYAN + "╚════════════════════════════════════════╝" + ANSI_RESET);

        System.out.print("\nSeleziona un'opzione: ");

        // Controllo base per evitare crash se l'utente inserisce lettere
        while (!scanner.hasNextInt()) {
            System.out.println(ANSI_RED + "Inserisci un numero valido!" + ANSI_RESET);
            System.out.print("Seleziona un'opzione: ");
            scanner.next(); // consuma input non valido
        }

        int x = scanner.nextInt();
        //scanner.close();
        return x;
    }
}
