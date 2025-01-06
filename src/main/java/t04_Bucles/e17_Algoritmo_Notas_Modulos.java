package t04_Bucles;
import java.util.Scanner;

public class e17_Algoritmo_Notas_Modulos {
        /*Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos 
        de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario 
        siempre las notas de los nueve módulos?
        no, se puede interrunmpir el bucle si no cumple la condicion, mientras introduces las notas.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nota_alumnos;
        final int modulos = 9;
        int contador_aprobados=0;

            for(int i=1;i<=modulos;i++){
            System.out.println("introduce la nota del modulo Nª="+i);
                nota_alumnos=scanner.nextInt();
                if(nota_alumnos>=5){
                    System.out.println("Modulo Nª="+i);
                    contador_aprobados++;
                } 
                /*if(nota_alumnos<5){
                    FCT=false;
                    return;
                }*/   
            }
            
            if(contador_aprobados==9){
               System.out.println("Ehorabuena, vas al FCT");
            }else {System.out.println("Suerte para la proxima!"); }

             /*if(FCT){System.out.println("Ehorabuena, vas al FCT");}
            else{System.out.println("Suerte para la proxima!");
            }*/
        System.out.println("Fin del bucle!" ); 
    }
}

        
                
       
  

