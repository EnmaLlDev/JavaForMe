package String_Clases;
public class String_erroresFrecuentes {

    public static void main(String[] args) {
        /*Errores Frecuentes:
           Hay que comparar los String con equals(), compareTo(), compareToIgnoreCase(),
          pero nunca con ==.
           Los String comienzan en la posición cero, no en la 1.
           El último carácter de una cadena está en length()-1. 
            Es erróneo cadena.charAt(cadena.length()) a secas.
           El método substring (x,y) no incluye la posición ‘y’, acaba en la anterior a ‘y’.
           Una operación sobre un String crea un nuevo String, no modifica el actual.
        */
    }
}
