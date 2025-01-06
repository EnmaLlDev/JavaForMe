package t04_Bucles;
import java.util.Scanner;

public class e04_DeterminarRango_TablaMultiplicar {
        /*Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre 
        1 y 10, y mostrar su tabla de multiplicar.  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10:");
        int userNumber=scanner.nextInt();
         
        if(userNumber>0&&userNumber<=10){
            //Uso como determinante del bucle el numero introducido por el usuario  
            for(int i=1;i<userNumber;i++){
                System.out.println("Tabla de multiplicar del " + userNumber + ":");
                System.out.println(userNumber + "*" + i + " = " + (userNumber * i));
            }
        } else System.out.println("fin del bucle, has introducido un numero invalido.");  
    }
}


        
                
       
  

