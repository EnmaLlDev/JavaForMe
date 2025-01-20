package t11_Arrays;

import java.util.Scanner;

public class e06_BusquedaDicotomica_Array {

    public static void main(String args[]) {
        int[] miArray = {1, 20, 32, 41, 52, 93};
        int numBuscado = (new Scanner(System.in)).nextInt();
        boolean encontrado = false, fin = false;
        int centro, inf = 0, sup = miArray.length - 1;
        
        while (!encontrado && !fin) {
            centro = (int) ((sup + inf) / 2); //Recorre las POSICIONES solamente 
            
            if (numBuscado == miArray[centro]) {
                encontrado = true;
            } else {
                if (numBuscado < miArray[centro]) {
                    sup = centro - 1;
                } else {
                    inf = centro + 1;
                }
                if (inf > sup) {
                    fin = true;
                }
            }
        }
        System.out.println(encontrado ? "encontrado" : "no encontrado");
    }
}
