
package t06_String;
import java.util.Random;
public class ELLt04e04a {
    /* 4.4. Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las
            siguientes limitaciones: 
            Tendrá entre 5 y 10 posiciones que solo pueden ser letras 
            entre la ‘a’ y la ‘j’.*/
    public static void main(String[] args) {
         System.out.println("Solucion con posiciones de la Tabla ASCII");
        Random random = new Random();
        int longitud = random.nextInt(6)+5;
        String password = "";
        
            for(int i=0; i<=longitud; i++){
                int numeroAleatorio= random.nextInt(10);
                char letra = (char)('a'+numeroAleatorio);
                password+=letra;
            }
            System.out.println(password);
        
     if((password.length()>=5)&&(password.length()<=10)){}
    }
}
