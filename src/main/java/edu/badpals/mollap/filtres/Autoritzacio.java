package edu.badpals.mollap.filtres;

public class Autoritzacio implements Filtre{
    public Autoritzacio(){}

    @Override
    public void execucio(String nombre) {
        System.out.println("Autorizacion OK para " + nombre);
    }

}
