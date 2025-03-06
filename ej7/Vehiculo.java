package ej7;

public abstract class Vehiculo {
    int vehiculosCreados;
    private static int kilometrosTotales;
    protected int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
        this.kilometrosRecorridos=0;
    }

    public void recorrerKilometros(int km){
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    public static int getkilometrosTotales(){
        return kilometrosTotales;
    }

    public int getkilometrosRecorridos(){
        return kilometrosRecorridos;
    }
}
