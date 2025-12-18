package org.example.interfaces;

import org.example.hackathon.*;
import org.example.mock.GestoreGiudici;
import org.example.mock.GestoreMentori;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ICreaHackathon {

    private final GestoreHackathon gestoreHackathon = new GestoreHackathon();
    private Hackathon hackathonCorrente;

    public void creaHackathon() {

        System.out.println("\n=== CREAZIONE NUOVO HACKATHON ===\n");

        /* =========================
           1. Raccolta dati base
           ========================= */

        System.out.print("Nome Hackathon: ");
        String nome = HackathonCLI.scanner.nextLine();

        System.out.print("Regolamento: ");
        String regolamento = HackathonCLI.scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Data scadenza iscrizioni (dd/MM/yyyy HH:mm): ");
        LocalDateTime scadenzaIscrizioni =
                LocalDateTime.parse(HackathonCLI.scanner.nextLine(), formatter);

        System.out.print("Data inizio (dd/MM/yyyy HH:mm): ");
        LocalDateTime dataInizio =
                LocalDateTime.parse(HackathonCLI.scanner.nextLine(), formatter);

        System.out.print("Data fine (dd/MM/yyyy HH:mm): ");
        LocalDateTime dataFine =
                LocalDateTime.parse(HackathonCLI.scanner.nextLine(), formatter);

        System.out.print("Luogo: ");
        String luogo = HackathonCLI.scanner.nextLine();

        double premio = 0;
        while (premio <= 0) {
            System.out.print("Premio: ");
            try {
                premio = Double.parseDouble(HackathonCLI.scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un valore numerico valido.");
            }
        }

        int minTeam = 0;
        while (minTeam <= 0) {
            System.out.print("Numero minimo membri team: ");
            try {
                minTeam = Integer.parseInt(HackathonCLI.scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }

        int maxTeam = 0;
        while (maxTeam < minTeam) {
            System.out.print("Numero massimo membri team: ");
            try {
                maxTeam = Integer.parseInt(HackathonCLI.scanner.nextLine().trim());
                if (maxTeam < minTeam) {
                    System.out.println("Il massimo deve essere ≥ del minimo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }


        System.out.print("Argomento: ");
        String argomento = HackathonCLI.scanner.nextLine();

        int n = 0;
        while (n <= 0) {
            System.out.print("Inserisci il numero di sottomissioni: ");
            String input = HackathonCLI.scanner.nextLine().trim();
            try {
                n = Integer.parseInt(input);
                if (n <= 0) {
                    System.out.println("Il numero deve essere maggiore di 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido!");
            }
        }


        Set<String> sottomissioni = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Inserisci sottomissione " + i + ": ");
            String sottomissione = HackathonCLI.scanner.nextLine().trim();
            if (!sottomissione.isEmpty()) {
                sottomissioni.add(sottomissione);
            } else {
                System.out.println("La sottomissione non può essere vuota!");
                i--;
            }
        }

        int minPer = 0;
        while (minPer <= 0) {
            System.out.print("Numero minimo di persone : ");
            try {
                minPer = Integer.parseInt(HackathonCLI.scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }

        int maxPer = 0;
        while (maxPer < minPer) {
            System.out.print("Numero massimo di persone: ");
            try {
                maxPer = Integer.parseInt(HackathonCLI.scanner.nextLine().trim());
                if (maxPer < minPer) {
                    System.out.println("Il massimo deve essere ≥ del minimo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
        }


        Organizzatore organizzatore = new Organizzatore(
                1, "Riccardo", "Di Lizio",
                LocalDate.of(2004, 9, 18),
                "dlz.riccardo@gmail.com",
                "1234",
                LocalDateTime.now(),
                "3713405167"
        );



        /* =========================
           2. Selezione giudice (CLI)
           ========================= */

        int sceltaGiudice = HackathonCLI.formGiudici();
        Giudice giudiceSelezionato =
                GestoreGiudici.getAllGiudici().toArray(new Giudice[0])[sceltaGiudice - 1];


        /* =========================
           3. Selezione mentori (CLI)
           ========================= */

        List<Integer> scelteMentori = HackathonCLI.formMentori();
        Set<Mentore> mentoriSelezionati = new HashSet<>();

        Mentore[] mentoriDisponibili =
                GestoreMentori.getAllMentori().toArray(new Mentore[0]);

        for (int i : scelteMentori) {
            mentoriSelezionati.add(mentoriDisponibili[i - 1]);
        }


        /* =========================
           4. Creazione Hackathon
           ========================= */

        hackathonCorrente = gestoreHackathon.creazioneHackathon(
                nome,
                regolamento,
                scadenzaIscrizioni,
                dataInizio,
                dataFine,
                luogo,
                premio,
                argomento,
                minTeam,
                maxTeam,
                sottomissioni,
                organizzatore,
                maxPer,
                minPer,
                giudiceSelezionato,
                mentoriSelezionati
                );

        System.out.println("\nHackathon creato con successo:\n");
        System.out.println(hackathonCorrente);
    }
}
