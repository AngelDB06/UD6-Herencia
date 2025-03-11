package ej8;

public class Revista extends Publicacion {
    protected int numero;

    public Revista(int ISBN, int año, String titulo, int numero) {
        super(ISBN, año, titulo);
        this.numero = numero;
    }

    @Override
    public String toString() {
    return super.toString();
    }
}
