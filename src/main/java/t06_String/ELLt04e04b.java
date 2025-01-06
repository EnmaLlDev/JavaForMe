
package t06_String;
import java.util.Random;
public class ELLt04e04b {
    /* 4.4. Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
            siguientes limitaciones: 
    
            Tendrá entre 5 y 10 posiciones que solo pueden ser letras 
            entre la ‘a’ y la ‘j’.*/
    public static void main(String[] args) {
        Random random = new Random();
        int longitud = random.nextInt(6)+5;
        // Rango ASCII para letras de 'a' (97) a 'j' (106)
        int asciiInicio = 97;
        int asciiFin = 106;
        
        String password = "";
        for (int i=0; i<longitud; i++){
            int caracteresASCII= random.nextInt(asciiFin-asciiInicio+1)+asciiInicio;
            
            password+=(char)caracteresASCII;
        }
        System.out.println("La clave generada es la siguiente: " + password);
    }
}
