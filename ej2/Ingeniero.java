package ej2;

import ej1.Persona;

public class Ingeniero extends Persona{
    public Ingeniero(){
        super();
    }

    public Ingeniero(String N, int a, int e){
        super(N, a, e);
    }

    public void razonar(){
        System.out.println("Estoy razonando");
    }

    public  void trabajarEnGrupo(){
        System.out.println("Puedo trabajar en grupo");
    }
}
