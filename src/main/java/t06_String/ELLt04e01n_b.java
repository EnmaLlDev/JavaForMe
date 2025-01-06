
package t06_String;
import java.util.Scanner;
public class ELLt04e01n_b {
    /*n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
        intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce texto para evaluar sus caracteres:");
        String cadena = scanner.nextLine();
        int longitud = cadena.length();
        StringBuilder makeString = new StringBuilder(cadena);
        
        if(longitud>1){
            makeString.setCharAt(0, cadena.charAt(longitud-1));
            makeString.setCharAt(longitud-1, cadena.charAt(0));
            System.out.println(makeString.toString());         
        } else {
            System.out.println(cadena);
        }
    }
}
