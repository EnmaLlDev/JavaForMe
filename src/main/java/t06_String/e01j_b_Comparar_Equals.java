
package t06_String;
import java.util.Scanner;
public class e01j_b_Comparar_Equals {
    /*j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaEntrada = scanner.nextLine();
        String cadenaModificada = cadenaEntrada.replace("prueva", "prueba");
        
        System.out.println("Cadena original: " + cadenaEntrada);
        System.out.println("Cadena modificada: " + cadenaModificada);
        System.out.println("Fin del programa!");
    }
}
