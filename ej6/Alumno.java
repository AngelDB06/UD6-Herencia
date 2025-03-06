package ej6;

public class Alumno extends Persona {
    String grupo;
    double notaMedia;

    public Alumno(String nombre, String apellidos, String grupo, double notaMedia) {
        super(nombre, apellidos);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellidos);
        System.out.println("Grupo: "+grupo);
        System.out.println("Nota media: "+notaMedia);
    }
} 
