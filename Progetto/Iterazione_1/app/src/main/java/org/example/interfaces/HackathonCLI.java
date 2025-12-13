package org.example.interfaces;

import org.example.hackathon.Giudice;
import org.example.hackathon.Mentore;
import org.example.mock.GestoreGiudici;
import org.example.mock.GestoreMentori;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        System.out.println(ANSI_CYAN + "║ " + ANSI_RED + "0. Esci                                " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "╚════════════════════════════════════════╝" + ANSI_RESET);
        System.out.print("\nSeleziona un'opzione: ");

        while (!scanner.hasNextInt()) {
            System.out.println(ANSI_RED + "Inserisci un numero valido!" + ANSI_RESET);
            System.out.print("Seleziona un'opzione: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static int formGiudici() {
        Set<Giudice> giudici = GestoreGiudici.getAllGiudici();
        Giudice[] giudiciArray = giudici.toArray(new Giudice[0]);

        System.out.println();
        System.out.println(ANSI_CYAN + "╔════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_YELLOW + "         SCEGLI GIUDICE                 " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "╠════════════════════════════════════════╣" + ANSI_RESET);

        for (int i = 0; i < giudiciArray.length; i++) {
            String line = String.format("║ %d. %-35s║", (i + 1), giudiciArray[i].getNome());
            System.out.println(ANSI_CYAN + line + ANSI_RESET);
        }

        System.out.println(ANSI_CYAN + "╚════════════════════════════════════════╝" + ANSI_RESET);
        System.out.print("\nSeleziona un'opzione: ");

        while (!scanner.hasNextInt()) {
            System.out.println(ANSI_RED + "Inserisci un numero valido!" + ANSI_RESET);
            System.out.print("Seleziona un'opzione: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static List<Integer> formMentori() {
        Set<Mentore> mentori = GestoreMentori.getAllMentori();
        Mentore[] mentoriArray = mentori.toArray(new Mentore[0]);

        System.out.println();
        System.out.println(ANSI_CYAN + "╔════════════════════════════════════════╗" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "║" + ANSI_YELLOW + "         SCEGLI MENTORI                 " + ANSI_CYAN + "║" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "╠════════════════════════════════════════╣" + ANSI_RESET);

        for (int i = 0; i < mentoriArray.length; i++) {
            String line = String.format("║ %d. %-35s║", (i + 1), mentoriArray[i].getNome());
            System.out.println(ANSI_CYAN + line + ANSI_RESET);
        }

        System.out.println(ANSI_CYAN + "╚════════════════════════════════════════╝" + ANSI_RESET);
        System.out.print("\nInserisci i numeri separati da virgola (es: 1,3,5): ");

        scanner.nextLine(); // Consuma newline
        String input = scanner.nextLine().trim();
        String[] scelte = input.split(",");

        List<Integer> scelteValide = new ArrayList<>();
        for (String s : scelte) {
            try {
                int numero = Integer.parseInt(s.trim());
                if (numero > 0 && numero <= mentoriArray.length) {
                    scelteValide.add(numero);
                }
            } catch (NumberFormatException e) {
                // Ignora input non validi
            }
        }

        return scelteValide;
    }
}