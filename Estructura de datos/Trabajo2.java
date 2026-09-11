import java.util.Scanner;

public class Trabajo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas");
        int n = scanner.nextInt();

        double[] notas = new double[n];
        int desaprobados = 0;
        int aprobados = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            if (notas[i] < 6) {
                desaprobados = desaprobados + 1;}
                else{
                aprobados = aprobados + 1;
            } 
            
        }
        System.out.print("\n la cantidad de aprobados: " + aprobados);
        System.out.print("\n la cantidad de desaprobados: " + desaprobados);
        
    }
}
