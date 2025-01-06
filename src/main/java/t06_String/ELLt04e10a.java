
package t06_String;
import java.util.Scanner;
public class ELLt04e10a {
    /*4.10. Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una
    cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.
    */
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String cadena;
        String nuevaCadena="";
        
            for(int i=1;i<=10;i++){
                System.out.print("Introduce la cadena N.-"+i+":");
                cadena = scanner.nextLine();
                if(!cadena.isBlank()){
                  nuevaCadena+=cadena.charAt(0);
                }
                else{
                    System.out.println("Cadena vacia!");
                }
            }
        System.out.println("Cadena formada con el primer carácter de cada entrada: " + nuevaCadena);
    }
}
