
package t06_String;
import java.util.Scanner;
public class ELLt04e13 {
    /*
    4.13. (Opcional) Realizar un programa al que se le introduzca un número decimal y lo convierta 
    a un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las
    clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir 
    de decimal a hexadecimal.
    
    Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes
    obtenidos hasta que el cociente sea cero. El número será la concatenación de restos,
    convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B…15->F
    */
    public static void main(String[] args) {
        int cadenaDecimal = 14;
        int resultado = cadenaDecimal;
        int resto;
        StringBuilder cadenaFinal = new StringBuilder();

        // Bucle para obtener cada dígito hexadecimal
        while (resultado > 0) {
            resto = resultado % 16; // Obtener el residuo
            resultado = resultado / 16; // Actualizar el resultado dividiendo por 16
            
            // Convertir el resto a su representación hexadecimal
            if (resto < 10) {
                cadenaFinal.append(resto); // Si es de 0 a 9, añadirlo directamente
            } else {
                // Si es de 10 a 15, convertir a A-F
                char hexChar = (char) ('A' + (resto - 10));
                cadenaFinal.append(hexChar);
            }
        }

        // Invertir la cadena ya que los restos están en orden inverso
        cadenaFinal.reverse();
        
        // Mostrar el resultado
        System.out.println("Hexadecimal: " + cadenaFinal.toString());
    }
}
