package ej4;

public class Oficial extends Operario {
    public Oficial(){
        super();
    }

    public Oficial(String n){
        super(n);
    }

    @Override
    public String toString(){
        return super.toString()+ " -> Oficial" ;
    }
}