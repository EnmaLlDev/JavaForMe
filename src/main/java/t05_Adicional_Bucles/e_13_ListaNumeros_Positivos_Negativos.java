/*Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
cuántos son negativos.*/
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_13_ListaNumeros_Positivos_Negativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int numero=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero:");
            numero=scanner.nextInt();
            
            if(numero>0) positivos++;
            else if(numero<0) negativos++;
        }
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos);

    }
}
