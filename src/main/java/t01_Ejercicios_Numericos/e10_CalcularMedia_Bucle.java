package t01_Ejercicios_Numericos;
import java.util.Scanner;
public class e10_CalcularMedia_Bucle {
    /* 10
    Escribe un programa que calcule la media de un conjunto de números positivos introducidos
    por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
    indicará que ha terminado de introducir los datos cuando meta un número negativo..
    */
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
         System.out.print("Introduce un número: ");
        int numero;
        int contador_iteraciones=0;
        int suma=0;
        
        
        do{
            System.out.println("Introduce un numero:");
            numero=scanner.nextInt();
            if(numero>=0){
                suma+=numero;
                contador_iteraciones++;
            }
        }while(numero>0);
        
        double calculo_media=0;
            if(contador_iteraciones>0){
            calculo_media = (double)suma/contador_iteraciones;
            System.out.println("Has introducido " + contador_iteraciones + " números.");
            System.out.println("La suma total es: " + suma);
            System.out.println("La media es: " + calculo_media);
           
        }else{
               System.out.println("Has introducido valores erroneos! termino el programa.");
            }
     
        System.out.println("Has salido del bucle!");
    }
}
