package t04_Bucles;
import java.util.Scanner;
public class e07_AnalisisPrograma_BucleDivisores {
    /*Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave?
    ¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su
    funcionalidad?*/
    
    //Ejercicio planteado:
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
    
        if (num <0 && num > 1000)
        System.out.println("Numero incorrecto.");
        else
            for (int i=num;num>=1;i--)
                if (num % i == 0) System.out.println(i);
        
        /*RESPUESTA:
        Indica la funcionalidad del siguiente programa:
        
        El programa pide por pantalla un numero al usuario entre 1 y 1000 y plantea 
        una condicion, en caso afirmativo se muestra error, en caso contario se ejecuta 
        un bucle for que muestra los nuemros divisores del numero ingresado por el usuario.    
        
        ¿Tiene algún error? ¿Falta alguna llave?
        ** Existe un silogismo en el planteamiento incial del condicional IF ya que no puede
        haber un numero que sea menor a 0 y en simultaneo sea mayor a 1000.
        
        Logico seria que el numero ingresado esta dentro del rango, y asi activar el &&. En 
        caso contrario muestre el mensaje "Numero ccrrecto."
        
        La sintaxis del bucle for esta mal planteada para mi logica. el valor de la variable 
        que se declara tambien se usa como condicion del bucle for. deberia ser inverso el
        planteamiento "for(int i=num;i<num;i--)" por ejemplo.
        
        ¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo
        su funcionalidad?
        Consiero iniciando la condicion del bucle for desde el numero ingresado por el usuario
        se acorta el recorrido del mismo.*/
        
    } 
}
        
        
