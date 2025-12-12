package org.example.hackathon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Giudice {

	private int id;
	private String Nome;

    public Giudice(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }
}
