
package t06_String;
import java.util.Random;
public class ELLt04e05 {
    /*4.5. (Opcional) Realiza un programa que muestre una contraseña generada aleatoriamente
    teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser 
    letras entre la ‘a’ y la ‘j’ pero sin letras repetidas.*/
    
    public static void main(String[] args) {
        Random random = new Random();
        int longitud = random.nextInt(10000, 90000);
        // Rango ASCII para letras de 'a' (97) a 'j' (106)
        int asciiInicio = 97;
        int asciiFin = 106;
        
        
        String password = "";
        for (int i=0; i<longitud; i++){
            int caracteresASCII= random.nextInt(asciiFin-asciiInicio+1)+asciiInicio;
            char letra = (char) caracteresASCII;
            
            if (password.indexOf(letra)==-1){
                password+=letra;
            }  
        }
        System.out.println("La clave generada es la siguiente: " + password);
    }
}
