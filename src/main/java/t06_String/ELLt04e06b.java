
package t06_String;
import java.util.Scanner;
public class ELLt04e06b {
    /*4.6. 
    - Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el 
      dominio (Ejemplo: info@clientes.mundo-r.com */
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce tu correo electronico:");
        String correoUser = scanner.nextLine();
       //GET DOMINIO
        String cadenaDominio = correoUser.substring(correoUser.indexOf("@"), correoUser.lastIndexOf("."));
       //GET USER 
        String cadenaUsuario = correoUser.substring(correoUser.indexOf(0)+1, correoUser.lastIndexOf("@"));
        System.out.println("Cadena dominio: "+cadenaDominio+
                            "\nCadena usuario: "+cadenaUsuario);
    }
}
