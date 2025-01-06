package t04_Bucles;
import java.util.Scanner;

public class e11_OrdenAscendente_Operaciones {
        /*Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números 
        comprendidos entre ellos ordenados ascendentemente, 
        junto con el valor de elevar cada uno de esos números al cuadrado. No se sabe si m > n, pero 
        se desea utilizar una sola sentencia repetitiva tanto si m > n como si m < n. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor_M;
        int valor_N; 
       
        System.out.println("Introduce el valor de M");
        valor_M=scanner.nextInt();
        
        System.out.println("Introduce el valor de N");
        valor_N=scanner.nextInt(); 
         //Clase math para evaluar estas cosas:
         
        int valor_min= Math.min(valor_M, valor_N);
        int valor_max= Math.max(valor_M, valor_N);
        
        for(int i=valor_min; i<valor_max;i++){
            System.out.println("Numero dentro del rango: "+i);
            System.out.printf("Su raiz cuadrada es: %d\n", i*i);
        }
        
        System.out.println("Fin del bucle!");
    }
}

        
                
       
  

