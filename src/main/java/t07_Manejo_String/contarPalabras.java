package t07_Manejo_String;

import java.util.Scanner;

public class contarPalabras {
    /*3. Escribe un programa que cuente las vocales y cuente las consonantes de un texto introducido*/
     public static void main(String[] args)
   {
      String str;
      char ch;
      int len, i, vocal=0, consonante=0;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Escriba el Texto: ");
      str = teclado.nextLine();
      
      len = str.length();
      for(i=0; i<len; i++)
      {
         ch = str.toLowerCase().charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vocal++;         
         else   // si no la he contado como vocal, y estÃ¡ en el alfabeto, es consonante         
           if (ch>= 'a' && ch <= 'z')
               consonante++;         
      }
      
      System.out.println("NÃºmero de vocales = " +vocal);
      System.out.println("NÃºmero de consonantes = " +consonante);
   }
}