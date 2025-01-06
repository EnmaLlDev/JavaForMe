/*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.*/
package t05_Adicional_Bucles;

import java.util.Scanner;

public class e_14_Bucle_BaseExponente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base:");
        int base = scanner.nextInt();
        System.out.println("Introdcue el exponente:");
        int exponente = scanner.nextInt();

        if (exponente < 0) {
            System.out.println("Debe ser numero entero!");
        } else {
            
            int potencia=1; 
            
            for (int i=0;i < exponente; i++) {
                potencia*=base;
                System.out.println("Iteracion: "+i);
                System.out.println("Resultado: "+potencia);
            }
               System.out.println("Resultado: " + base + "^" + exponente + " = " + potencia);
        }

    }
}
