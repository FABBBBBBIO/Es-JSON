package com.example;

import java.util.GregorianCalendar;

public class Alunno{
    String nome;
    String cognome;
    GregorianCalendar Dnascita;

    public Alunno(String nome, String cognome, GregorianCalendar Dnascita){
        this.nome=nome;
        this.cognome=cognome;
        this.Dnascita=Dnascita;
    }

    public Alunno(){

    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public GregorianCalendar getDnascita() {
        return this.Dnascita;
    }

    public void setDnascita(GregorianCalendar Dnascita) {
        this.Dnascita = Dnascita;
    }

}