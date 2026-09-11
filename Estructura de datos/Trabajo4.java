import java.util.Scanner;

public class Trabajo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de camiones");
        int n = scanner.nextInt();
            scanner.nextLine();

        String[] chofer = new String[n];
        String[] patente = new String[n];
        String[] carga = new String[n];
        String[] hora_ingreso = new String[n];
        int te = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el NOMBRE Y APELLIDO del chofer " + (i + 1) + ": ");
            chofer[i] = scanner.nextLine();
            System.out.print("Ingrese la PATENTE del camion " + (i + 1) + ": ");
            patente[i] = scanner.nextLine();
            System.out.print("Ingrese la CARGA del camion " + (i + 1) + ": ");
            carga[i] = scanner.nextLine();
            
            if (carga[i].equals ("te")){
                te = te + 1;
            }
            
            System.out.print("Ingrese la HORA DE INGRESO del camion " + (i + 1) + ": ");
            hora_ingreso[i] = scanner.nextLine();
            
        }
        for (int i = 0; i < n; i++){
            System.out.print("\n El chofer " + chofer[i] + " ingreso a las " + hora_ingreso[i] + " con el camion patente " + patente[i] + " y cargo " + carga[i]);
        }
        System.out.print("\n la cantidad de camiones que llevan té es de : " + te );
    }
}
