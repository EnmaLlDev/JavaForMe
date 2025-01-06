package t06_String;

import java.util.Scanner;

public class ELLt04e14b {

    /* 4.14. Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a StringBuilder, y aplicando métodos de esa clase, 
     haga lo siguiente:
       a. Borrar el carácter que haya en la posición 3.
       b. InsertSar una ‘x’ en la posición 5.
       c. Sustituir el carácter de la posición 1 por una ‘z’.
       d. Borrar los caracteres entre la posición 5 y 10.
       e. Darles la vuelta a todos los caracteres del StringBuilder.
       f. Convertir el StringBuilder en cadena.
    
       Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de
       la posición indicada, sino producirá errores. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        StringBuilder cadenaConstruida = new StringBuilder(cadena);

        // a. Borrar el carácter en la posición 3
        if (cadenaConstruida.length() > 3) {
            cadenaConstruida.deleteCharAt(3);
        } else {
            System.out.println("La cadena es muy corta para borrar el carácter en la posición 3.");
        }
        // b. Insertar una 'x' en la posición 5
        if (cadenaConstruida.length() > 5) {
            cadenaConstruida.insert(5, 'x');
        } else {
            System.out.println("La cadena es muy corta para insertar en la posición 5.");
        }
        // c. Sustituir el carácter de la posición 1 por una 'z'
        if (cadenaConstruida.length() > 1) {
            cadenaConstruida.setCharAt(1, 'z');
        } else {
            System.out.println("La cadena es muy corta para sustituir en la posición 1.");
        }
        // d. Borrar los caracteres entre la posición 5 y 10
        if (cadenaConstruida.length() > 10) {
            cadenaConstruida.delete(5, 10);
        } else if (cadenaConstruida.length() > 5) {
            cadenaConstruida.delete(5, cadenaConstruida.length());  // Si la longitud es menor a 10 pero mayor a 5
        } else {
            System.out.println("La cadena es muy corta para borrar caracteres entre las posiciones 5 y 10.");
        }
        // e. Darles la vuelta a todos los caracteres del StringBuilder
        cadenaConstruida.reverse();

        // f. Convertir el StringBuilder en cadena
        String resultadoFinal = cadenaConstruida.toString();
    }
}
