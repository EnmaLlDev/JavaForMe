
package t06_String;
import java.util.Scanner;
public class ELLt04e09 {
    /*4.9. Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
    edad y muestre el siguiente mensaje. 
    Hacer una versión utilizando la clase Format y otra versión con el método System.out.printf.
    "Hola, me llamo Pepe Pérez López y tengo 20 años"
    suponiendo que se introduce Pepe Pérez López como nombre completo y 20 como edad.
    
    */
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Introduce un nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce tu edad : ");
        int edad = scanner.nextInt();
        //Formar String con argumentos:
        //Format con argumentos
        String mensaje = String.format("Hola, me llamo %s y tengo %d años.", nombre, edad);
        
        System.out.println(mensaje);   
        //Mostrar String con formato:
        //Usando printf 
        System.out.printf("Hola, me llamo %s y tengo %d años.%n", nombre, edad);
    }
}
