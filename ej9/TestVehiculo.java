package ej9;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        int opcion;
        do {
        System.out.println("VEHÍCULOS");
        System.out.println("==========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Arrancar coche");
        System.out.println("9. Detener coche");
        System.out.println("10. Está Arrancado?");
        System.out.println("11. Salir");
        System.out.print("Elige una opción (1-11): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                bicicleta.andar();
                break;

            case 2:
                bicicleta.caballito();
                break;
            
            case 3:
                coche.andar();
                break;
            
            case 4:
                coche.quemarRueda();
                break;
            
            case 5:
                bicicleta.getkilometrosRecorridos();
                break;

            case 6:
                coche.getkilometrosRecorridos();
                break;

            case 7:
                Vehiculo.getkilometrosTotales();
                break;

            case 8:
                coche.arrancar();
            break;

            case 9:
                coche.detener();
            break;

            case 10:
                coche.estaArrancado();
            break;

            case 11:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Introduce una opción válida");
        }
        } while (opcion != 11);
        scanner.close();
    }
}
    

