package ej9;

public abstract class Vehiculo {
    int vehiculosCreados;
    protected static int kilometrosTotales;
    protected int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
        this.kilometrosRecorridos=0;
    }

    public void recorrerKilometros(int km){
        this.kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    public static void getkilometrosTotales(){
        System.out.println(kilometrosTotales);
    }

    public void getkilometrosRecorridos(){
        System.out.println(this.kilometrosRecorridos);
    }
}
