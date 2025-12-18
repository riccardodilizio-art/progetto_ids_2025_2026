package org.example.hackathon;
import java.time.LocalDateTime;

import java.util.Set;

public class GestoreHackathon  {
    private final HackathonBuilder hackathonBuilder;

    public GestoreHackathon(){
        this.hackathonBuilder = new HackathonBuilderImplement();
    }


    public void inserisciInformazioni(String nome,
                                      String regolamento,
                                      LocalDateTime scadenzaIscrizioni,
                                      LocalDateTime inizio,
                                      LocalDateTime fine,
                                      String luogo,
                                      double premio,
                                      String argomento,
                                      int minTeam,
                                      int maxTeam,
                                      Set<String> sottomissioni,
                                      Organizzatore organizzatore,
                                      int minPer,
                                      int maxPer) {
        hackathonBuilder.nome(nome)
                .regolamento(regolamento)
                .scadenzaIscrizione(scadenzaIscrizioni)
                .dataInizio(inizio)
                .dataFine(fine)
                .luogo(luogo)
                .premio(premio)
                .argomento(argomento)
                .dimensioneMinimaTeam(minTeam)
                .dimensioneMassimaTeam(maxTeam)
                .sottomissioni(sottomissioni)
                .organizzatore(organizzatore)
                .numeroMinimoPersone(minPer)
                .numeroMassimoPersone(maxPer);
    }

    public void inserisciGiudice(Giudice  giudice) {
        hackathonBuilder.giudice(giudice);
    }

    public void inserisciMentore(Set<Mentore> mentori) {
        hackathonBuilder.mentori(mentori);
    }

    public Hackathon creazioneHackathon() {
        return hackathonBuilder.build();
    }
}
