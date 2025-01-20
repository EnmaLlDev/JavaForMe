package t11_Arrays;

/*
Para acceder a estos elementos, sería algo como:
System.out.println(notas[15][1]);
Y para recorrerlo haría falta un doble bucle, uno primero para recorrer las filas y dentro de cada fila
otro para recorrer las columnas de cada fila.
 */
public class e11_Array_Bidimensional_4F_X_3C {

    public static void main(String[] args) {
        //array para 30 alumnos y 3 evaluac.
        int[][] notasAlumnos = new int[30][3]; // 30 Alumnos X 3 Evaluaciones

        int[][] notas = {{10, 9, 10}, {0, 0, 1}, {6, 7, 6}, {5, 5, 4}};
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(notas[fila][col]);
            }
        }
    }
}
