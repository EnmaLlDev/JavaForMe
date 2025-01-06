
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e04_CordenadasXY_DeterminarFomar {
    /* Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano,
    nos diga si lo que forman es un cuadrado o un rectángulo y calcule el área del mismo. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Introduce la coordenada X1 :");
        double coordenadaX1=scanner.nextInt();
        System.out.println("Introduce la coordenada X2:");
        double coordenadaX2=scanner.nextInt();
        System.out.println("Introduce la coordenada Y1:");
        double coordenadaY1=scanner.nextInt();
        System.out.println("Introduce la coordenada Y2:");
        double coordenadaY2=scanner.nextInt();
        //Clase math
        double base = Math.abs(coordenadaX2 - coordenadaX1); // eje X
        double altura= Math.abs(coordenadaY2 - coordenadaY1); // eje y
        double calculoArea = base*altura;
        // cuadrado base==altura
        // rectangulo base != altura
        if (base != altura) {
            System.out.println("Las coordenadas forman un rectangulo.");
        } else {
            System.out.println("Las coordenadas forman un cuadrado.");
        }

        System.out.println("Su area es: " + calculoArea);

    }               
  }  
