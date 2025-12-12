package org.example.hackathon;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.HashSet;
import java.util.Set;

public class GestoreHackathon {
    private final Hackathon.HackathonBuilder hackathonBuilder;

    public GestoreHackathon(){
        this.hackathonBuilder = Hackathon.builder();
    }

    public void inserisciInformazioni() {
        Organizzatore org = new Organizzatore(
                1,
                "Riccardo",
                "Di lizio",
                LocalDate.of(2004,9, 18),
                "dlz.riccardo@gmail.com",
                "1234",
                LocalDateTime.now(),
        "3713405167");

        Set<String> team =  new HashSet<>();
        team.add("Roberto");
        team.add("Alberto");
        team.add("Giulio");

        Set<String> sottomissioni = new HashSet<>();
        sottomissioni.add("step1");
        sottomissioni.add("step2");
        sottomissioni.add("step3");

        hackathonBuilder
                .nome("hackathon macerata")
                .regolamento("aperte le iscrizioni")
                .scadenzaIscrizioni(LocalDateTime.of(2025,11,30, 10,0))
                .dataInizio(LocalDateTime.of(2025,12,5,10,0))
                .dataFine(LocalDateTime.of(2025,12,6,10,0))
                .luogo("Macerata")
                .premio(200.0)
                .dimensioneMinimaTeam(2)
                .dimensioneMassimaTeam(25)
                .numeroMinimoPersone(2)
                .numeroMassimoPersone(5)
                .organizzatore(org)
                .sottomissioni(sottomissioni)
                .argomento("AI")
                .stato(Stato.inPreparazione)
                .teams(team);
    }

    public void inserisciGiudice() {
        Giudice giudice = new Giudice(1, "Sebastiano");
        hackathonBuilder.giudice(giudice);
    }

    public void inserisciMentore() {
        Set<Mentore> mentori = new HashSet<>();
        mentori.add(new Mentore(1, "Roberto"));
        mentori.add(new Mentore(2, "Alberto"));
        mentori.add(new Mentore(3,"Giulio"));
        hackathonBuilder.mentori(mentori);
    }

	public Hackathon creazioneHackathon() {
        return hackathonBuilder.build();
	}

}
