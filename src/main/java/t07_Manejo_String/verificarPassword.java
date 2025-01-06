package t07_Manejo_String;

import java.util.Scanner;

public class verificarPassword {

    /*5. Escribe un programa que verifique si una contraseña es segura o no. Consideramos una
    contraseña segura cuando tiene, al menos:
    - 8 caracteres
    - una mayúscula
    - una minúscula
    - un número
    - un carácter especial (signo de puntuación, etc …)
    En el caso de que no sea así, si no alcanza la longitud mínima, se informará con un mensaje.
    Si supera la longitud mínima pero no cumple alguna de las otras condiciones, se informará de que
    condición no cumple.*/
    public class PasswordSegura {

        public static void main(String[] args) {
            int longitudMin = 8, mayusculas = 0, minusculas = 0;
            int especial = 0, numero = 0;
            int total = 0; // numero de letras de la contraseÃ±a
            char ch;
            Scanner s = new Scanner(System.in);

            System.out.println("Normas para la creaciÃ³n de una contraseÃ±a");
            System.out.println("1. Debe tener al menos 8 caracteres.");
            System.out.println("2. Debe tener al menos una mayÃºscula.");
            System.out.println("3. Debe tener al menos una minÃºscula.");
            System.out.println("4. Debe tener al menos un dÃ­gito (0-9)");
            System.out.println("5. Debe tener al menos un caracter especial.");

            System.out.print("ContraseÃ±a elegida: ");
            String password = s.nextLine();

            total = password.length();
            if (total >= longitudMin) {
                System.out.println("La contraseÃ±a debe tener al menos 8 caracteres.");
                return;
            } else {
                for (int i = 0; i < total; i++) {
                    ch = password.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        mayusculas++;
                    } else if (Character.isLowerCase(ch)) {
                        minusculas++;
                    } else if (Character.isDigit(ch)) {
                        numero++;
                    } else {
                        especial++;
                    }
                }
            }
            if (mayusculas != 0 && minusculas != 0 && numero != 0 && especial != 0) {
                System.out.println("ContraseÃ±a vÃ¡lida");
            } else {
                System.out.print("La contraseÃ±a debe contener al menos contener ");
                if (mayusculas == 0) {
                    System.out.println("una mayÃºscula");
                }
                if (minusculas == 0) {
                    System.out.println("una minÃºscula");
                }
                if (numero == 0) {
                    System.out.println("un nÃºmero");
                }
                if (especial == 0) {
                    System.out.println("un carÃ¡cter especial");
                }
            }
        }

    }

}
