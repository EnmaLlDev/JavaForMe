package t11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class e00_ArraysEstructura {

    public static void main(String[] args) {

        String[] coches = new String[3];
        for (int i = 0; i < coches.length; i++) {

            System.out.println("Introduce el nombre del coche:");
            coches[i] = (new Scanner(System.in)).nextLine();
        }

        //for each
        for (String item : coches) {
            System.out.println("Tines: " + item + "\n");
        }

        //Tamaño variable usando variable
        int[] miArray;
        int tamanhoArray;
        System.out.println("Indica la longitud del array:");
        tamanhoArray = (new Scanner(System.in)).nextInt();
        miArray = new int[tamanhoArray];
        System.out.println("Contenido");
        miArray.toString();

        //Clase Arrays metodo ToString
        System.out.println(Arrays.toString(coches));

    }
}
