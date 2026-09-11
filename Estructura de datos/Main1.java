import java.util.Scanner;

public class Main1 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas");
        int n = scanner.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double notaMasAlta = notas[0];
        double sumaNotas = notas[0];

        for (int i = 1; i < n; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / n;

        System.out.println("La nota más alta es: " + notaMasAlta);
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
