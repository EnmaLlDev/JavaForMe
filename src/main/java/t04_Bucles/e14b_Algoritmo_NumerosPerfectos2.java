package t04_Bucles;
import java.util.Scanner;

public class e14b_Algoritmo_NumerosPerfectos2 {
        /* Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un 
        número perfecto si es igual a la suma de todos los divisores menores que él.  */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa numero limite, para realizar el calculo:");
        int rango = scanner.nextInt();
        System.out.println("Se mostraran los numeros perfectos hasta el numero introducido: "+rango);
        //bucle dentro de otro bulce para iterar el recorrido anterior hasta hallar 
        //un numero perfecto
        for(int i=2;i<=rango;i++){
            int suma=1;
            for(int j=2;j*j<=i; j++){
                  if(i%j == 0){
                  suma+=j;
                    if (j != i / j) {
                        suma += i / j;}
                }//cuidado con las llaves de los if anidados
            }
        if(suma==i){
        System.out.println(i+" es numero perfecto!");}
        
        }
    }
}

        
                
       
  

