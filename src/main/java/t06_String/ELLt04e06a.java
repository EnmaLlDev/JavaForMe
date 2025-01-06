
package t06_String;
import java.util.Scanner;
public class ELLt04e06a {
    /*4.6. Realiza un programa al que se le introduzca un email y nos 
    - devuelva el nombre del dominio es decir, lo que está entre la arroba y el punto 
      (Ejemplo: info@mundo-r.com mostraría mundo-r ). */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String correoUser;
       
        String dominio = " ";
        String usuario = " ";
        boolean caracterValido = false;
        boolean esValido = true;
                
        while(esValido){
            System.out.println("Valida tu correo electronico:");
            correoUser = scanner.nextLine();
            if((correoUser.contains("@"))&&correoUser.contains(".")){
                System.out.println("Formato correcto");    
                for(int i=0; i<correoUser.length(); i++) {
                char caracter = correoUser.charAt(i);
                    //encuentra el arroba
                    if(caracter=='@'){
                        caracterValido=true;
                    }else if (caracterValido==true){
                        //encuentra el punto
                        if(caracter=='.'){
                           break;
                        }
                        dominio+=caracter;
                    } else{
                        usuario+=caracter;
                    }   
                }
                System.out.println("El nombre del dominio es: " + dominio
                +"\nEl nombre del ususraio es: " +usuario);
                
                
            }
            else {
                System.out.println("Correo invalido!");
                esValido=false;
            }
        }
        System.out.println("Fin del programa!");
    }
}
