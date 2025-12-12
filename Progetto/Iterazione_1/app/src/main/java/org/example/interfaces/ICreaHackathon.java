package org.example.interfaces;

import org.example.hackathon.GestoreHackathon;
import org.example.hackathon.Hackathon;

public class ICreaHackathon {
    GestoreHackathon gestoreHackathon = new GestoreHackathon();

    public Hackathon creaHackathon() {
        gestoreHackathon.inserisciInformazioni();
        gestoreHackathon.inserisciGiudice();
        gestoreHackathon.inserisciMentore();
        return gestoreHackathon.creazioneHackathon();
    }

    private void mostraFormDati() {
        throw new UnsupportedOperationException();
    }

    private void inserisciDati() {
        throw new UnsupportedOperationException();
    }

    private void notificaErrore() {
        throw new UnsupportedOperationException();
    }

    private void mostraFormGiudice() {
        throw new UnsupportedOperationException();
    }

    private void selezionaGiudice() {
        throw new UnsupportedOperationException();
    }

    private void mostraFormMentori() {
        throw new UnsupportedOperationException();
    }

    private void selezionaMentori() {
        throw new UnsupportedOperationException();
    }

    private void aggiungiMentore() {
        throw new UnsupportedOperationException();
    }

    private void notificaCreazioneHackathon() {
        throw new UnsupportedOperationException();
    }
}
