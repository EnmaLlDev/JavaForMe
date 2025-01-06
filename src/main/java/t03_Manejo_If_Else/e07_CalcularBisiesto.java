
package t03_Manejo_If_Else;
import java.util.Scanner;
public class e07_CalcularBisiesto {
    /*Realizar un programa que informe si un año introducido previamente es bisiesto o no. Son
    bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400
    también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y
    otra más sofisticada con una sola. No usar las clases de fechas de Java. */
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        //Valor numerico usuario
        System.out.println("Introduce un año y miremos si es biciesto?");
        int anho=scanner.nextInt();
        boolean anhoBisiesto = false;
        
        if(anho%4==0 && anho%100!=0 || anho%400==0){ //condicional para calcular año bisiesto
            anhoBisiesto=true;
            System.out.println("El año: " + anho + " es biciesto." );
            }
        else {System.out.println("El año: " + anho + " no es biciesto!!!");}
        
        System.out.println("Tras analizar el año introducido resulto ser: "+anhoBisiesto);
    }
}
