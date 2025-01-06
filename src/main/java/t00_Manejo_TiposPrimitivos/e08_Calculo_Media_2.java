
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e08_Calculo_Media_2 {
        //Programa para calcular la media de las edades introducidas con dos variables
        public static void main(String[] args) {
      
        int edad; 
        int sumatoriaEdad=0;
        double media;
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Dime la primera edad:");
        edad=scanner.nextInt();
        sumatoriaEdad+=edad;
     
        System.out.println("Dime la segunda edad:");
        edad=scanner.nextInt();
        sumatoriaEdad+=edad;
        
        System.out.println("Dime la tercera edad:");
        edad=scanner.nextInt();
        sumatoriaEdad+=edad;
        
        System.out.println("Dime la cuarta edad:");
        edad=scanner.nextInt();
        sumatoriaEdad+=edad;
      
        media = sumatoriaEdad/4d;
        
        System.out.println("Total de la suma de las edades: " + sumatoriaEdad + " años." +  
                            "\nLa media de las edades seria: " + media + " años.");
        
      }  
}
