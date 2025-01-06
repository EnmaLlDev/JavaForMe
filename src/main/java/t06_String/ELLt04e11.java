
package t06_String;
public class ELLt04e11 {
    /*  4.11. Describe que realiza el código siguiente e indica si contiene algún error.*/
    
    public static void main(String[] args) {
        //Se crea un objeto para leer por teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        //Se pide un valor String y se almacena en "cadena"
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        //Se crea un objeto StringBuilder "cadenaSB" a partir del String "cadena"
        StringBuilder cadenaSB = new StringBuilder(cadena);
        //Variable entera para recorrer "cadenaSB"
        int pos;
            /*Buble que permite limpiar los espacios vacios o en blanco
            entra en el bucle mientras y se evalua la posicion del String para 
            salir del mismo cunado se acaben los caracteres del String.
            */
            do {
                pos = cadenaSB.indexOf(" ");
                /*condicional:
                pos, almacena los espacios en blanco
                si la posicion actual de la iteracion(-1) es un espacio en blanco
                elimina con el metodo "deleteChartAt(pos)"
                */
                if (pos!=-1) cadenaSB.deleteCharAt(pos);
            } while (pos != -1);
        //Muestra el objeto StringBuilder
        System.out.println(cadenaSB);
    }
}
