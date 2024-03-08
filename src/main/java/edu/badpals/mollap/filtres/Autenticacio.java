package edu.badpals.mollap.filtres;

public class Autenticacio implements Filtre{
    public Autenticacio(){}
    @Override
    public void execucio(String nombre) {
        System.out.println("Autenticacion OK para " + nombre);
    }
}
