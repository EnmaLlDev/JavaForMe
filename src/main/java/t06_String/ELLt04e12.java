
package t06_String;
import java.util.Scanner;
public class ELLt04e12 {
    /*4.12. Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean
    dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta
    que lo haga correctamente.*/
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        boolean todosDigitos=true;
        boolean digitosRepetidos=false;
        
        //condicionales para controlar las excepciones al enunciado
        while(todosDigitos==true && digitosRepetidos==false)
        {
            System.out.println("introduce solo digitos (6 posciones)");
            String cadena = scanner.nextLine();
        
            if(cadena.length() != 6) {
            System.out.println("Error, longitud");
            continue;
            }
            
            for(int i=0;i<cadena.length();i++){
                if(!Character.isDigit(cadena.charAt(i))){
                todosDigitos=false;
                    System.out.println("Posicion inocrrecta("+cadena.charAt(i)+")."); //basta que uno sea diferente
                    continue;
                }
                else System.out.println("Posicion("+cadena.charAt(i)+")"+ " Correcta");
            }
            for(int i=0;i<cadena.length();i++){
                for(int j=i+1;j<cadena.length();j++){
                    if(cadena.charAt(i)==cadena.charAt(j)){
                    System.out.println("La cadena no debe tener caracteres repetidos.");
                    digitosRepetidos=true;
                    continue;
                    }
                }               
            }
             if (todosDigitos==true && digitosRepetidos==false){ System.out.println("cadena correcta"); return;} 
             else { System.out.println("try again!");}
        }
    }
}