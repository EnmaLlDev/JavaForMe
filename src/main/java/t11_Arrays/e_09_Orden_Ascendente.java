package t11_Arrays;

public class e_09_Orden_Ascendente {

    public static void main(String[] args) {
        int[] numeros = {61, 120, 32, 41, 52, 93};
        verificarOrdenAscendente(numeros);
    }

    public static void verificarOrdenAscendente(int[] miArray) {
        int posMin;
        for (int i = 0; i < miArray.length - 1; i++) {
    //busqueda del menor
            posMin = i;
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[j] < miArray[posMin]) {
                    posMin = j;
                }
            }
    //intercambio del actual i con el menor
            int aux = miArray[i];
            miArray[i] = miArray[posMin];
            miArray[posMin] = aux;
        }
    //Mostrar resultado
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }
    }
}
