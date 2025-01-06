package t20_MasterMind;
import java.util.Scanner;
public class ELLt04MaterMind4 {
    
    /* Proyecto:
    Sobre el proyecto del tema anterior, añadir las siguientes funcionalidades:
    - Convertir tanto el número a adivinar como los intentos, a cadenas de caracteres. Seguimos con las
    mismas limitaciones, es decir, cada posición de la cadena debe de ser un dígito numérico y no puede
    haber repetidos.
    - La longitud del número a adivinar, y también de los intentos, pasan a ser de 4 dígitos, pero en el
    programa deben tratarse esos dos parámetros como variables. A esas variables se les asignan
    valores al comenzar el programa y que luego no se modifican. Así, si en un futuro quisiésemos
    cambiar esa longitud o el número de intentos, solo cambiando el valor asignado a esas variables en
    un único sitio del programa, todo seguiría funcionando sin más cambios.*/

        public static void main(String[] args) {
        // Variables configurables
        final int LONGITUD_NUMERO = 4;  // Longitud del número a adivinar (4 dígitos)
        final int NUMERO_INTENTOS = 5;  // Número de intentos disponibles
        String numeroAdivinar;
        String numeroUsuario;
        StringBuilder intentos = new StringBuilder();
        
        // Rellenar la cadena de intentos con los intentos disponibles
        for (int i = 0; i < NUMERO_INTENTOS; i++) {
            intentos.append("1");  // Utilizamos "1" solo como marcador de los intentos restantes
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a MASTERMIND!");
        System.out.println("Jugador: introduce un número a adivinar, comprendido entre 1000 y 9999");
        numeroAdivinar = scanner.nextLine(); // Leer el número a adivinar como String
        // Validar que el número a adivinar tiene la longitud correcta y contiene solo dígitos
        if (numeroAdivinar.length() != LONGITUD_NUMERO) {
            System.out.println("Número inválido. Debe ser un número de " + LONGITUD_NUMERO + " dígitos.");
            return;
        }
        for (int i = 0; i < numeroAdivinar.length(); i++) {
            if (!Character.isDigit(numeroAdivinar.charAt(i))) {
                System.out.println("Número inválido. El número debe contener solo dígitos.");
                return;
            }
        } 
        // Mientras haya intentos restantes
        while (intentos.length() > 0) {
            System.out.println("Intentos restantes: " + intentos.length());
            System.out.println("Jugador: intenta adivinar, introduce un número de " + LONGITUD_NUMERO + " dígitos");
            numeroUsuario = scanner.nextLine(); // Leer el intento del jugador 
            // Validar que el número introducido tiene la longitud correcta y contiene solo dígitos
            if (numeroUsuario.length() != LONGITUD_NUMERO) {
                System.out.println("Este número no tiene " + LONGITUD_NUMERO + " dígitos.");
                continue;
            }
            boolean valido = true;
            for (int i = 0; i < numeroUsuario.length(); i++) {
                if (!Character.isDigit(numeroUsuario.charAt(i))) {
                    valido = false;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Este número no es válido. Debe contener solo dígitos.");
                continue;
            }
            // Comparar los números
            int bienColocados = 0;
            int malColocados = 0;
            
            // Verificación de coincidencias
            for (int i = 0; i < LONGITUD_NUMERO; i++) {
                if (numeroUsuario.charAt(i) == numeroAdivinar.charAt(i)) {
                    bienColocados++;
                } else if (numeroAdivinar.indexOf(numeroUsuario.charAt(i)) != -1) {
                    malColocados++;
                }
            }
            // Si el número es correcto, el juego termina
            if (numeroUsuario.equals(numeroAdivinar)) {
                System.out.println("¡Has acertado, enhorabuena!");
                System.out.println("Número introducido: " + numeroUsuario);
                System.out.println("Número a adivinar: " + numeroAdivinar);
                break;
            } else {
                // Eliminar un intento
                intentos.deleteCharAt(intentos.length() - 1);
                
                System.out.println("Has fallado, intenta de nuevo.");
                System.out.println("Número ingresado por el jugador: " + numeroUsuario);
                System.out.println("Intentos restantes: (" + intentos.length() + ")");
                System.out.println("Dígitos BIEN colocados: " + bienColocados);
                System.out.println("Dígitos MAL colocados: " + malColocados);
            }
        }
        // Si se quedan sin intentos
        if (intentos.length() == 0) {
            System.out.println("Lo sentimos, te has quedado sin intentos.");
        }
    }
}