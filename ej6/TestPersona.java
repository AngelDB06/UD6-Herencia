package ej6;

public class TestPersona {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Juan", "Baldés", "Matemáticas", 19000);
        Alumno a1= new Alumno("Pepe", "García", "2B", 7.5);

        p1.mostrar();
        a1.mostrar();
    }
}
