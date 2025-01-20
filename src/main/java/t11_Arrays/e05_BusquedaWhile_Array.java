package t11_Arrays;

import java.util.Scanner;

public class e05_BusquedaWhile_Array {

    public static void main(String[] args) {
        int[] miArray = {10, 20, 12, 1, 2, 3};
        int num = (new Scanner(System.in)).nextInt();
        boolean encontrado = false, fin = false;
        int i = 0; //contador que recorre miArray
        while (!encontrado && !fin) {
            if (num == miArray[i]) {
                encontrado = true;
            } else if (i == miArray.length - 1) {
                fin = true;
            } else {
                i++;
            }
        }
        System.out.println(encontrado ? "encontrado" : "no encontrado");

    }
}
