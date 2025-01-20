package t11_Arrays;

public class e08_Copia_ReferenciaPosicional_Arrays {

    public static void main(String[] args) {
        int[] edad = {18, 23, 13, 18, 14, 7};
        int[] copia = new int[]{1, 2, 3, 4, 5, 6};
        copia = edad; //ahora copia es un “alias de edad”
        
        MostrarContenido(edad);
        
        MostrarContenido(copia);

    }
    public static void MostrarContenido(int[] miArray) {
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Posicion --> " + (i + 1) + " -- " + miArray[i]);
        }
    }
}
