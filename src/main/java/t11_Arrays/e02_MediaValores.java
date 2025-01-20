package t11_Arrays;

import java.util.Scanner;

public class e02_MediaValores {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int[] arrayValores;
        arrayValores = new int [] {1,2,3,4,5,6,7,8,9};
        int suma=0;
        int contador=0;
        
        for (int i=0; i<arrayValores.length;i+=2){
            suma+=arrayValores[i];            
        }
        
        System.out.printf("La media es %.2f%n", (double)suma/contador);
    }
}
