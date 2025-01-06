
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e08_Calculo_Media_3 {
        //Programa para calcular la media de las edades introducidas con cuatro variables
        public static void main(String[] args) {
        int edad1,edad2,edad3,edad4, total;
        double media;

        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Dime la primera edad:");
        edad1=scanner.nextInt();
        //edad = edad= scanner.nextInt();
        
        System.out.println("Dime la segunda edad:");
        edad2=scanner.nextInt();
        
        System.out.println("Dime la tercera edad:");
        edad3=scanner.nextInt();
        
        System.out.println("Dime la cuarta edad:");
        edad4=scanner.nextInt();
        
        total = edad1+edad2+edad3+edad4;
        media = ((double)edad1+edad2+edad3+edad4)/4;
        
          System.out.println("Total de la suma de las edades: " + total + " años." +  
                            "\nLa media de las edades seria: " + media + " años.");
    }
}
