package t04_Bucles;
import java.util.Scanner;

public class e03_BuclePositivos_ParesImpares {
        /* Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a 
        uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos 
        versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
        versión en la que la lectura de datos se haga únicamente al principio del bucle.  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        
        System.out.println("Introduce un numero positivo:");
        userNumber=scanner.nextInt();
        
        /*while(userNumber>0){
                if(userNumber%2==0){
                    System.out.println("Nro par:"+userNumber);
                    return;
                }else{ System.out.println("Nro impar:"+userNumber); return;}   
        }
         System.out.println("fin del bucle, has introducido un numero negativo");
    }
}*/
        //segunda version
        do{
            System.out.println("Introduce un numero positivo:");
            userNumber=scanner.nextInt();
            if(userNumber<0){System.out.println("Error --> numero negativo");}
              if(userNumber%2==0){
                    System.out.println("Nro par:"+userNumber);
                }else {
                    System.out.println("Nro impar:"+userNumber);  
                }
        }while(userNumber<0);
    System.out.println("");
    }  
}
  
                
       
  

