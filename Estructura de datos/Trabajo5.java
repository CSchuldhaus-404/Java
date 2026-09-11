import java.util.Scanner;

public class Trabajo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 5;
        int[] dni = new int[n];
        int[] opcion = new int[n];
        double[] monto_pagar = new double[n];
        String[] servicio = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el DNI del cleinte " + (i + 1) + ": ");
            dni[i] = scanner.nextInt();
            System.out.print("Ingrese el servicio del cliente " + (i + 1) + "\n 1. Internet 30 megas (El servicio cuesta: $750) \n 2. Internet 50 megas (El servicio cuesta: $1100) \n 3. Internet 100 megas (El servicio cuesta: $1500 – menos 5% de descuento por promoción) \n Opcion:");
            opcion[i] = scanner.nextInt();
            
            switch (opcion[i]){
                case 1:
                    servicio[i] = "30MB";
                    monto_pagar[i] = 750;
                    break;
                case 2:
                    servicio[i] = "50MB";
                    monto_pagar[i] = 1100;
                    break;
                case 3:
                    servicio[i] = "100MB";
                    monto_pagar[i] = 1500 * 0.95;
                    break;
            }
            
        }
        for (int i = 0; i < n; i++){

            System.out.print("\n DNI: " + dni[i] + "\n Servicio: " + servicio[i] + "\n Monto a pagar: $" + monto_pagar[i] + "\n");
            
            
        }
    }
}
