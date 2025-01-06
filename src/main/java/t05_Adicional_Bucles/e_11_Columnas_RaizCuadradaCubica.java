/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo 
de los 5 primeros números enteros a partir de uno que se introduce por teclado. */
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_11_Columnas_RaizCuadradaCubica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numeroInicial = Math.abs(scanner.nextInt());
        
        System.out.printf("%-10s %-10s %-10s%n", "numero","cubo","cuadrado");
           
        for (int i = 0; i < 5; i++) {
            int numero = numeroInicial+i;
            int cubo = numero*numero;
            int cuadrado = numero*numero*numero;

            System.out.printf("%-10d %-10d %-10d%n", numero,cubo,cuadrado);

        }
    }
}
