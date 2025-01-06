package t04_Bucles;
import java.util.*;

public class e33_Algoritmo_Binario_2_4_8 {

    /* 
    (Opcional) Amplia el programa anterior para que el usuario pueda introducir previamente la
    base destino y el programa pueda pasar a binario (base 2), ternario (base 4) u octal (base 8).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        System.out.println("Introduce el valor numerico de la base:");
        int base = scanner.nextInt();

        if (base < 2 || base > 10) {
            System.out.println("");
        } else {
            long numeroBinario = 0;
            int posicion = 1;

            while (numero > 0) {
                int resto = numero % base; // se filtra la base y determinalos resultados 
                System.out.println("binario(resto) --> " + resto);
                numeroBinario += resto * posicion;
                numero /= base;
                posicion *= 10;
            }
            System.out.println("Numero de base: " + base + " Numero binario: " + numeroBinario);
        }
    }
}
