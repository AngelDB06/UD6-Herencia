package ej5;

public class Oficial extends Operario {
    public Oficial(){
    }

    public Oficial(String n){
        super(n);
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre+" -> Operario -> Oficial" ;
    }
}