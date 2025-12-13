package org.example.mock;

import org.example.hackathon.Giudice;
import org.example.hackathon.Mentore;

import java.util.HashSet;
import java.util.Set;

public class GestoreMentori {
    public static Set<Mentore> getAllMentori() {
        Set<Mentore> mentori = new HashSet<>();
        mentori.add(new Mentore(1,"Marco"));
        mentori.add(new Mentore(2,"Riccardo"));
        mentori.add(new Mentore(3,"Alberto"));

        return mentori;
    }
}
