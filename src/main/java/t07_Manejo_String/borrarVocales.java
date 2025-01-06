
package t07_Manejo_String;

import java.util.Scanner;

public class borrarVocales {
    /*2. Haz un programa que introducido un texto lo escriba sin las vocales que tenía.*/

   public static void main(String[] args)
   {
      String cadenaUsuario, cadenaResultado, vocales;
      char letra;
      boolean encontrada;
      int i, k;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Inroduzca el texto: ");
      cadenaUsuario = teclado.nextLine();
      
      cadenaResultado="";
      vocales = "aeiouAEIOU";
      for(i=0; i<cadenaUsuario.length(); i++)
      {
         encontrada = false;
         letra = cadenaUsuario.charAt(i);
         for(k=0; k<vocales.length(); k++)
         {
            if(letra==vocales.charAt(k))
               encontrada = true;
         }
         if(!encontrada)
            cadenaResultado = cadenaResultado + letra;
      }
      
      System.out.println("Texto sin vocales = " +cadenaResultado);
   }
}
