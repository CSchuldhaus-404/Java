import java.util.Scanner;

public class Trabajo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCensados = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesEntre16y65 = 0;

        int mayorEdad = -1;
        long docMayorEdad = 0;
        char sexoMayorEdad = ' ';

        System.out.print("Ingrese número de documento (0 para finalizar): ");
        long documento = scanner.nextLong();

        while (documento != 0) {
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese sexo ('M' o 'F'): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            totalCensados++;

            if (sexo == 'M') {
                totalVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            if (edad > mayorEdad) {
                mayorEdad = edad;
                docMayorEdad = documento;
                sexoMayorEdad = sexo;
            }


            System.out.print("Ingrese número de documento (0 para finalizar): ");
            documento = scanner.nextLong();
        }


        System.out.println("\nRESULTADOS DEL CENSO PROVINCIAL");

        System.out.println("Cantidad total de personas censadas: " + totalCensados);
        System.out.println("Cantidad de varones: " + totalVarones);
        System.out.println("Cantidad de mujeres: " + totalMujeres);

        if (totalVarones > 0) {
            double porcentajeVarones = ((double) varonesEntre16y65 / totalVarones) * 100;
            System.out.println("Porcentaje de varones entre 16 y 65 años: %" + porcentajeVarones);
        } else {
            System.out.println("Porcentaje de varones entre 16 y 65 años: 0.00% (no se registraron varones)");
        }

        if (totalCensados > 0) {
            System.out.println("\nPersona de mayor edad");
            System.out.println("Documento: " + docMayorEdad);
            System.out.println("Edad: " + mayorEdad + " años");
            System.out.println("Sexo: " + sexoMayorEdad);
        } else {
            System.out.println("\nNo se registraron datos en el censo.");
        }
    }
}
