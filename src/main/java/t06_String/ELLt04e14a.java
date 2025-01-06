
package t06_String;
import java.util.Scanner;

public class ELLt04e14a {
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
        System.out.println("Ingresa una cadena:");
        String cadena=scanner.nextLine();
        StringBuilder cadenaConstruida = new StringBuilder(cadena);
        int opcion;
        System.out.println("Selecciona una de las siguientes intrucciones: "+
                 "\n(1).- Borrar el caracter que haya en la posicion 3."+
                 "\n(2).- Insertar una 'x' en la posicion 5."+
                 "\n(3).- Sustituir el caracter de la posicion 1 por un 'z'."+
                 "\n(4).- Borrar los caracteres entre la posicion 5 y 10."+
                 "\n(5).- Darles la vuelta a todos los caracteres del StringBuilder."+
                 "\n(6).- Convertir el StringBuilder en cadena.");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1: {
                    if(opcion==1){
                    System.out.println("Has seleccionado la Opcion 1.");
                    // a. Borrar el carácter en la posición 3
                        if (cadenaConstruida.length() > 3) {
                            System.out.println(cadenaConstruida.deleteCharAt(3));
                        } else {
                            System.out.println("La cadena es muy corta para borrar el carácter en la posición 3.");
                        }
                    }
                }
            case 2: {
                    if(opcion==2){
                    System.out.println("Has seleccionado la Opcion 2.");
                    // b. Insertar una 'x' en la posición 5
                        if (cadenaConstruida.length() > 5) {
                            System.out.println(cadenaConstruida.insert(5, 'x'));
                        } else {
                            System.out.println("La cadena es muy corta para insertar en la posición 5.");
                        }
                    }
                }
            case 3: {
                    if(opcion==3){
                    System.out.println("Has seleccionado la Opcion 3."); 
                    // c. Sustituir el carácter de la posición 1 por una 'z'
                        if (cadenaConstruida.length() > 1) {
                            cadenaConstruida.setCharAt(1, 'z'); //Este metodo no devuelve ningun valor 
                            System.out.println(cadenaConstruida); //Se imprime el resultado aparte
                        } else {
                            System.out.println("La cadena es muy corta para sustituir en la posición 1.");
                        }
                    }
                }
            case 4: {
                    if(opcion==4){
                    System.out.println("Has seleccionado la Opcion 4.");
                    // d. Borrar los caracteres entre la posición 5 y 10
                        if (cadenaConstruida.length() > 10) {
                            System.out.println(cadenaConstruida.delete(5, 10));
                        } else if (cadenaConstruida.length() > 5) { // Si la longitud es menor a 10 pero mayor a 5
                            System.out.println(cadenaConstruida.delete(5, cadenaConstruida.length())); 
                        } else {
                            System.out.println("La cadena es muy corta para borrar caracteres entre las posiciones 5 y 10.");
                        }
                    }
                }
            case 5: {
                    if(opcion==5){
                    System.out.println("Has seleccionado la Opcion 5.");
                    // e. Darles la vuelta a todos los caracteres del StringBuilder
                        System.out.println(cadenaConstruida.reverse());
                    }
                }
            case 6: {
                    if(opcion==6){
                    System.out.println("Has seleccionado la Opcion 6.");
                    // f. Convertir el StringBuilder en cadena
                        String resultadoFinal = cadenaConstruida.toString();
                        System.out.println(resultadoFinal);
                    }
                }
        }
    }     
}
