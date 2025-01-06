package t04_Bucles;
import java.util.*;
public class e32_Algoritmo_Entero_Binario {
    /* 
    (Opcional) Programa al que se le pase un número entero y que lo muestre en binario. Deberá
    hacer divisiones sucesivas e ir componiendo un número (long) con los restos obtenidos hasta que el
    cociente será cero. Pista: cada cero y uno obtenido como resto hay que situarlo en la posición
    adecuada del resultado: unidades, decenas, centenas, etc.
    */
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero=scanner.nextInt();
        
        long numeroBinario=0;
        int posicion=1;
                
        while(numero>0){
            int resto = numero % 2;
            System.out.println("resto --> "+resto);
            numeroBinario+= resto * posicion;
            numero/= 2;
            posicion*= 10;
        }
        System.out.println("Numero binario: " + numeroBinario);
    }
}

        
                
       
  

  

