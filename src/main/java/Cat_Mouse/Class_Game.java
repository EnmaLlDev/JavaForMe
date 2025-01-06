
package Cat_Mouse;
import java.util.Random;
public class Class_Game {
       // Clase Gato
    public static class Gato {
        private int posXgato, posYgato;
        private Random random = new Random();

        public Gato(int filas, int columnas) {
            this.posXgato = random.nextInt(filas);
            this.posYgato = random.nextInt(columnas);
        }

        public int getPosicionX() { return posXgato; }
        public int getPosicionY() { return posYgato; }

        public void movimientoGato(int filaRaton, int columnaRaton) {
            if (posXgato < filaRaton) posXgato++;
            else if (posXgato > filaRaton) posXgato--;

            if (posYgato < columnaRaton) posYgato++;
            else if (posYgato > columnaRaton) posYgato--;
        }
    }

    // Clase Raton
    public static class Raton {
        private int posXraton, posYraton;
        private Random random = new Random();

        public Raton(int filas, int columnas) {
            this.posXraton = random.nextInt(filas);
            this.posYraton = random.nextInt(columnas);
        }

        public int getPosicionX() { return posXraton; }
        public int getPosicionY() { return posYraton; }

        public void movimientoRaton(int filas, int columnas) {
            boolean movimientoValido = false;
            while (!movimientoValido) {
                int direccion = random.nextInt(4); // 0: arriba, 1: abajo, 2: izquierda, 3: derecha
                int nuevaFila = posXraton, nuevaColumna = posYraton;

                switch (direccion) {
                    case 0 -> nuevaFila -= 2; // Arriba
                    case 1 -> nuevaFila += 2; // Abajo
                    case 2 -> nuevaColumna -= 2; // Izquierda
                    case 3 -> nuevaColumna += 2; // Derecha
                }

                if (nuevaFila >= 0 && nuevaFila < filas &&
                    nuevaColumna >= 0 && nuevaColumna < columnas) {
                    posXraton = nuevaFila;
                    posYraton = nuevaColumna;
                    movimientoValido = true;
                }
            }
        }
    }

    // Clase Tablero
    public static class Tablero {
        private int cantFilas, cantColumnas;

        public Tablero(int cantFilas, int cantColumnas) {
            this.cantFilas = cantFilas;
            this.cantColumnas = cantColumnas;
        }

        public void dibujarTablero(int filaGato, int columnaGato, int filaRaton, int columnaRaton) {
            for (int i = 0; i < cantFilas; i++) {
                for (int j = 0; j < cantColumnas; j++) {
                    if (i == filaGato && j == columnaGato) System.out.print("G ");
                    else if (i == filaRaton && j == columnaRaton) System.out.print("R ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
        }
    }
}
    


 