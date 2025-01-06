
package t06_String;
import java.util.Scanner;
public class ELLt04e01m {
    /*m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)*/
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String input = scanner.nextLine();

        // Normalizar la cadena: quitar espacios y convertir a minúsculas
        String normalizedStr = input.replace(" ", "").toLowerCase();

        // Invertir la cadena
        String reversedStr = "";
        for (int i = normalizedStr.length() - 1; i >= 0; i--) {
            reversedStr += normalizedStr.charAt(i);
        }

        // Comparar la cadena normalizada con la cadena invertida
        if (normalizedStr.equals(reversedStr)) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena no es un palindromo.");
        }
    }
}
