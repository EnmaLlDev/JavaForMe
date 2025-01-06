
package t06_String;
import java.util.Scanner;
public class ELLt04e01n_c {
    /*n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
        intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce texto para evaluar sus caracteres:");
        String cadena = scanner.nextLine();
        int longitud = cadena.length();
        
         if (longitud > 1) {
            // Obtener el primer y último carácter
            char primero = cadena.charAt(0);
            char ultimo = cadena.charAt(longitud - 1);
            String medio = cadena.substring(1, longitud - 1); // Resto de la cadena
            // Usar String.format para crear la nueva cadena
            String resultado = String.format("%c%s%c", ultimo, medio, primero);
            System.out.println(resultado); // Salida: "ebcda"
        } else {
            System.out.println(cadena);
        }
    }
}
