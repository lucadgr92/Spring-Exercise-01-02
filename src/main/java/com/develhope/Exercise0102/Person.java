package com.develhope.Exercise0102;

public class Person {
    public String nome, provincia, saluto;

    public Person(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + this.nome + ", come è il tempo in " + this.provincia + "?";
    }
}
