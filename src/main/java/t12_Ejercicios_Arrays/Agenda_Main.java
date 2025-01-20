package t12_Ejercicios_Arrays;

import java.util.Scanner;

public class Agenda_Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Crear la agenda
        Agenda_array Lista = new Agenda_array();

        // Solicitar al usuario el nombre a buscar
        System.out.println("Dime un nombre:");
        String nombreBuscado = scanner.nextLine();

        // Mostrar el resultado de la búsqueda
        System.out.println("Buscando...");
        String resultado = Lista.MostrarNombre(nombreBuscado);
        System.out.println(resultado);
    }
}
