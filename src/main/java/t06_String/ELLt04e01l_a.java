package t06_String;
import java.util.Scanner;
public class ELLt04e01l_a {
    /*l. Decir cuántos dígitos numéricos hay en la cadena.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce texto para evaluar sus caracteres:");
        String cadenaTexto = scanner.nextLine();
        int acumuladorDigitos=0;
        int acumuladorAlfabetico=0;
        int acumuladorAlternativo=0;
        
        char caracterNumerico;
        char caracterAlfabetico;
        char caracterAlternativo;
        
        for(int i=0;i<cadenaTexto.length();i++){
          caracterNumerico = cadenaTexto.charAt(i);
          caracterAlfabetico = cadenaTexto.charAt(i);
          caracterAlternativo = cadenaTexto.charAt(i);
          
            if(Character.isDigit(caracterNumerico)) {
                acumuladorDigitos++;
            }else if(Character.isAlphabetic(caracterAlfabetico)){
                acumuladorAlfabetico++;
            }else if((!Character.isDigit(caracterNumerico))&&(!Character.isAlphabetic(caracterAlfabetico))) {
                acumuladorAlternativo++;
            }
        }
        System.out.println("Resultados: " +
                            "\nCaracteres Numeros: "+ acumuladorDigitos+
                            "\nCaracteres Alfabetico: "+ acumuladorAlfabetico+
                            "\nCaracteres Alternativos: "+ acumuladorAlternativo);
    }
}