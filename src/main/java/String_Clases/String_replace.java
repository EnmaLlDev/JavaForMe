package String_Clases;
import java.util.Scanner;
public class String_replace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un string:");
        String cadena = scanner.nextLine();
        
        //replace
        String cadenaReplaceAll = cadena.replaceAll("[A-Z]", "0");
        String cadenaReplaceFirst = cadena.replaceFirst("[a-z]", "9");
        String cadenaReplace = cadena.replace(cadena, "otra cadena");
        
        System.out.println(cadenaReplaceAll+"\n"+ cadenaReplaceFirst+"\n"+cadenaReplace);
    }
}
