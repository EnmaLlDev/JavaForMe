package Ejercicios_funciones;

import java.util.Scanner;

public class e02_compruebaParentesis {

    /*2. Programa una función, comprobarParentesis() para que recibe como entrada un String y
    devuelve verdadero o falso. La función comprobará si hay tantos paréntesis de apertura como de
    cierre. Si son iguales ambos números, devolverá true, en caso contrario, false.
     */
    public static void main(String[] args) { // CLASS MAIN
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce una String;");
        String cadenaUser = scanner.nextLine();

        System.out.println(comprobarParentesis(cadenaUser));
    }

    public static boolean comprobarParentesis(String cadenaUser) {
        boolean resultado=false;
        char apertura = '(';
        char cierre = ')';
        int contadorParentesis = 0; // permite saber si estan en igual cantidad o no

        for (int i = 0; i < cadenaUser.length(); i++) {
            char caracter = cadenaUser.charAt(i);
            if (caracter == apertura) {
                contadorParentesis++;
            } else if (caracter == cierre){
            contadorParentesis--;}
            
            if (contadorParentesis !=0) { 
                resultado = false;
            } else {
                resultado = true;
            }
        }
        return resultado;
    }
}
