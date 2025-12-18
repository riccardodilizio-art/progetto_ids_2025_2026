package org.example.mock;

import org.example.hackathon.Mentore;

import java.util.HashSet;
import java.util.Set;

public class GestoreMentori {
    public static Set<Mentore> getAllMentori() {
        Set<Mentore> mentori = new HashSet<>();
        mentori.add(new Mentore(1,"Alberto"));
        mentori.add(new Mentore(2,"Marco"));
        mentori.add(new Mentore(3,"Riccardo"));

        return mentori;
    }
}
