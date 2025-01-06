package t07_Manejo_String;

import java.util.Scanner;

public class borraPalabras {
    /*1. Escribe un programa que borre de un texto una palabra que indique el usuario.*/
       public static void main(String[] args)
   {
      String str, palabra;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Texto: ");
      str = teclado.nextLine();
      System.out.print("Escriba la palabra a borrar: ");
      palabra = teclado.nextLine();
      
      str = str.replaceAll(palabra, "");
      
      System.out.println("El nuevo texto es: " +str);
   }
}
    
