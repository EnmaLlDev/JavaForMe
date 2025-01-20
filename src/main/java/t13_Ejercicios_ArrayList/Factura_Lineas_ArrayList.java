package t13_Ejercicios_ArrayList;

import t13_Ejercicios_ArrayList.ClassFactura.Factura;
import t13_Ejercicios_ArrayList.ClassFactura.LineaFactura;

import java.util.Scanner;

public class Factura_Lineas_ArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura F1 = new Factura(001, 1);
        int opcion;

        do {
            System.out.println("======================");
            System.out.println("1. Mostrar Factura");
            System.out.println("2. Añadir Linea");
            System.out.println("3. Eliminar Linea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    F1.MostarFactura();
                    break;
                case 2:
                    System.out.print("Ingrese el producto: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese el precio unitario: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    F1.AñadirLineas(producto, precio, cantidad);
                    break;
                case 3:
                    // Implementación para eliminar una línea (por ejemplo, por índice)
                    System.out.print("Ingrese el índice de la línea a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < F1.getLineas().size()) {
                        F1.getLineas().remove(indice);
                        System.out.println("Línea eliminada.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}