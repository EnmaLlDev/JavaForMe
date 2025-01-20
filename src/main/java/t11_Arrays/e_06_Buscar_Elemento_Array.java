package t11_Arrays;

import java.util.Random;
import java.util.Scanner;

public class e_06_Buscar_Elemento_Array {

    public static void main(String[] args) {
        Random random = new Random();
        boolean encontrado = false;
        int[] miArray = new int[10];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = random.nextInt(0, 5);
        }
        while (!encontrado) {
            
            System.out.println("Ingresa el numero que deseas encontrar:");
            int num = (new Scanner(System.in)).nextInt();
            for (int j = 0; j< miArray.length; j++) {
                if (miArray[j]==num){
                System.out.println("Encontrado!!!!");
                encontrado=true;
                } 
                else System.out.println("-1");
            }
        }
    }
}
