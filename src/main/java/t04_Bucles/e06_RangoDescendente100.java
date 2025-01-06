package t04_Bucles;
import java.util.Scanner;
public class e06_RangoDescendente100 {
    /*Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden
    descendente.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {System.out.println("Los numeros pares entre 100 y 1 son:");}
        for(int i=100;i>0;i--){
            if(i%2==0)
            {System.out.println("Numero:"+i+" ");}
        }
        System.out.println("Fin del buble.");
    }
}
