package t11_Arrays;

import java.util.Scanner;

public class e04_BusquedaFor_Arrays {

    public static void main(String[] args) {
        int[] miArray = {10, 20, 12, 1, 2, 3};
        int num = (new Scanner(System.in)).nextInt();
        boolean encontrado = false;
        for (int i = 0; i < miArray.length; i++) {
            if (num == miArray[i]) {
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "encontrado" : "no encontrado");
    }

}
