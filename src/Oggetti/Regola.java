package Oggetti;

import InterfacciaDosaggio.Dosaggio;

import java.util.ArrayList;
import java.util.Date;

public class Regola {
    private int etaMinimaRegola;
    private Farmaco farmacoRegola;
    private Date dataDistanzaMinima;
    private Date dataDistanzaMassima;
    private Dosaggio dosaggioRegola;
    private int Durata;
    private ArrayList<Farmaco> farmaciCompatibiliRegola;
}
