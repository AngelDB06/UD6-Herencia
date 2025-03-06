package ej6;

public class Profesor extends Persona {
    String especialidad;
    double salario;

    public Profesor(String nombre, String apellido, String especialidad, double salario) {
        super(nombre, apellido);
        this.especialidad = especialidad;
        this.salario = salario;
        }

    void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Salario: " + salario);
    }
} 
