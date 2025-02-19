package ej1;

import ej2.Ingeniero;
import ej2.IngenieroInformatico;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1= new Persona("77035413H", 185, 18);
        Persona p2= new Persona();
        Ingeniero i1= new Ingeniero();
        Ingeniero i2= new Ingeniero("66123456Q", 180, 18);
        IngenieroInformatico if1=new IngenieroInformatico();
        IngenieroInformatico if2=new IngenieroInformatico("99999999Y", 170, 30);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(if2);
        i1.razonar();
        i1.trabajarEnGrupo();
        if1.crearPrograma();
    }
}
