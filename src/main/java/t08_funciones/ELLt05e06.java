package t08_funciones;

import java.util.Scanner;

public class ELLt05e06 {
    /* 5.6. Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número
    entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en
    un main. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Introduce un numero");
        int numero=scanner.nextInt();

        System.out.println("La cantidad de divisores que tiene este numero es; "+ cantidadDivisores(numero));
    }

    public static int cantidadDivisores(int numero) {
        int acumuladorDivisores=0;
        
        if (numero < 0) {
            return 0;
        } else{
            for(int i=1;i<=numero;i++){
                if(numero%i==0){
                    System.out.println(i);//DESCONSEJADO usar SOUT en FUNCIONES
                    acumuladorDivisores++;
                } 
            }
        }
        return acumuladorDivisores;
    }
}
