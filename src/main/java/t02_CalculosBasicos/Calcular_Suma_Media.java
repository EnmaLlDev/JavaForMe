package t02_CalculosBasicos;
import java.util.Scanner;
public class Calcular_Suma_Media {
    /*¿Qué tipos de datos se necesitan para calcular la suma y la media de cuatro números de
    tipo int? Escribe un programa para comprobarlo..*/
      
     public static void main(String[] args) {
        int userNumber, acumulador;
        double media;
        Scanner scanner = new Scanner (System.in);   
        
        System.out.print("Ingresa un valor numerico:");
        userNumber = scanner.nextInt();
        System.out.print("Ingresa un valor numerico:");
        userNumber += scanner.nextInt();
        System.out.print("Ingresa un valor numerico:");
        userNumber += scanner.nextInt();
        System.out.print("Ingresa un valor numerico:");
        userNumber += scanner.nextInt();
        
        //acumulador = userNumber;// puede hacerse con o sin una varaible de acumulador 
        media = userNumber/4;
         
        System.out.println("El resultado de la suma de los 4 numeros introducidos es:"+
                userNumber+"\nLa media de los numeros ingresados es:"+media);
        
    }
}