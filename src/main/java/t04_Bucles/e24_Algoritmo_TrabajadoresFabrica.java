package t04_Bucles;

import java.util.Scanner;

public class e24_Algoritmo_TrabajadoresFabrica {
    /*Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores
    de una fábrica. 
    El programa debe obligar a que las edades que se introduzcan estén comprendidas entre 16 y 70 años. 
    El programa nos mostrará la edad y el sexo del más joven y también mostrará la media de edad de las mujeres. 
    Finalmente nos informará si hay alguno con más de 60 años. Si se introduce cero como edad el programa 
    terminará en ese momento sin esperar a que introduzcan los 30 trabajadores.
    Usar tipo char para almacenar sexo.  */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMujeres = 0, sumaEdadMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;
        char sexoMasJoven = ' ';
        boolean hayMayorDe60 = false;

            for(int i=1; i<=30; i++){
                System.out.println("Introduce el sexo del trabajador: (H || M)");    
                char sexo = scanner.next().toUpperCase().charAt(0);
                
                if((sexo!='H')&&(sexo!='M')){
                    System.out.println("Sexo invalido. Por favor, introduce los caracteres correctos.");
                    i--;
                    continue;
                 }
                System.out.print("Introduzca la edad del trabajador (en el rango de 16 y 70) o introduce (0) para salir: ");
            int edad = scanner.nextInt();

            if (edad == 0) {
                System.out.println("Finalizando programa...");
                break; // Terminar el programa
            }

            if (edad < 16 || edad > 70) {
                System.out.println("Edad inválida. Debe estar entre 16 y 70 años.");
                i--; // Volver a pedir los datos del trabajador actual
                continue;
            }

            // Comprobar si es el más joven
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
                sexoMasJoven = sexo;
            }

            // Contar mujeres y acumular edades para calcular la media
            if (sexo == 'M') {
                contadorMujeres++;
                sumaEdadMujeres += edad;
            }

            // Comprobar si hay algún trabajador mayor de 60 años
            if (edad > 60) {
                hayMayorDe60 = true;
            }
        }

        // Mostrar resultados
        if (edadMasJoven != Integer.MAX_VALUE) {
            System.out.println("El trabajador más joven tiene " + edadMasJoven + " años y es de sexo " + sexoMasJoven);
        }

        if (contadorMujeres > 0) {
            double mediaEdadMujeres = (double) sumaEdadMujeres / contadorMujeres;
            System.out.println("La media de edad de las mujeres es: " + mediaEdadMujeres);
        } else {
            System.out.println("No se ingresaron datos de mujeres.");
        }

        if (hayMayorDe60) {
            System.out.println("Hay al menos un trabajador con más de 60 años.");
        } else {
            System.out.println("No hay ningún trabajador con más de 60 años.");
        }

        scanner.close();
    }
}

        
                
       
  

