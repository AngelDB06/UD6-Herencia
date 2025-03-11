package ej8;

public abstract class Publicacion {
    protected int ISBN, año;
    protected String titulo;

    public Publicacion(int ISBN, int año, String titulo) {
        this.ISBN = ISBN;
        this.año = año;
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return "ISBN: " + ISBN + ",Titulo " + titulo + ", Año: "+año;
    }
}
