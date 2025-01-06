
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e04_Calculo_Notas {
        /*conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un
        programa al que se le introduzcan por consola el número de suspensos, suficientes, notables y
        sobresalientes de una asignatura, y nos calcule:
        • El tanto por ciento de alumnos que han superado la asignatura.
        • El tanto por ciento de notables y sobresalientes de la asignatura.*/
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suspensos, suficientes, notables, sobresalientes, totalAlumnos;
        
        System.out.println("----------------- Grupos de alumnos: ------------------");
        System.out.print("Ingresa la cantidad de suspensos:");
        suspensos = teclado.nextInt();
        
        System.out.print("Ingresa la cantidad de suficientes:");
        suficientes = teclado.nextInt();
        
        System.out.print("Ingresa la cantidad de notables:");
        notables = teclado.nextInt();
        
        System.out.print("Ingresa la cantidad de sobresalientes:");
        sobresalientes = teclado.nextInt();
        
        totalAlumnos= suspensos+suficientes+notables+sobresalientes;
        
        //Calculos en porcentajes finales
        double porcentajeSuperado = ((double)suficientes+notables+sobresalientes)/totalAlumnos*100 ; // casteo a decimal
        double porcentajeNotablesSobresalientes = ((double)notables+sobresalientes)/totalAlumnos*100 ;
        
        System.out.println("-------------------- Resultados ------------------");
        
        System.out.println("Porcentaje de alumnos superados es: " + porcentajeSuperado + "%" );
        System.out.println("Porcentaje de alumnos notables y sobresalientes: " + porcentajeNotablesSobresalientes + "%" );
        
        teclado.close();
        
     } 
}
