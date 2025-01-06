
package t06_String;
import java.util.Scanner;
public class ELLt04e01n_a {
    /*n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
        intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce texto para evaluar sus caracteres:");
        String cadena = scanner.nextLine();
        int longitud = cadena.length();
        String resultado = " ";
        
        if(longitud>1){
            char primer = cadena.charAt(0);
            char ultimo = cadena.charAt(longitud-1);
            
            resultado = ultimo + cadena.substring(1, longitud-1) + primer;
            System.out.println("Cadena modificada:"+resultado);            
        } else {
            System.out.println("El primer o el ultimo caracter son invalidas.");
        }
    }
}
