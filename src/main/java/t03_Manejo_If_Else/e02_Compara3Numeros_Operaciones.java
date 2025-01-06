
package t03_Manejo_If_Else;
import java.util.Scanner;

public class e02_Compara3Numeros_Operaciones {
    /* Diseñar un programa al que se le introduzcan por consola tres números enteros. 
    Si todos son negativos, mostrar el producto de los tres. 
    Si alguno es negativo, pero no todos, mostrar la suma de los tres. 
    En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el 
    tercero. 
    
    ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer 
    que el cero es un número positivo). Hacer el programa lo más sencillo posible. */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce el primer numero:");
        int userNumber1=scanner.nextInt();
        System.out.println("Introduce el segundo numero:");
        int userNumber2=scanner.nextInt();
        System.out.println("Introduce el tercero numero:");
        int userNumber3=scanner.nextInt(); 
        
        int productoNegativo, algunoNegativo, todosPositivos;
        
        if(userNumber1 < 0 && userNumber2 < 0 && userNumber3 < 0){
            productoNegativo = userNumber1*userNumber2*userNumber3;
            System.out.println("El producto de los numeros previos es:"+productoNegativo);
            } 
        else if (userNumber1 < 0 || userNumber2 < 0 || userNumber3 < 0){
                algunoNegativo=userNumber1 + userNumber2 + userNumber3;
                {System.out.println("Alguno de los numeros introducidos es negativo, la suma de "
                            + "los tres es: " + algunoNegativo);}
            }
        else if (userNumber1 > 0 && userNumber2 > 0 && userNumber3 > 0){
                todosPositivos=(userNumber1+userNumber2)*userNumber3;
                System.out.println("Todos los numeros son positivos, la suma de los dos primeros"
                        + " y la multiplacion posterior es: " + todosPositivos);
            } 
        //No se contempla el valor del cero en todas las variables 
        else if (userNumber1==0 && userNumber2==0 && userNumber3==0){
             System.out.println("Todos los valores introducidos son ceros. ");
            }
    }               
  }  
