package t04_Bucles;
import java.util.Scanner;

public class e12_Algoritmo_NotasExamen {
        /* Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con 
        decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de 
        notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el 
        porcentaje de aprobados. Hay que validar que estén entre 0 y 10. 
        - Hay que pensar primero el bucle: el código ser repite mientras….. Una vez aclarado esto, puedes 
        pensar qué es lo que se hace cada vez (en este caso, qué hago con cada nota introducida) 
        - Para calcular la nota máxima hay que tener guardada en una variable la máxima hasta ese 
        momento y al leer una nueva nota, compararla la nueva con la guardada, y si la nueva es mayor 
        que la guardada, guardamos la nueva, ya que ahora es la máxima y así para todas las iteraciones 
        del bucle (para empezar puedes decir que la máxima nota es -1) 
        - Para calcular la media hay que ir acumulando los valores y la cantidad de elementos, y al final 
        dividir lo acumulado entre la cantidad de elementos.  */
    
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
            System.out.println("Numero dentro del rango: "+i+" Su raiz cuadrada es:"+ (Math.sqrt(i))); 
        }
    }
}

        
                
       
  

