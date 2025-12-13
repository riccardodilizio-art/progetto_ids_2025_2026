package org.example.mock;

import org.example.hackathon.Giudice;

import java.util.HashSet;
import java.util.Set;

public class GestoreGiudici {
    public static Set<Giudice> getAllGiudici() {
        Set<Giudice> giudici = new HashSet<>();
        giudici.add(new Giudice(1,"Marco"));
        giudici.add(new Giudice(2,"Riccardo"));
        giudici.add(new Giudice(3,"Alberto"));

        return giudici;
    }
}
