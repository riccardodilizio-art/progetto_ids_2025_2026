package org.example.hackathon;

import java.time.LocalDateTime;
import java.util.Set;


public class Hackathon {

	private int id;
	private String nome;
	private String regolamento;
	private LocalDateTime scadenzaIscrizioni;
	private LocalDateTime dataInizio;
	private LocalDateTime dataFine;
	private String luogo;
	private double premio;
	private int dimensioneMassimaTeam;
	private int dimensioneMinimaTeam;
	private Giudice giudice;
	private Set<Mentore> mentori;
	private String vincitore;
	private Stato stato;
	private Organizzatore organizzatore;
	private Set<String> teams;
	private String argomento;
	private Set<String> sottomissioni;
	private int numeroMinimoPersone;
	private int numeroMassimoPersone;

    @Override
    public String toString() {
        return "Hackathon{" +
                ", nome='" + nome + '\n'+
                ", regolamento='" + regolamento + '\n' +
                ", scadenzaIscrizioni=" + scadenzaIscrizioni + "\n" +
                ", dataInizio=" + dataInizio + "\n" +
                ", dataFine=" + dataFine + "\n" +
                ", luogo='" + luogo + '\n' +
                ", premio=" + premio + "\n" +
                ", dimensioneMassimaTeam=" + dimensioneMassimaTeam + "\n"+
                ", dimensioneMinimaTeam=" + dimensioneMinimaTeam + "\n"+
                ", giudice=" + giudice + "\n"+
                ", mentori=" + mentori + "\n"+
                ", stato=" + stato + "\n"+
                ", organizzatore=" + organizzatore + "\n"+
                ", teams=" + teams + "\n"+
                ", argomento='" + argomento + '\n' +
                ", sottomissioni=" + sottomissioni + "\n"+
                ", numeroMinimoPersone=" + numeroMinimoPersone + "\n"+
                ", numeroMassimoPersone=" + numeroMassimoPersone + "\n"+
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegolamento() {
        return regolamento;
    }
    public void setRegolamento(String regolamento) {
        this.regolamento = regolamento;
    }
    public LocalDateTime getScadenzaIscrizioni() {
        return scadenzaIscrizioni;
    }

    public void setScadenzaIscrizioni(LocalDateTime scadenzaIscrizioni) {
        this.scadenzaIscrizioni = scadenzaIscrizioni;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setDimensioneMassimaTeam(int dimensioneMassimaTeam) {
        this.dimensioneMassimaTeam = dimensioneMassimaTeam;
    }

    public int getDimensioneMassimaTeam() {
        return dimensioneMassimaTeam;
    }

    public int getDimensioneMinimaTeam() {
        return dimensioneMinimaTeam;
    }

    public void setDimensioneMinimaTeam(int dimensioneMinimaTeam) {
        this.dimensioneMinimaTeam = dimensioneMinimaTeam;
    }

    public void setGiudice(Giudice giudice) {
        this.giudice = giudice;
    }

    public Giudice getGiudice() {
        return giudice;
    }

    public void setMentori(Set<Mentore> mentori) {
        this.mentori = mentori;
    }

    public Set<Mentore> getMentori() {
        return mentori;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Stato getStato() {
        return stato;
    }

    public void setOrganizzatore(Organizzatore organizzatore) {
        this.organizzatore = organizzatore;
    }

    public Organizzatore getOrganizzatore() {
        return organizzatore;
    }

    public void setTeams(Set<String> teams) {
        this.teams = teams;
    }

    public Set<String> getTeams() {
        return teams;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setSottomissioni(Set<String> sottomissioni) {
        this.sottomissioni = sottomissioni;
    }

    public Set<String> getSottomissioni() {
        return sottomissioni;
    }

    public void setNumeroMinimoPersone(int numeroMinimoPersone) {
        this.numeroMinimoPersone = numeroMinimoPersone;
    }

    public int getNumeroMinimoPersone() {
        return numeroMinimoPersone;
    }

    public void setNumeroMassimoPersone(int numeroMassimoPersone) {
        this.numeroMassimoPersone = numeroMassimoPersone;
    }

    public int getNumeroMassimoPersone() {
        return numeroMassimoPersone;
    }
}
