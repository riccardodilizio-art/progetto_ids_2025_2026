package org.example.hackathon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentore {
    private int Id;
    private String Nome;

    public Mentore(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
    }
}
