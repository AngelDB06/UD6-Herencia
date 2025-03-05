package ej5;

public abstract class Empleado {
    protected String nombre=" ";

    public Empleado(){
    }

    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String n){
        nombre=n;
    }

    @Override
    public abstract String toString();
}