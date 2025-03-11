package ej8;

public class Libro extends Publicacion implements Prestable {
    public boolean prestado=false;
    
    public Libro(int ISBN, int año, String Titulo){
        super(ISBN, año, Titulo);
    }

    public void presta(){
        if (this.estaPrestado()) {
            System.out.println("El libro está prestado");
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
        return super.toString()+(" "+this.prestado != null ? "Prestado" : "No prestado");
    }
}
