package org.example.hackathon;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString
public class Organizzatore {

	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String email;
	private String password;
	private LocalDateTime dataCreazione;
	private String cellulare;
	private Set<Hackathon> iMieiHackathon;

    public Organizzatore(int id, String nome, String cognome, LocalDate dataNascita, String email, String password,  LocalDateTime dataCreazione, String cellulare) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.email = email;
        this.password = password;
        this.dataCreazione = dataCreazione;
        this.cellulare = cellulare;

    }
}
