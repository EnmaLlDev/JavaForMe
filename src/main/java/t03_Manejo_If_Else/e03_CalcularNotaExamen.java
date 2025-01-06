
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e03_CalcularNotaExamen {
    /* Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la 
    nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes 
    situaciones: 
    • Nota examen mayor o igual a 5 
    • Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5. 
    • Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración 
    del trabajo en clase. 
    Diseñar un algoritmo al que se le introduzcan por consola la nota del examen, la valoración del 
    trabajo en clase y la nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en 
    con una sola sentencia condicional. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Introduce al nota del examen:");
        double notaExamen=scanner.nextInt();
        System.out.println("Introduce la nota del trabajo en clases:");
        double trabajoClases=scanner.nextInt();
        System.out.println("Introduce la nota del trabajo practico:");
        double trabajoPractico=scanner.nextInt(); 
        boolean aprobado=false;
        
        if((notaExamen >=5)||
           ((notaExamen>=4 && notaExamen<5) && (trabajoClases>5 && trabajoPractico>5)) ||
            ((notaExamen>=4 && notaExamen<5) && (trabajoClases>8 || trabajoPractico>8))) {
            aprobado=true;
            System.out.println("Alumno aprobado!");
            }
        else {System.out.println("Suerte para la proxima!");}
    }               
  }  
