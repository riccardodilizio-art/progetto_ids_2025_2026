package org.example.hackathon;

public class Mentore {
    private int Id;
    private String Nome;

    public Mentore(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
    }

    public void setId(int id) {
        Id = id;
    }
    public int getId() {
        return Id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Mentore{" +
                ", Nome='" + Nome + '\'' +
                '}';
    }
}
