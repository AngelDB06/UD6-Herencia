package ej8;

public class Libro extends Publicacion implements Prestable {
    public boolean prestado=false;
    
    public Libro(int ISBN, int año, String Titulo){
        super(ISBN, año, Titulo);
        this.prestado=false;
    }

    public void presta(){
        if (this.estaPrestado()) {
            System.out.println("Lo siento, el libro ya está prestado");
        } else {
            this.prestado= true;
        }
    }

    public void devuelve(){
        this.prestado= false;
    }

    public boolean estaPrestado(){
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString()+" "+(this.prestado ? "Prestado" : "No prestado");
    }
}
