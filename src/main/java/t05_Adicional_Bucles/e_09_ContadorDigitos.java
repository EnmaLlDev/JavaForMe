
package t05_Adicional_Bucles;
import java.util.Scanner;
public class e_09_ContadorDigitos {
    /* 9
     Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
     Hay que realizar el ejercicio utilizando bucles. La única limitación en el número de dígitos
     la establece el tipo de dato que se utilice (int o long).
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int digitos = 0;
        int numeroAbsoluto = Math.abs(numero); // Para manejar números negativos

        if (numeroAbsoluto == 0) {
            digitos = 1; // El número 0 tiene un solo dígito
        } else {
            while (numeroAbsoluto > 0) {
                digitos++;
                numeroAbsoluto /= 10;
            }
        }

        // Mostrar el resultado
        System.out.println("La cantidad de dígitos del número " + numero + " es: " + digitos);
    }
}
