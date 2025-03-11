package ej7;

public class Coche extends Vehiculo {
    public void andar(){
        System.out.println("El coche está en marcha");
        recorrerKilometros(10);
    }

    public void quemarRueda(){
        System.out.println("Quemando rueda con el coche");
    }

    
}
