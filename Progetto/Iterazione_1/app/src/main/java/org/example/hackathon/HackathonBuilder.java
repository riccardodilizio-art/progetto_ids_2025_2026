package org.example.hackathon;

import java.time.LocalDateTime;
import java.util.Set;

public interface HackathonBuilder {
    HackathonBuilder nome(String nome);
    HackathonBuilder regolamento(String regolamento);
    HackathonBuilder scadenzaIscrizione(LocalDateTime scadenzaIscrizione);
    HackathonBuilder dataInizio(LocalDateTime dataInizio);
    HackathonBuilder dataFine(LocalDateTime dataFine);
    HackathonBuilder luogo(String luogo);
    HackathonBuilder premio(double premio);
    HackathonBuilder dimensioneMassimaTeam(int dimensioneMassimaTeam);
    HackathonBuilder dimensioneMinimaTeam(int dimensioneMinimaTeam);
    HackathonBuilder giudice(Giudice giudice);
    HackathonBuilder mentori(Set<Mentore> mentori);
    HackathonBuilder organizzatore(Organizzatore organizzatore);
    HackathonBuilder teams(Set<String> teams);
    HackathonBuilder argomento(String argomento);
    HackathonBuilder sottomissioni(Set<String> sottomissioni);
    HackathonBuilder numeroMassimoPersone(int numeroMassimoPersone);
    HackathonBuilder numeroMinimoPersone(int numeroMinimoPersone);
    Hackathon build();
}
