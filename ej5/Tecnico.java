package ej5;

public class Tecnico extends Operario {
    public Tecnico(){
    }

    public Tecnico(String n){
        super(n);
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre+" -> Operario -> Técnico";
    }
}
