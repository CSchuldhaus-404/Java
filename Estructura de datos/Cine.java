import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean[][] reservado = new boolean[10][10];
        String[][] nombres = new String[10][10];
        String[][] telefonos = new String[10][10];
        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE RESERVAS =====");
            System.out.println("1. Mostrar sala");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                
                case 1:
                    System.out.println("\n========== SALA ==========");
                    System.out.println("    1 2 3 4 5 6 7 8 9 10");
                    for (int fila = 0; fila < 10; fila++) {
                        System.out.print((fila + 1) + "   ");
                        for (int asiento = 0; asiento < 10; asiento++) {
                            if (reservado[fila][asiento]) {
                                System.out.print("X ");
                            } else {
                                System.out.print("O ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\nO = Disponible");
                    System.out.println("X = Reservado");
                    break;
                    
                case 2:
                    System.out.println("\n===== RESERVAR ASIENTO =====");
                    System.out.print("Ingrese su nombre: ");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.print("Ingrese su telefono: ");
                    String telefono = teclado.nextLine();
                    System.out.print("Ingrese la fila (1-10): ");
                    int fila = teclado.nextInt();
                    System.out.print("Ingrese el asiento (1-10): ");
                    int asiento = teclado.nextInt();
                    if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {
                        System.out.println("La fila o el asiento no son validos.");
                    } else {
                        fila = fila - 1;
                        asiento = asiento - 1;
                        if (reservado[fila][asiento]) {
                            System.out.println("El asiento ya esta reservado.");
                            System.out.println("La reserva pertenece a: " + nombres[fila][asiento]);
                            System.out.println("Telefono: " + telefonos[fila][asiento]);
                        } else {
                            reservado[fila][asiento] = true;
                            nombres[fila][asiento] = nombre;
                            telefonos[fila][asiento] = telefono;
                            System.out.println("Reserva realizada correctamente.");
                            System.out.println("Cliente: " + nombre);
                            System.out.println("Fila: " + (fila + 1));
                            System.out.println("Asiento: " + (asiento + 1));
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("\n===== ELIMINAR RESERVA =====");
                    System.out.print("Ingrese la fila (1-10): ");
                    fila = teclado.nextInt();
                    System.out.print("Ingrese el asiento (1-10): ");
                    asiento = teclado.nextInt();
                    if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {
                        System.out.println("La fila o el asiento no son validos.");
                    } else {
                        fila = fila - 1;
                        asiento = asiento - 1;
                        if (reservado[fila][asiento]) {
                            System.out.println("Reserva encontrada.");
                            System.out.println("Cliente: " + nombres[fila][asiento]);
                            reservado[fila][asiento] = false;
                            nombres[fila][asiento] = null;
                            telefonos[fila][asiento] = null;
                            System.out.println("Reserva eliminada correctamente.");
                        } else {
                            System.out.println("Ese asiento no tiene ninguna reserva.");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Que tenga Buen dia");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
        teclado.close();
    }
}
