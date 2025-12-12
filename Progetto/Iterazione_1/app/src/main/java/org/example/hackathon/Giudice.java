package org.example.hackathon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Giudice {

	private int id;
	private String Nome;

    public Giudice(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }
}
