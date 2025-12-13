// ICreaHackathon.java
package org.example.interfaces;

import org.example.hackathon.GestoreHackathon;
import org.example.hackathon.Hackathon;
import org.example.hackathon.Stato;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashSet;

public class ICreaHackathon {
    GestoreHackathon gestoreHackathon = new GestoreHackathon();
    private Hackathon hackathonCorrente;

    public void creaHackathon() {
        System.out.println("\n" + HackathonCLI.ANSI_GREEN + "=".repeat(50));
        System.out.println("     CREAZIONE NUOVO HACKATHON");
        System.out.println("=".repeat(50) + HackathonCLI.ANSI_RESET + "\n");

        this.mostraFormDati();
        this.inserisciDati();

        if (hackathonCorrente != null) {
            this.notificaCreazioneHackathon();
        }
    }

    private void mostraFormDati() {
        System.out.println(HackathonCLI.ANSI_CYAN + "═══════════════════════════════════════════");
        System.out.println("  INSERIMENTO DATI HACKATHON");
        System.out.println("═══════════════════════════════════════════" + HackathonCLI.ANSI_RESET + "\n");

        System.out.println("Compila i seguenti campi:");
        System.out.println("  • Nome Hackathon");
        System.out.println("  • Data inizio (gg/MM/yyyy HH:mm)");
        System.out.println("  • Data fine (gg/MM/yyyy HH:mm)");
        System.out.println("  • Luogo");
        System.out.println("  • Argomento");
        System.out.println("  • Numero massimo partecipanti");
        System.out.println();
    }

    private void inserisciDati() {
        HackathonCLI.scanner.nextLine(); // Consuma newline residuo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Nome
        System.out.print("Nome Hackathon: ");
        String nome = HackathonCLI.scanner.nextLine().trim();

        // Data inizio
        LocalDateTime dataInizio = null;
        while (dataInizio == null) {
            System.out.print("Data inizio (gg/MM/yyyy HH:mm): ");
            String inputData = HackathonCLI.scanner.nextLine().trim();
            try {
                dataInizio = LocalDateTime.parse(inputData, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(HackathonCLI.ANSI_RED + "Formato data non valido! Usa: gg/MM/yyyy HH:mm (es: 15/03/2024 10:00)" + HackathonCLI.ANSI_RESET);
            }
        }

        // Data fine
        LocalDateTime dataFine = null;
        while (dataFine == null) {
            System.out.print("Data fine (gg/MM/yyyy HH:mm): ");
            String inputData = HackathonCLI.scanner.nextLine().trim();
            try {
                dataFine = LocalDateTime.parse(inputData, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(HackathonCLI.ANSI_RED + "Formato data non valido! Usa: gg/MM/yyyy HH:mm (es: 17/03/2024 18:00)" + HackathonCLI.ANSI_RESET);
            }
        }

        // Luogo
        System.out.print("Luogo: ");
        String luogo = HackathonCLI.scanner.nextLine().trim();

        // Argomento
        System.out.print("Argomento: ");
        String argomento = HackathonCLI.scanner.nextLine().trim();

        // Numero massimo partecipanti
        int maxPartecipanti = 0;
        while (maxPartecipanti <= 0) {
            System.out.print("Numero massimo partecipanti: ");
            while (!HackathonCLI.scanner.hasNextInt()) {
                System.out.println(HackathonCLI.ANSI_RED + "Inserisci un numero valido!" + HackathonCLI.ANSI_RESET);
                System.out.print("Numero massimo partecipanti: ");
                HackathonCLI.scanner.next();
            }
            maxPartecipanti = HackathonCLI.scanner.nextInt();
            HackathonCLI.scanner.nextLine(); // Consuma newline

            if (maxPartecipanti <= 0) {
                System.out.println(HackathonCLI.ANSI_RED + "Il numero deve essere maggiore di 0!" + HackathonCLI.ANSI_RESET);
            }
        }

        // Validazione
        if (nome.isEmpty() || luogo.isEmpty() || argomento.isEmpty()) {
            this.notificaErrore();
            System.out.print("\nVuoi riprovare? (s/n): ");
            String risposta = HackathonCLI.scanner.nextLine().trim();
            if (risposta.equalsIgnoreCase("s")) {
                this.inserisciDati();
            } else {
                hackathonCorrente = null;
            }
            return;
        }

        // Crea l'hackathon usando il Builder di Lombok
        hackathonCorrente = Hackathon.builder()
                .nome(nome)
                .dataInizio(dataInizio)
                .dataFine(dataFine)
                .luogo(luogo)
                .argomento(argomento)
                .numeroMassimoPersone(maxPartecipanti)
                .stato(Stato.inPreparazione)
                .mentori(new HashSet<>())
                .teams(new HashSet<>())
                .sottomissioni(new HashSet<>())
                .build();

        System.out.println("\n" + HackathonCLI.ANSI_GREEN + "✓ Dati inseriti correttamente!" + HackathonCLI.ANSI_RESET + "\n");
    }

    private void notificaErrore() {
        System.out.println("\n" + HackathonCLI.ANSI_RED + "✗ Errore: tutti i campi sono obbligatori e devono essere validi." + HackathonCLI.ANSI_RESET);
    }

    private void notificaCreazioneHackathon() {
        System.out.println("\n" + HackathonCLI.ANSI_CYAN + "=".repeat(50));
        System.out.println("     RIEPILOGO HACKATHON");
        System.out.println("=".repeat(50) + HackathonCLI.ANSI_RESET);

        System.out.println("\n" + HackathonCLI.ANSI_YELLOW + "📋 DATI INSERITI:" + HackathonCLI.ANSI_RESET);
        System.out.println(hackathonCorrente);

        System.out.println("\n" + HackathonCLI.ANSI_CYAN + "=".repeat(50) + HackathonCLI.ANSI_RESET);

        System.out.print("\nConfermare la creazione? (s/n): ");
        String conferma = HackathonCLI.scanner.nextLine().trim();

        if (conferma.equalsIgnoreCase("s")) {
            //gestoreHackathon.aggiungiHackathon(hackathonCorrente);
            System.out.println("\n" + HackathonCLI.ANSI_GREEN + "✓ Hackathon creato con successo!");
            System.out.println("  ID: " + hackathonCorrente.getId() + HackathonCLI.ANSI_RESET + "\n");
        } else {
            System.out.println("\n" + HackathonCLI.ANSI_RED + "✗ Creazione annullata." + HackathonCLI.ANSI_RESET + "\n");
        }
    }
}