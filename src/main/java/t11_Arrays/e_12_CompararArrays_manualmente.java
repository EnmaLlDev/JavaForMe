package t11_Arrays;

public class e_12_CompararArrays_manualmente {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean esIgual=true;

        if (array1.length != array2.length) {
            esIgual = false; //Longitud distinta
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    esIgual=false;
                    break; //alguna posicion es diferente
                }
            }
        }
        System.out.println("Son iguales los arrays" + esIgual);
    }
}
