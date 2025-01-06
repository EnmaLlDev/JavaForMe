
package t06_String;
import java.util.Scanner;
public class ELLt04e03 {
    /* 4.3. Realiza un programa que solicite que se le introduzcan una cadena y un carácter 
            y nos muestre cuantas veces está contenido el carácter en la cadena.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadenaUser = scanner.nextLine();
        
        System.out.println("Introduce el caracter que deseas encontrar:");
        char caracterUser = scanner.nextLine().charAt(0);
        int contadorCaracteres = 0;
        
        for(int i=0;i<cadenaUser.length();i++){
            if(cadenaUser.charAt(i) == caracterUser){
            contadorCaracteres++;
            }
        }
        System.out.println("El caracter: ("+caracterUser+") se repite: "+contadorCaracteres+" veces");
    }
}
