package t07_Manejo_String;
import java.util.Scanner;
public class anagrama {
    /*4. Escribe un programa que detecte si una palabra es anagrama de otra, es decir, si tiene las
    mismas letras es distinta posición. Son ejemplo de anagrama, las palabras creativo y reactivo.
    Suponemos que si tienen letras repetidas, en la otra palabra no se tienen que repetir en la misma
    cantidad; es decir, damos por válido como anagrama el texto abba y aaab.*/
     public static void main(String[] args) {
        String texto1, texto2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Una palabra: ");
        texto1 = teclado.nextLine().toLowerCase();  // Convertimos a minÃºsculas
        System.out.print("Otra palabra: ");
        texto2 = teclado.nextLine().toLowerCase();  // Convertimos a minÃºsculas

        // Si las longitudes son diferentes, no pueden ser anagramas
        if (texto1.length() != texto2.length()) {
            System.out.println("Las palabras " + texto1 + " y " + texto2 + " no son anagramas");
            return;
        }

        // Usamos StringBuffer para manipular las cadenas
        StringBuffer sb1 = new StringBuffer(texto1);
        StringBuffer sb2 = new StringBuffer(texto2);

        boolean anagrama = true;

        // Recorremos la primera palabra y buscamos cada carÃ¡cter en la segunda
        for (int i = 0; i < sb1.length(); i++) {
            char letra = sb1.charAt(i);
            int index = sb2.indexOf(String.valueOf(letra)); // Buscamos el Ã­ndice de la letra en sb2

            if (index != -1) {  // Si encontramos la letra en sb2
                sb2.deleteCharAt(index);  // Eliminamos la letra encontrada de sb2
            } else {
                anagrama = false;  // Si no encontramos la letra, no son anagramas
                break;
            }
        }

        // Verificamos si todas las letras fueron emparejadas correctamente
        if (anagrama) {
            System.out.println("Las palabras " + texto1 + " y " + texto2 + " son anagramas");
        } else {
            System.out.println("Las palabras " + texto1 + " y " + texto2 + " no son anagramas");
        }
    }
}

   