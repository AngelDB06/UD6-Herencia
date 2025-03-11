package ej9;

public class Coche extends Vehiculo implements Arrancable {
    private boolean arrancado=false;

    public void andar(){
        System.out.println("El coche está en marcha");
        recorrerKilometros(10);
    }

    public void quemarRueda(){
        System.out.println("Quemando rueda con el coche");
    }

    public void arrancar(){
        System.out.println("El coche está arrancado");
        this.arrancado=true;
    }

    public void detener(){
        System.out.println("El coche está detenido");
        this.arrancado=false;
    }

    public void estaArrancado(){
        if (this.arrancado) {
            System.out.println("Está arrancado");
        } else {
            System.out.println("No está arrancado");
        }
    }

}
