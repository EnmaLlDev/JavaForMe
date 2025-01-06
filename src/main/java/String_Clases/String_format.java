package String_Clases;
import java.util.Scanner;
public class String_format {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un string:");
        String cadena = scanner.nextLine();
        System.out.println("Introduce digitos:");
        int digitos = scanner.nextInt();
        
        String resultado = String.format("Nombre: %s, edad:%d años.", cadena, digitos);
        System.out.println(resultado);
        
        //Precision coma flotante DecimalFormat
        int numero = 12345;
        System.out.println(String.format("El numero es: %08d", numero));
        
        float num = 1.5f;
        System.out.println(String.format("El número es: %08.3f", num));
        
        float num2 = 1.5f;
        System.out.println(String.format("El número es: %+.2f", num2));
    }
}
