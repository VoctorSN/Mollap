package edu.badpals.mollap.administrador;

import edu.badpals.mollap.filtres.Filtre;
import edu.badpals.mollap.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasques {
    private Target target;
    private List<Filtre> tasques = new ArrayList<>();
    public Tasques(){}

    public List<Filtre> getTasques() {
        return tasques;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void afegirTasca(Filtre tasca){
        getTasques().add(tasca);
    }

    public void execucio(String nombre){
        getTasques().forEach(i->i.execucio(nombre));
        getTarget().execucio(nombre);
    }
}
