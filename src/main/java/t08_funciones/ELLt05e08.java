package t08_funciones;
import java.util.Scanner;
public class ELLt05e08 {
    /* 5.8. Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál
    de los dos tiene más divisores (usar función previa).
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cant1, cant2;
        System.out.println("Introduce el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2= scanner.nextInt();
        
        if(Math.abs(numero1)>0&& Math.abs(numero2)>0){
            cant1=cantidadDivisores(numero1);
            System.out.print("\n");
            cant2=cantidadDivisores(numero2);
            
            System.out.println("\nLa primera cantidad de divisores: "+cant1);
            System.out.println("La segunda cantidad de divisores: "+cant2);
            System.out.println("El numero con mas divisores es: "+ Math.max(cant1, cant2));
        } else {System.out.println("Has introducido numeros invalidos!");}
        
    }

    public static int cantidadDivisores(int numero) {
        int acumuladorDivisores = 0;
        
        if (numero < 0) {
            return 0;
        } else{
            for(int i=1;i<=numero;i++){
                if(numero%i==0){
                    System.out.print(i+ " ");//DESCONSEJADO usar SOUT en FUNCIONES
                    acumuladorDivisores++;
                } 
            }
        }
        return acumuladorDivisores;
    }
}
