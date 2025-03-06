package ej6;

import java.util.GregorianCalendar;

public abstract class Persona {
    String nombre;
    String apellidos;
    GregorianCalendar fechaNacim;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
 

    abstract void mostrar();
}
