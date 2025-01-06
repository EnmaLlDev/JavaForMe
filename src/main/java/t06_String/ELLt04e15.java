package t06_String;

import java.util.Scanner;

public class ELLt04e15 {

    /* 4.15. Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones
    impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g” */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String cadena = scanner.nextLine();
        StringBuilder cadenaConstruida = new StringBuilder(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            if (i % 2 != 0) {
                // Reemplaza el carácter en la posición impar con un asterisco
                cadenaConstruida.setCharAt(i, '*');
            }
        }
        System.out.println("Texto modificado: " + cadenaConstruida.toString());
    }
}
