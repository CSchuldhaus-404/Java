import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos");
        int n = scanner.nextInt();

        int[] cantidad = new int[n];
        double[] precio = new double[n];
        String[] nombres = new String[n];
        double[] precio_total = new double [n];
        int precio_mayor = 0;
        
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Ingrese el NOMBRE del producto " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese el PRECIO del producto " + (i + 1) + ": ");
            precio[i] = scanner.nextDouble();
            System.out.print("Ingrese la CANTIDAD del producto " + (i + 1) + ": ");
            cantidad[i] = scanner.nextInt();
            
            precio_total[i] = precio[i] * cantidad[i];
            
        }
        for (int i = 0; i < n; i++){
            if (precio_total[i] > 1000) {
            System.out.print("\n del producto " + nombres[i] + " tiene la cantidad de " + cantidad[i] + " al precio unitario de $" + precio[i] + " un precio total de $" + precio_total[i]);
            }
            
        }
    }
}
