
package t06_String;
import java.util.Scanner;
public class ELLt04e01h {
/*h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaTexto = scanner.next();
        
        System.out.println("Imprime los enteros:"+Integer.parseInt(cadenaTexto));
      
        int cadenaParseo=Integer.parseInt(cadenaTexto);
        
        System.out.println("Desde un entero:" + Integer.parseInt(cadenaTexto));
    }
}
