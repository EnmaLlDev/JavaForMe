
package t06_String;
import java.util.Scanner;
public class ELLt04e08a {
    /*4.8. Realizar un programa que solicite una cadena, un número que indica una posición de la 
    cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la 
    posición indicada por la letra introducida. 
    
    Hacer dos versiones, la primera con String y otra con StringBuilder.
    
    Hacer una segunda versión que funcione con mayúsculas y minúsculas. 
    */
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Introduce un numero: ");
        int posicion = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer
        
        System.out.print("Introduce una letra: ");
        char letra = scanner.nextLine().charAt(0);
        
        String cadenaModificada = "";
        
        if(posicion<0||posicion>=cadena.length()){
            System.out.println("Error");
        }else {
            cadenaModificada = cadena.substring(0, posicion) + letra + cadena.substring(posicion + 1);
            System.out.println("Cadena modificada: " + cadenaModificada);
        }
    }
}
