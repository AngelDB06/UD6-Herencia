import java.util.ArrayList;
import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int n;
    int total=0;

    do {
        System.out.println("Introduce un número en el Array: ");
        System.out.println("Introduce un 0 para finalizar el Array.");
        n= scanner.nextInt();

        if (n!=0) {
            numeros.add(n);
        }
    } while (n!=0);


    System.out.println("Has introducido un total de "+numeros.size()+" números.");
    for (Integer i: numeros){
        System.out.println(i);
        total += i;
    }

    System.out.println("La suma de los números es: "+total);
    
    System.out.println("La media de los números es: "+total/numeros.size());
    scanner.close();
    }
}
