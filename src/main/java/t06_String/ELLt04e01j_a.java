
package t06_String;
import java.util.Scanner;
public class ELLt04e01j_a {
    /*j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaTexto = scanner.next();
        
         if(cadenaTexto.equals("prueva")){
             cadenaTexto = "prueba";
             System.out.println(cadenaTexto);
         }else{
             System.out.println("String erroneo!");
         }
        System.out.println("Fin del programa!");
    }
}
