package edu.badpals.mollap.clients;

import edu.badpals.mollap.administrador.ProgramadorTasques;

public class Mollapp implements Client{
    private ProgramadorTasques programador;
    public Mollapp(){}

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String peticion) {
        programador.executarTasques(peticion);
    }
}
