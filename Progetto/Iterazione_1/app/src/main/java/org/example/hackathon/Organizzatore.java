package org.example.hackathon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

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

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
    public LocalDate getDataNascita() {
        return dataNascita;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setDataCreazione(LocalDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }
    public LocalDateTime getDataCreazione() {
        return dataCreazione;
    }
    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }
    public String getCellulare() {
        return cellulare;
    }

    public Set<Hackathon> getiMieiHackathon() {
        return iMieiHackathon;
    }

    public void setiMieiHackathon(Set<Hackathon> iMieiHackathon) {
        this.iMieiHackathon = iMieiHackathon;
    }

    @Override
    public String toString() {
        return "Organizzatore{" +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", cellulare='" + cellulare + '\'' +
                '}';
    }
}
