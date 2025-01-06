package Ejercicios_funciones;

import java.util.Scanner;

public class e03_numerosAmstrong {

    /*3. Escribe una función, numerosArmstrong(), que tiene como parámetros dos números enteros,
    uno de límite inferior y otro superior. La función no devuelve nada.
     */
    public static void main(String[] args) { // CLASS MAIN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1=scanner.nextInt();
        System.out.println("Introduce otro numero");
        int num2=scanner.nextInt();
        
        System.out.println("Números Armstrong entre " + num1 + " y " + num2 + ":");
        numerosArmstrong(num1, num2);
    }

    public static void numerosArmstrong(int limiteMin, int limiteMax) {
        for(int i=limiteMin;i<=limiteMax;i++){
            if(verificaArmstrong(i)){
                System.out.print(i+" ");          
            }
        }
    }

    public static boolean verificaArmstrong(int numero){
        int suma=0;
        int numeroOriginal=numero;
        int numeroDigitos=contarDigitos(numero);
        while(numero>0){
            int digito=numero%10;
            suma+=Math.pow(digito, numeroDigitos);
            numero/=10;
        }
        return suma == numeroOriginal;
    }
       
    public static int contarDigitos(int numero) { // Funciona correctamente
        int contador = 0;
        numero = Math.abs(numero);
        do {
            numero /= 10; // Dividir el número por 10
            contador++;
        } while (numero > 0);
        return contador;
    }
    
}
