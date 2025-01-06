package t04_Bucles;
import java.util.Scanner;

public class e10_BucleEdades_Condiciones {
        /*Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe 
        si hay alguno menor de edad.
        En cuanto encuentre un menor de edad, la respuesta va a ser “Sí hay alguno”, 
        aunque luego sigamos introduciendo edades, esta situación ya no va a cambiar, ojo 
        al hacer el “if” */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        int limite=0; 
        int contador_menores=0;
        while (limite!=-1){
            System.out.println("Introduce un la edad del alumno:");
            edadAlumno=scanner.nextInt();
                if (edadAlumno<18){
                contador_menores++; 
                System.out.println("Si hay uno!");  
                }else{System.out.println("Todo correcto, introduce otro");} 
                if(contador_menores>0){
                System.out.println("Tenemos: "+contador_menores+" menores." );
            }     
        }
        System.out.println("fin del bucle"); 
    }      
} 


        
                
       
  

