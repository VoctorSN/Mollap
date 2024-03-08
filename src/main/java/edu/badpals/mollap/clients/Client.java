package edu.badpals.mollap.clients;

import edu.badpals.mollap.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques programador);
    public void enviarPeticio(String peticion);
}
