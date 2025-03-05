package ej5;

public abstract class Operario extends Empleado {
    public Operario(){
    }

    public Operario(String n){
        super(n);
    }

    @Override
    public abstract String toString();

}
