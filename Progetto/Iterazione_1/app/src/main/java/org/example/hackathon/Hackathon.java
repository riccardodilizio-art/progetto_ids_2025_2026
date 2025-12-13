package org.example.hackathon;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
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
}
