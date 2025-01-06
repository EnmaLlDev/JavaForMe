/*Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por
ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.*/
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_15_Algortimo_BaseExponente_Aleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar base y exponente
        System.out.print("Introduce la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente máximo (entero positivo): ");
        int exponenteMax = scanner.nextInt();

        // Validar que el exponente máximo sea positivo
        if (exponenteMax < 1) {
            System.out.println("El exponente máximo debe ser un entero positivo.");
        } else {
            // Calcular y mostrar todas las potencias desde 1 hasta exponenteMax
            System.out.println("Potencias de la base " + base + " desde exponente 1 hasta " + exponenteMax + ":");

            for (int exponente = 1; exponente <= exponenteMax; exponente++) {
                double potencia = 1;
                for (int i = 0; i < exponente; i++) {
                    potencia *= base;
                }
                System.out.println(base + "^" + exponente + " = " + potencia);
            }
        }

        scanner.close();
    }
}