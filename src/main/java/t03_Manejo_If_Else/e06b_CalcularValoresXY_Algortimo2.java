
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e06b_CalcularValoresXY_Algortimo2 {
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
   
        // CALCULO DE X AND Y
        try{
            double X=(coeficienteC*coeficienteE - coeficienteB*coeficienteF)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD);
            double Y=(coeficienteA*coeficienteF - coeficienteC*coeficienteD)/(coeficienteA*coeficienteE - coeficienteB*coeficienteD);      
            System.out.println("El resultado seria el siguiente:");
            System.out.println("X = " + X);
            System.out.println("Y = " + Y);
        }catch(ArithmeticException e){
            System.out.println("Error: calculo igual a cero o valor infinito.");
        }
    }
}
