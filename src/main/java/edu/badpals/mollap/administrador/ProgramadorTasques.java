package edu.badpals.mollap.administrador;

import edu.badpals.mollap.filtres.Filtre;
import edu.badpals.mollap.targets.Target;

public class ProgramadorTasques {
    private Tasques tasca;
    public ProgramadorTasques(Target vehiculo){
        tasca = new Tasques();
        getTasques().setTarget(vehiculo);
    }

    public Tasques getTasques() {
        return tasca;
    }

    public void setTasca(Filtre filtre) {
        getTasques().afegirTasca(filtre);
    }
    public void executarTasques(String execucio){
        getTasques().execucio(execucio);
    }
}
