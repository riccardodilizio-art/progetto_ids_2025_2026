package org.example.hackathon;
import java.time.LocalDateTime;

import java.util.HashSet;
import java.util.Set;

public class GestoreHackathon  {
    private final Set<Hackathon> hackathons;
    private HackathonBuilder hackathonBuilder;

    public GestoreHackathon(){
        hackathons = new HashSet<>();
    }


    private void inserisciInformazioni(String nome,
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
        hackathonBuilder = new HackathonBuilderImplement().nome(nome)
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

    private void inserisciGiudice(Giudice giudice) {
        hackathonBuilder.giudice(giudice);
    }

    private void inserisciMentore(Set<Mentore> mentori) {
        hackathonBuilder.mentori(mentori);
    }

    public Hackathon creazioneHackathon(String nome,
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
                                        int maxPer,
                                        Giudice giudice,
                                        Set<Mentore> mentori
                                        ) {

        this.inserisciInformazioni(nome,
                regolamento,
                scadenzaIscrizioni,
                inizio,
                fine,
                luogo,
                premio,
                argomento,
                minTeam,
                maxTeam,
                sottomissioni,
                organizzatore,
                minPer,
                maxPer);
        this.inserisciGiudice(giudice);
        this.inserisciMentore(mentori);
        Hackathon toBuild = hackathonBuilder.build();
        hackathons.add(toBuild);
        return toBuild;
    }

    public Set<Hackathon> getHackathons() {
        return hackathons;
    }
}
