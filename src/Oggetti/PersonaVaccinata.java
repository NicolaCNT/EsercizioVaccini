package Oggetti;

import Enumerazioni.NomePatologia;

import java.util.ArrayList;

public class PersonaVaccinata {
    private String nomePersona;
    private String cognomePersona;
    private String codiceFiscalePersona;
    private int etaPersona;
    private ArrayList<Patologia> patologiePersona;

    public PersonaVaccinata(String nome, String cognome, String codiceFiscale, int eta, ArrayList<Patologia> patologie){
        this.nomePersona = nome;
        this.cognomePersona = cognome;
        this.codiceFiscalePersona = codiceFiscale;
        this.etaPersona = eta;
        this.patologiePersona = patologiePersona;
    }
}
