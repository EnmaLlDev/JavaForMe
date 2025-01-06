
package t06_String;
import java.util.Scanner;
public class ELLt04e07b2 {
    /*4.7. Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a 
    lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. 
    Obviamente si la A pasa a ser F, ninguna otra letra pasará F. 
    Hacer un programa que le introduzca una cadena en mayúsculas y muestre la cadena encriptada en 
    (todo lo que no sean letras mayúsculas se deja intacto: números, espacios en blanco, etc.). 
    Hacer una segunda versión que funcione con mayúsculas y minúsculas.  
    */
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un STRING");
        String cadenaTexto = scanner.nextLine();
        
        String alfabetoMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetoMinus = "abcdefghijklmnopqrstuvwxyz";
        String cadenaAleatoria = "FXMOPLZQWEAJKSDNVHIBGRCYTU";
        char caracter;
        int posicion;
        StringBuilder cadenaConstruida = new StringBuilder();
        
        for(int i=0; i<cadenaTexto.length(); i++){
            caracter = cadenaTexto.charAt(i);
            //Rango de MAYUSCULAS 
            if(caracter>='A'&& caracter<='Z') {
                posicion = alfabetoMayus.indexOf(caracter);
                cadenaConstruida.append(cadenaAleatoria.charAt(posicion));
            // Rango de MINÚSCULAS 
            }else if(caracter>='a'&& caracter<='z'){
                posicion = alfabetoMinus.indexOf(caracter);
                cadenaConstruida.append(Character.toLowerCase(cadenaAleatoria.charAt(posicion)));
            }
            else {
                cadenaConstruida.append(caracter);   
            }
        }
        System.out.println("Texto encriptado: "+ cadenaConstruida);
    }
}
