
package Estructuras;
import java.util.Scanner;
public class Estructura_SWITCH {
    /*  Un sistema de ecuaciones lineales de la forma: Ecuaciones propuestas.
    
    Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f) 
    y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los 
    cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables 
    juntas, por ejemplo ‘ce’ quiere decir ‘c por e’.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce un numero");
        int coeficienteX=scanner.nextInt();
        int contador=0;
        switch (coeficienteX){
            case 1 -> {System.out.println("case 1 good!");
                contador++;}
            case 2 ->{System.out.println("case 2 good!");
                contador+=2;}
            case 3 ->  {System.out.println("case 2 good!"); 
                contador+=10;}
            default ->  System.out.println("bad!");}
        if(contador==1)System.out.println("Valor positivo");
        if(contador==2)System.out.println("Valor doble positivo");  
        if(contador==10)System.out.println("Valor diez veces positivo");
       
          //Switch de otra forma 
          //case: 1 {System.out.println("fin."); break;}
        /*switch (nota) {
            case 0,1,2:{System.out.println("Muy Deficiente");break;}
            case 3,4: {System.out.println("Insuficiente");break;}
            case 5,6: {System.out.println("Aprobado");break;}
            case 7,8: {System.out.println("Notable");break;}
            case 9,10: {System.out.println("Sobresaliente");break;}
            default: {System.out.println("Intenta denuevo!!!");break;}
        }*/
    }
}
          