
package t00_Manejo_TiposPrimitivos;

import java.util.Scanner;

public class e09_CambioValores_SinVariable {
        /*Programa para sustituir el valor de una variable por otra 
        Solucion sin varible auxiliar*/
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int var1, var2;

        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();

        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        
        teclado.close();
        
        //var1=1
        //var2=2
        //sumatoria en var1 = var1(1)+var2(2) --> 3
        //recupera var1 y lo asigna a var2 = var1(3)-var2(2) ---> 1
        //recupera var2 y lo asigna a var1 = var1(3)-var2(1) ---> 2
        
        var1 = var1+var2; //3
        var2 = var1-var2; //recupera el valor de var1=
        var1 = var1-var2; //
        
        System.out.println("Var1 es: " + var1);
        System.out.println("Var2 es:" + var2);
        
     }
}
