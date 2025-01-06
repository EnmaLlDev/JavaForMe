package t08_funciones;
import java.util.Scanner;
public class ELLt05e07 {

    /* 5.7. Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. 
    
    Usando la función del programa anterior, haz un programa que muestre la suma de los números primos
    comprendidos entre 1 y 1000.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        
        if (cantidadDivisores(numero) > 2) { System.out.println("No es Primo");
        } else { System.out.println("Es Primo!");}
    }

    public static int cantidadDivisores(int numero) {
        int acumuladorDivisores = 0;

        if (numero < 0) {
            return 0;
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i+" ");//DESCONSEJADO usar SOUT en FUNCIONES
                    acumuladorDivisores++;
                }
            }
        }
        return acumuladorDivisores;
    }
}
