package org.example.hackathon;

import java.time.LocalDateTime;
import java.util.Set;

public class HackathonBuilderImplement implements HackathonBuilder {
    private final Hackathon hackathon;

    public HackathonBuilderImplement(){
        this.hackathon = new Hackathon();
        this.hackathon.setStato(Stato.inPreparazione);
    }


    @Override
    public HackathonBuilder nome(String nome) {
        hackathon.setNome(nome);
        return this;
    }

    @Override
    public HackathonBuilder regolamento(String regolamento) {
        hackathon.setRegolamento(regolamento);
        return this;
    }

    @Override
    public HackathonBuilder scadenzaIscrizione(LocalDateTime scadenzaIscrizione) {
        hackathon.setScadenzaIscrizioni(scadenzaIscrizione);
        return this;
    }

    @Override
    public HackathonBuilder dataInizio(LocalDateTime dataInizio) {
        hackathon.setDataInizio(dataInizio);
        return this;
    }

    @Override
    public HackathonBuilder dataFine(LocalDateTime dataFine) {
        hackathon.setDataFine(dataFine);
        return this;
    }

    @Override
    public HackathonBuilder luogo(String luogo) {
        hackathon.setLuogo(luogo);
        return this;
    }

    @Override
    public HackathonBuilder premio(double premio) {
        hackathon.setPremio(premio);
        return this;
    }

    @Override
    public HackathonBuilder dimensioneMassimaTeam(int dimensioneMassimaTeam) {
        hackathon.setDimensioneMassimaTeam(dimensioneMassimaTeam);
        return this;
    }

    @Override
    public HackathonBuilder dimensioneMinimaTeam(int dimensioneMinimaTeam) {
        hackathon.setDimensioneMinimaTeam(dimensioneMinimaTeam);
        return this;
    }

    @Override
    public HackathonBuilder giudice(Giudice giudice) {
        hackathon.setGiudice(giudice);
        return this;
    }

    @Override
    public HackathonBuilder mentori(Set<Mentore> mentori) {
        hackathon.setMentori(mentori);
        return this;
    }


    @Override
    public HackathonBuilder organizzatore(Organizzatore organizzatore) {
        hackathon.setOrganizzatore(organizzatore);
        return this;
    }

    @Override
    public HackathonBuilder teams(Set<String> teams) {
        hackathon.setTeams(teams);
        return this;
    }

    @Override
    public HackathonBuilder argomento(String argomento) {
        hackathon.setArgomento(argomento);
        return this;
    }

    @Override
    public HackathonBuilder sottomissioni(Set<String> sottomissioni) {
        hackathon.setSottomissioni(sottomissioni);
        return this;
    }

    @Override
    public HackathonBuilder numeroMassimoPersone(int numeroMassimoPersone) {
        hackathon.setNumeroMassimoPersone(numeroMassimoPersone);
        return this;
    }

    @Override
    public HackathonBuilder numeroMinimoPersone(int numeroMinimoPersone) {
        hackathon.setNumeroMinimoPersone(numeroMinimoPersone);
        return this;
    }

    public Hackathon build() {
        //DA CAPIRE SE INSERIRE UNA SORTA DI VALIDAZIONE
        return hackathon;
    }
}
