package org.example.hackathon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mentore {
    private int Id;
    private String Nome;

    public Mentore(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
    }
}
