
package t06_String;
import java.util.Scanner;
public class e01k_Compara_PrimeraUltimaPosicion {
    /*k. Decir si la primera posición de la cadena es igual a la última.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un String:");
        String cadenaTexto = scanner.nextLine();
        
        char primerCaracter = cadenaTexto.charAt(0);
        char ultimoCaracter = cadenaTexto.charAt(cadenaTexto.length() - 1);
        
        if(primerCaracter==ultimoCaracter){ 
            System.out.println("\nPrimer caracter: "+primerCaracter+ 
                               "\nUltimo caracter: "+ultimoCaracter+ " Coinciden.");
            }
        else {
             System.out.println("\nPrimer caracter: "+primerCaracter+ 
                                "\nUltimo caracter: "+ultimoCaracter+
                                "\nNo coinciden!");
            }
        System.out.println("Fin del programa!");
    }
}
