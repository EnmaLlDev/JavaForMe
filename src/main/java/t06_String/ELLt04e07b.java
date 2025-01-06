
package t06_String;
import java.util.Random;
import java.util.Scanner;
public class ELLt04e07b {
    /*4.7. Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a 
    lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. 
    Obviamente si la A pasa a ser F, ninguna otra letra pasará F. 
    Hacer un programa que le introduzca una cadena en mayúsculas y muestre la cadena encriptada en 
    (todo lo que no sean letras mayúsculas se deja intacto: números, espacios en blanco, etc.). 
    Hacer una segunda versión que funcione con mayúsculas y minúsculas.  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena en mayúsculas: ");
        String mensaje = scanner.nextLine();
        
        String mensajeEncriptado = encriptarMayusculas(mensaje);
        System.out.println("Mensaje encriptado: " + mensajeEncriptado);
    }

    public static String encriptarMayusculas(String mensaje) {
        // Definir el alfabeto y la clave de encriptación para mayúsculas
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String clave =    "FXMOPLZQWEAJKSDNVHIBGRCYTU"; // Mapeo de encriptación de A->F, B->X, etc.
        
        // Construir el mensaje encriptado
        StringBuilder mensajeEncriptado = new StringBuilder();
        
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            
            // Verificar si es una letra mayúscula
            if (c >= 'A' && c <= 'Z') {
                // Obtener la posición de la letra en el alfabeto y reemplazarla por la clave correspondiente
                int posicion = alfabeto.indexOf(c);
                mensajeEncriptado.append(clave.charAt(posicion));
            } else {
                // Si no es letra mayúscula, añadir el carácter sin cambios
                mensajeEncriptado.append(c);
            }
        }
        
        return mensajeEncriptado.toString();
    }
}

