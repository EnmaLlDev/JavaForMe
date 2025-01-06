
package t00_Manejo_TiposPrimitivos;
import java.util.Scanner;
public class e11_Calcular_Hipotemusa {
        //Programa para calcular el valor de la hipotenusa 
        public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
         
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor del primer cateto: ");
        cateto1 = scanner.nextDouble();

        System.out.print("Valor del segundo cateto: ");
        cateto2 = scanner.nextDouble();
        
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        
        System.out.printf("El calculo de La hipoitenusa, de los catetos %.2f y %.2f es: %.2f\n ", cateto1, cateto2, hipotenusa);
        scanner.close(); 
    }
}


