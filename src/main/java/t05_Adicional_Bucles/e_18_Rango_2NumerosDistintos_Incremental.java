package t05_Adicional_Bucles;
import java.util.Scanner;
public class e_18_Rango_2NumerosDistintos_Incremental {
    /* 18
    Escribe un programa que obtenga los números enteros comprendidos entre dos números
    introducidos por teclado y validados como distintos, el programa debe empezar por el menor
    de los enteros introducidos e ir incrementando de 7 en 7..
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        int numero_1,numero_2;
        
        while(true){
        System.out.print("Introduce un valor numerico:");
            numero_1 = scanner.nextInt();
        System.out.print("Introduce otro valor numerico:");
            numero_2 = scanner.nextInt();

            if(numero_1 != numero_2){
            break;
            } else{
            System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            }
        }
        
        int menor = Math.min(numero_1, numero_2);
        int mayor = Math.max(numero_1, numero_2);
        
        System.out.println("Números entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
        
            for(int i = menor;i < mayor; i += 7){
                System.out.println(i);          
            }
    }
}
