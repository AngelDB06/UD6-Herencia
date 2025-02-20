package ej4;

public class Empleado {
    private String nombre=" ";

    public Empleado(){
        nombre="Vacío";
    }

    public Empleado(String n){
        nombre=n;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String n){
        nombre=n;
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre;
    }
}