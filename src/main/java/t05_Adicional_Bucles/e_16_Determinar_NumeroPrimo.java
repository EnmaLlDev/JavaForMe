/*Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad. */
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_16_Determinar_NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es primo
        if (numero <= 1) {
            System.out.println("El número no es primo.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número es primo.");
            } else {
                System.out.println("El número no es primo.");
            }
        }

        scanner.close();
    }
}