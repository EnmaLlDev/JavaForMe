package t08_funciones;

import java.util.Random;
import java.util.Scanner;

public class ELLt05e01 {
/* 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a
dichas funciones...*/
    public static void main(String[] args) { // CLASS MAIN
        Scanner scanner = new Scanner(System.in);
        /*1.-System.out.println("Introduce un numero:");
        int number=scanner.nextInt();
        if(esPar(number))System.out.println("El numero es par.");
        else System.out.println("No es Par!"); */
        /* 2.-System.out.println(esMayor(20.0,21.4,32.1));*/
        
        /*3.1.-System.out.println(sumaIntervalo(22222222, 333333333));*/
        
        /*3.2.-long resultadoSuma=sumaIntervalosProgresionMatematica(22222222, 333333333);
        if(resultadoSuma!=-1){System.out.println("La suma del intervalo es:"+resultadoSuma);
        }else{System.out.println("Intervalo invalido!");}/*
        
        /* 4.-String cadena="c0f0d0qw0wq0";
        System.out.println("La cantidad de ceros en la cadena es: "+contarCeros(cadena)); */
        
        /* 5.-System.out.println(aleatorio(31,123));*/
    }
    
    //1.-Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo es. 
    static boolean esPar(int numero){
            return numero%2==0;
    } 
    //2.-Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
    static double esMayor(double num1, double num2, double num3){
        double mayorPrimero = Math.max(num1, num2);
        double mayorNumero= Math.max(mayorPrimero, num3);   
        return mayorNumero;
    }
    /*3.1.-Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma de los
    números comprendidos entre los números pasados (el primero es menor que el segundo, y ambos 
    mayores que cero, en caso contrario devuelve -1)*/
    static long sumaIntervalo(long num1, long num2){
        long resultado=0;
        if((num1>0 && num2>0 && num1<num2)){
            for(long i= num1; i<num2; i++){
              resultado+=i; 
            }
        }else resultado=-1;
    return resultado;
    } 
    //3.2.-Esta funcion una formula mas eficiente para calcular sin iterar.
    static long sumaIntervalosProgresionMatematica(long num1, long num2){
        if((num1>0 && num2>0 && num1<num2)){
            long valorN= num2-num1;
            long resultado= (valorN*(num1+num2-1))/2;
            return resultado; 
        }else{
            return -1;
        }
    }
    //4.-Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros que tiene.
    static String contarCeros(String cadenaUser){ 
        int ceros=0;
            for(int i=0;i<cadenaUser.length();i++){
                if(cadenaUser.charAt(i)=='0'){
                    ceros++;
                }
            }
            cadenaUser=String.valueOf(ceros);
        return cadenaUser;   
    }
    /*5.-Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al azar
    comprendido entre esos dos valores (el primero es menor que el segundo, y ambos mayores
    que cero, en caso contrario devuelve -1)*/
    static int aleatorio(int num1, int num2){
        int resultado;
        Random random = new Random();
        if(num1<num2 && num1>0 && num2>0){
            resultado=random.nextInt(num1, num2);
            return resultado;
        }else{
            resultado=-1; 
            return resultado;
        }
    }
}
