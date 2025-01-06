package t04_Bucles;
import java.util.Scanner;
public class e20_NumerosPrimos_Bucle {
        /* Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los bucles
        con un número mínimo de iteraciones (se permite el uso de break) sabiendo que:
        - Un número primo es solo divisible por 1 y el mismo.
        - Los números primos son todos impares salvo el 2.
        - Los divisores de un número siempre son menores que la mitad de dicho número (salvo el
        mismo).
        - Si un número no es divisible por 2 ya no va a serlo por ningún otro número par. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limite = 1000;
        
        System.out.println("Numeros primos entre 2 y 1000");
        System.out.println(2 + " ");
        
        for(int i=3; i <= limite; i+=2){  
            boolean numero_primo=true;
            
            for(int j=3; j<=Math.sqrt(i);j+=2){
                if(i%j == 0){
                   numero_primo = false;
                   break;
                }
            }
            if(numero_primo){
            System.out.println(i + "");
            }
        }
        System.out.println("Fin del bucle!" ); 
    }
}

                
       
  

