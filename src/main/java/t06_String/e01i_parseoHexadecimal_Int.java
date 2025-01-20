
package t06_String;
import java.util.Scanner;
public class e01i_parseoHexadecimal_Int {
    /*i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
    es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
    la A a F.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaTexto = scanner.next();
         if(Integer.parseInt(cadenaTexto)>0&&Integer.parseInt(cadenaTexto)<=9){
             System.out.println("Entero: "+ Integer.parseInt(cadenaTexto));
         }
        if(Integer.parseInt(cadenaTexto)>9){
            switch (cadenaTexto){
                case "10" -> {System.out.println("A");}
                case "11" -> {System.out.println("B");}
                case "12" -> {System.out.println("C");}
                case "13" -> {System.out.println("D");}
                case "14" -> {System.out.println("E");}
                case "15" -> {System.out.println("F");}  
            }
        }
        System.out.println("Fin del programa!");
    }
}
