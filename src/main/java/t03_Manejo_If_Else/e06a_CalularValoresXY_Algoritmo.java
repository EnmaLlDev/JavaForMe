
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e06a_CalularValoresXY_Algoritmo {
    /*Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f)
        y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita 
        ¿Existen algunos casos para los cuales este algoritmo no funcione? 
        
        Nota: cuando en matemáticas se escriben dos variables juntas, por ejemplo ‘ce’ quiere decir ‘c por e’. */
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        //PRIMER COEFICIENTE
        System.out.println("Introduce el primer coefciente A");
        double coeficienteA=scanner.nextDouble();
        System.out.println("Introduce el segundo coefciente B");
        double coeficienteB=scanner.nextDouble();
        System.out.println("Introduce el primer coefciente C");
        double coeficienteC=scanner.nextDouble();
        
        //SEGUNDO COEFICIENTE
        System.out.println("Introduce el primer coefciente D");
        double coeficienteD=scanner.nextDouble();
        System.out.println("Introduce el segundo coefciente E");
        double coeficienteE=scanner.nextDouble();
        System.out.println("Introduce el primer coefciente F");
        double coeficienteF=scanner.nextDouble();
        
        //AGRUPO LOS DENOMINADORES DEL SISTEMA DE ECUACIONES
        double calculoDeterminante = coeficienteA*coeficienteE - coeficienteB*coeficienteD;
       
        // CARDINALES X and Y
        double X;
        double Y;      
        /* CONDICION -> En caso que el calculo de la determinante arroje un cero, el sistema de ecuacion 
           lineal no tendra una solucion o mueestra un resultado infinito.*/
        if (calculoDeterminante!=0){
            X=(coeficienteC*coeficienteE - coeficienteB*coeficienteF)/calculoDeterminante;
            Y=(coeficienteA*coeficienteF - coeficienteC*coeficienteD)/calculoDeterminante;
            
            System.out.println("El resultado seria el siguiente:");
            System.out.println("X = " + X);
            System.out.println("Y = " + Y);
            }
        else {
            System.out.println("El sistema de ecuacion lineal no tiene solucion o su valor es infinito!");
        }       
    }
}
