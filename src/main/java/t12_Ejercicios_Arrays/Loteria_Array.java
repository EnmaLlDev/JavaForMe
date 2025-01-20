package t12_Ejercicios_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Loteria_Array {

    public static void main(String[] args) {
        int[] boleto1 = {1, 2, 3, 4, 5, 6}; // Boleto fijo para comparar
        Loteria PRIMITIVA = new Loteria();
        int aciertos3 = 0, aciertos4 = 0, aciertos5 = 0, aciertos6 = 0;

        // Simulación de 1000 boletos
        for (int i = 0; i < 1000; i++) {
            int[] boletoTemporal = PRIMITIVA.GenerarBoleto();
            int aciertosTemporal = PRIMITIVA.CantidadAciertos(boletoTemporal);
            switch (aciertosTemporal) {
                case 3 -> aciertos3++;
                case 4 -> aciertos4++;
                case 5 -> aciertos5++;
                case 6 -> aciertos6++;
            }
        }

        // Buscar un boleto ganador (6 aciertos)
        long boletos = 0;
        while (true) {
            int[] boletoJugado = PRIMITIVA.GenerarBoleto();
            if (Arrays.equals(PRIMITIVA.getResultado(), boletoJugado)) {
                break;
            }
            boletos++;
        }

        // Resultados
        System.out.println("=====================================");
        System.out.println("1000 boletos generados.");
        System.out.println("NUMERO PREMIADO: " + Arrays.toString(PRIMITIVA.getResultado()));
        System.out.println("Aciertos en la simulación:");
        System.out.println("3 aciertos: " + aciertos3);
        System.out.println("4 aciertos: " + aciertos4);
        System.out.println("5 aciertos: " + aciertos5);
        System.out.println("6 aciertos: " + aciertos6);
        System.out.println("=====================================");
        System.out.println("Aciertos del boleto fijo:");
        System.out.println("NUMERO PREMIADO: " + Arrays.toString(PRIMITIVA.getResultado()));
        System.out.println("NUMERO JUGADO  : " + Arrays.toString(boleto1));
        System.out.println("Aciertos       : " + PRIMITIVA.CantidadAciertos(boleto1));
        System.out.println("=====================================");
        System.out.println("BOLETO GANADOR");
        System.out.println("=====================================");
        System.out.println("Boletos jugados hasta ganar: " + boletos);
    }

    public static class Loteria {

        private int[] resultado = new int[6];

        public Loteria() {
            this.resultado = GenerarBoleto(); // Genera un boleto premiado al iniciar
        }

        public int[] getResultado() {
            return resultado;
        }

        public int CantidadAciertos(int[] boletoUsuario) {
            int aciertos = 0;
            for (int numero : boletoUsuario) {
                for (int premiado : resultado) {
                    if (numero == premiado) {
                        aciertos++;
                        break; // Evita contar un mismo número varias veces
                    }
                }
            }
            return aciertos;
        }

        public int[] GenerarBoleto() {
            Random aleatorio = new Random();
            int[] boleto = new int[6];
            int i = 0;
            while (i < 6) {
                int numero = aleatorio.nextInt(49) + 1; // Números entre 1 y 49
                if (!contiene(boleto, numero)) {
                    boleto[i] = numero;
                    i++;
                }
            }
            Arrays.sort(boleto); // Ordenar para facilitar comparación y visualización
            return boleto;
        }

        private boolean contiene(int[] array, int numero) {
            for (int n : array) {
                if (n == numero) {
                    return true;
                }
            }
            return false;
        }
    }
}
