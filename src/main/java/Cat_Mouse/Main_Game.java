package Cat_Mouse;
import Cat_Mouse.Class_Game.*;
import java.util.Random;
import java.util.Scanner;

public class Main_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 20, columnas = 20;
        Tablero tablero = new Tablero(filas, columnas);
        Raton Pancracio = new Raton(filas, columnas);
        Gato Timoteo = new Gato(filas, columnas);

        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            tablero.dibujarTablero(Timoteo.getPosicionX(), Timoteo.getPosicionY(),
                                   Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Timoteo.getPosicionX() &&
                Pancracio.getPosicionY() == Timoteo.getPosicionY()) {
                System.out.println("El gato atrapo al raton");
                juegoTerminado = true;
                break;
            }

            Pancracio.movimientoRaton(filas, columnas);

            tablero.dibujarTablero(Timoteo.getPosicionX(), Timoteo.getPosicionY(),
                                   Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Timoteo.getPosicionX() &&
                Pancracio.getPosicionY() == Timoteo.getPosicionY()) {
                System.out.println("El gato atrapó al raton");
                juegoTerminado = true;
                break;
            }

            Timoteo.movimientoGato(Pancracio.getPosicionX(), Pancracio.getPosicionY());
        }

        scanner.close();
    }
}



