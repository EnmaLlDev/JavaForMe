/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144… El número n se debe introducir por teclado.*/
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_12_SerieFibonacci_Indeterminada {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int ant = 0, ant2 = 1, num, n;
        System.out.println("Introduce el limite de la serie Fibonacci");
        n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(ant + " ");
            num = ant + ant2;
            ant = ant2;
            ant2 = num;

        }
    }
}
