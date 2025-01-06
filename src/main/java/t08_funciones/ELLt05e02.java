package t08_funciones;
import java.util.Scanner;
public class ELLt05e02 {
/*5.2. Programa que presente un menú y permita calcular repetidas veces 
a) el área de círculo –necesitará el radio-
b) el área de cuadrado –necesitará el lado- 
c) el área de triángulo –necesitará base y altura–
d) Salir. Usar funciones para cada una de las 3 opciones.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean activo = true;
        while(activo){
            System.out.println("--------------------------------------"
                + "\nElege una opcion:"
                + "\n(a)Calcular el area un circulo"
                + "\n(b)Calcular el area de un cuadrado"
                + "\n(c)Calcular el area de un triangulo"
                + "\n(d)Salir"
                + "\n--------------------------------------");
            
            char opcion=scanner.next().charAt(0);
            switch(opcion){
                case 'a': 
                    System.out.println("Introduce el valor del radio:");
                    double radio=scanner.nextDouble();
                    System.out.println("El area del circulo es: " + circulo(radio));
                    break;
                case 'b':
                    System.out.println("introduce el valor del lado:");
                    double lado=scanner.nextDouble();
                    System.out.println("El area del cuadrado es: "+ cuadrado(lado));
                    break;
                case 'c': 
                    System.out.println("Introduce el valor de base:");
                    double base= scanner.nextDouble();
                    System.out.println("Introduce el valor de altura:");
                    double altura= scanner.nextDouble();
                    System.out.println("El area del triangulo es: "+ triangulo(base,altura));
                    break;
                case 'd': 
                    System.out.println("Has salido del programa.");
                    return;
                default:
                    if(Character.isAlphabetic(String.valueOf(opcion).charAt(0))){
                        System.out.println("Error 001: Las opciones validos son a,b,c,d.");
                    }else{
                        System.out.println("Error 002: Coloca un CARACTER alfabetico valido.");
                    }
                }  
            }
        System.out.println("Saliste del bucle");
    }
    public static double circulo(double radio){return Math.PI *radio*radio;}
    public static double cuadrado(double lado){return lado*lado;}
    public static double triangulo(double base, double altura){return base*altura/2;}
}
