package org.example.hackathon;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
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

}