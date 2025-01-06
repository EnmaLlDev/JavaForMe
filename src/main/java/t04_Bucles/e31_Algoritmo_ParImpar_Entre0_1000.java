package t04_Bucles;
import java.util.*;
public class e31_Algoritmo_ParImpar_Entre0_1000 {
    /* Programa al que se le introduzcan 30 números y si la suma de los mismos es par nos muestre
       los 3 primeros que introducimos, y si es impar nos muestre los tres últimos que introducimos. 
       Hay que garantizar que cada uno de dichos números está comprendido entre 0 y 1000.*/
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        int numero;
        int iteraciones=0;
        int suma=0;

        do {
            System.out.println("Introduce un numero:");
            numero = scanner.nextInt();

            if(numero<0){
                System.out.println("Programa finalizado!");
                break;
            }
            iteraciones++;
            suma+=numero;
            
            if(suma%2==0){
                System.out.println("Par: "+suma);
                int tresPrimeros=numero;
                
                while(tresPrimeros>=1000){
                    tresPrimeros/=10;
                }
                    System.out.println("Tres primeros dígitos: " + tresPrimeros);  
            }else{
                System.out.println("Impar: "+suma);
                int tresUltimos = numero % 1000;
                System.out.println("Tres ultimos dígitos: " + tresUltimos);
            }
        }while(true);  
    }
}

        
                
       
  

  

