package org.example.hackathon;

public enum Stato {
    inPreparazione,
    inIscrizione,
    inCorso,
    concluso;

    public Stato next() {
        return switch (this) {
            case inPreparazione -> inIscrizione;
            case inIscrizione -> inCorso;
            case inCorso, concluso -> concluso;
        };
    }
}
