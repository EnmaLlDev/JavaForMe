
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e08_Calculo_Media_1 {
      //Programa para calcular la media de las edades introducidas con una sola variable
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int edad=0;
         
        System.out.println("Dime la primera edad:");
        edad+=scanner.nextInt();
        //edad = edad= scanner.nextInt();
        
        System.out.println("Dime la segunda edad:");
        edad+=scanner.nextInt();
        
        System.out.println("Dime la tercera edad:");
        edad+=scanner.nextInt();
        
        System.out.println("Dime la cuarta edad:");
        edad+=scanner.nextInt();
        
        System.out.println("Total de la suma de las edades: " + edad + " años." +  
                            "\nLa media de las edades seria: " + (double)edad/4 + " años.");

      }
}
