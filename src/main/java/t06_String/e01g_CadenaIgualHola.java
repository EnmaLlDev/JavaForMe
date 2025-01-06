
package t06_String;
import java.util.Scanner;
public class e01g_CadenaIgualHola {
/* g. Decir si la cadena es igual a la cadena “hola”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaTexto = scanner.next();
        
        if (cadenaTexto.equalsIgnoreCase("hola")){
            System.out.println("Correcto!");
        }else System.out.println("Error!");
        
        System.out.println("Fin del programa!");
    }
}
