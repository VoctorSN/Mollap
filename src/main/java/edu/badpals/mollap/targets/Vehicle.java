package edu.badpals.mollap.targets;

public class Vehicle implements Target{
    public Vehicle(){}
    public void execucio(String nombre){
        System.out.println("Puerta abierta " + nombre + "!");
    }
}
