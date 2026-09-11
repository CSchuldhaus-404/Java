import java.util.Scanner;

public class Trabajo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int TOTAL_COMPETIDORES = 12;
        int mejorVehiculo = 0;
        double menorTiempo = 100000000;

        for (int i = 1; i <= TOTAL_COMPETIDORES; i++) {
            System.out.println("Competidor " + i + " de " + TOTAL_COMPETIDORES);
            
            System.out.print("Ingrese el número de vehículo: ");
            int vehiculo = scanner.nextInt();

            System.out.print("Ingrese el tiempo registrado: ");
            double tiempo = scanner.nextDouble();
            
            if (tiempo < menorTiempo) {
                menorTiempo = tiempo;
                mejorVehiculo = vehiculo;
            }
            System.out.println();
        }

        System.out.println("RESULTADO DE LA CARRERA");
        System.out.println("Vehículo ganador: " + mejorVehiculo);
        System.out.println("Tiempo registrado: " + menorTiempo + " segundos");
    }
}
