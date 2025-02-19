package ej1;

public class Persona {
        private String NIF;
        private int altura, edad;

        public Persona(){
            NIF="111111111A";
            altura=175;
            edad=25;
        }
        
        public Persona(String N, int a, int e){
            NIF=N;
            altura=a;
            edad=e;
        }

        public String getNIF(){
            return NIF;
        }

        public int getaltura(){
            return altura;
        }

        public int getedad(){
            return edad;
        }

        public void setNIF(String N){
            NIF=N;
        }

        public void setaltura(int a){
            altura=a;
        }

        public void setedad(int e){
            edad=e;
        }

        public void comer(){
            System.out.println("Estoy comiendo");
        }

        public void hablar(){
            System.out.println("Puedo hablar");
        }

        @Override
        public String toString(){
            return getNIF()+" "+getaltura()+" "+getedad();
        }
}