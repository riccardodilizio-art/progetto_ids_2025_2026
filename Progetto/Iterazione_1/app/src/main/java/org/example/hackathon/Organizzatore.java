package org.example.hackathon;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class Organizzatore {

	private int id;
	private String nome;
	private String cognome;
	private LocalDateTime dataNascita;
	private String email;
	private String password;
	private LocalDateTime dataCreazione;
	private String cellulare;
	private Set<Hackathon> iMieiHackathon;

}