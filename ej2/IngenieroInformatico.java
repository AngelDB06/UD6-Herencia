package ej2;

public class IngenieroInformatico extends Ingeniero{
    
    public IngenieroInformatico(){
        super();
    }

    public IngenieroInformatico(String N, int a, int e){
        super(N, a, e);
    }
    
    public void crearPrograma(){
        System.out.println("Estoy creando un programa");
    }
}
