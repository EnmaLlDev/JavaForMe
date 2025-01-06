
package t06_String;
import java.util.Scanner;
public class ELLt04e01l_b {
    /*l. Decir cuántos dígitos numéricos hay en la cadena.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce texto para evaluar sus caracteres:");
        String cadenaTexto = scanner.nextLine();
        
        int longitudOriginal = cadenaTexto.length();
        //Puedes introducir todos los digitos que permite un String 
        for(char digito='0'; digito <='9'; digito++){
           
            cadenaTexto = cadenaTexto.replace(String.valueOf(digito),"");
        }
        
        int longitudSinDigitos = cadenaTexto.length();
        int contadorDigitos = longitudOriginal-longitudSinDigitos;
        
        System.out.println("La cadena contiene " + contadorDigitos + " dígitos numéricos.");
    }
}
