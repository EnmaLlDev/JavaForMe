package t04_Bucles;
import java.util.Scanner;

public class e14a_Algortimo_NumerosPerfectos {
        /* Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un 
        número perfecto si es igual a la suma de todos los divisores menores que él.  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int rango = 10000;
        System.out.println("Se mostraran los numeros perfectos hasta el numero 10.000");
        //bucle dentro de otro bulce para iterar el recorrido anterior hasta hallar 
        //un numero perfecto
        for(int i=1;i<=rango;i++){
            int suma=0;
            
            for(int j=1;j<i; j++){
                  if(i%j==0){
                  suma+=j;
                }
            }
        if(suma==i){
        System.out.println(i+" es numero perfecto!");}
        
        }
    }
}

        
                
       
  

