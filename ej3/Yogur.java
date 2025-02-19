package ej3;

public class Yogur {
    protected double calorias=120.5;

    public double getcalorias(){
        return calorias;
    }

    @Override
    public String toString(){
        return "Calorias: "+calorias;
    }
}
