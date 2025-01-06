package t08_funciones;

import java.util.Scanner;

public class ELLt05e05 {
    /* 5.5. Programa que calcule el factorial de números menores de 20. El programa permite al usuario
    meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20.
    Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero:");
            int numero = scanner.nextInt();
            System.out.println("El numero factorial de: " + numero
                    + " es: " + calcularFactorial(numero));
            System.out.println("\nSuma es: " + sumaIteracion(numero)
                    + "\nResta es: " + restaIteracion(numero)
                    + "\nMultiplicacion es: " + multiplicaIteracion(numero));
            
            
            System.out.println("Calcula el modulo: \nIntroduce el valor del divisor");
            int divisor = scanner.nextInt();
            System.out.println("Modulo es: " + calcularModulo(numero, divisor));
            
            } catch (IllegalArgumentException e) {System.out.println(e.getMessage());
            } finally {
              System.out.println("Programa finalizado!");
              scanner.close(); // Asegúrate de cerrar el Scanner
        }
    }

    public static int calcularFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int restaIteracion(int numero) {
        int resta = 0;
        for (int i = numero; i >= 1; i--) {
            resta -= i;
        }
        return resta;
    }

    public static int sumaIteracion(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }

    //Fórmula directa para la suma de números naturales
    public static int sumaModePrime(int numero) {
        return (numero * (numero + 1) / 2);
    }

    public static int multiplicaIteracion(int numero) {
        int multiplicacion = 1;// si pones 0, estas mal, 1 mejor.
        for (int i = 1; i <= numero; i++) {
            multiplicacion *= i;
        }
        return multiplicacion;
    }

    public static int calcularModulo(int numero, int divisor) {
        if (numero < 0 || divisor <= 0) {
            throw new IllegalArgumentException("Ambos números deben ser positivos y el divisor mayor que cero.");
        }
        return numero % divisor;
    }
}
