package org.example.hackathon;


public class Giudice {

	private int id;
	private String Nome;

    public Giudice(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Giudice{" +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
