
package t20_MasterMind;
import java.util.Scanner;
public class ELLt02MasterMind2 {
        /*Sobre el proyecto del tema anterior, añadir las siguientes funcionalidades
        1.- Verificar que él número introducido está comprendido entre 100 y 999 y que no tiene dígitos
        repetidos. Si no se cumple eso, se informará por pantalla del error y terminará el programa.
        2.- En caso contrario, se hará desaparecer el número de la pantalla - por ejemplo, con: System.out.print
        (“\n\n\n\n\n\n”); - y el jugador introducirá un número para intentar adivinar el número introducido
        previamente.
        3.- Sobre este intento, se hará la misma verificación que sobre el número a adivinar, esto es,
        comprendido entre 100 y 999 y que no tiene dígitos repetidos. En caso de que no se cumpla, también
        terminará el programa informando del error.
        4.- En caso contrario, se informará de cuantos dígitos del intento coinciden en la misma posición que
        en el número a adivinar y cuantos dígitos coinciden, pero en posiciones equivocadas. La siguiente
        figura muestra un ejemplo: */
        public static void main(String[] args) {
            
        final int numeroAdivinar;    
        int numeroUsuario;
        int centenasUser,decenasUser,unidadesUser;
        int centenasNumber, decenasNumber, unidadesNumber;
        //contadores
        int bienColocados=0, malColocados=0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido a MASTERMIND!");
        System.out.println("Introduce un numero a adivinar, comprendido entre 100 y 999");
        numeroAdivinar=scanner.nextInt();
            centenasNumber = numeroAdivinar/100; 
            decenasNumber = (numeroAdivinar/10)%10; 
            unidadesNumber = numeroAdivinar%10;
        if(numeroAdivinar>100&&numeroAdivinar<900){
            System.out.println("Numero guardado!"); 
            System.out.println("Jugador: intenta adivinar, introduce un numero de 3 digitos");
            numeroUsuario = scanner.nextInt();   
            if (numeroUsuario<100 || numeroUsuario>999) { System.out.print("Intenta de nuevo!\n\n\n\n\n\n");
            }else{
            centenasUser = numeroUsuario/100; 
            decenasUser = (numeroUsuario/10)%10; 
            unidadesUser = numeroUsuario%10;    
            
            //algoritmo a partir de tablas de verdad
            //Validacion sobre numero de usuario
            if (centenasUser==decenasUser){System.out.println("Intenta de nuevo!\n\n\n\n\n\n");
            }else if(centenasUser==unidadesUser){System.out.println("Intenta de nuevo!\n\n\n\n\n\n");
            }else if(decenasUser==unidadesUser){System.out.println("Intenta de nuevo!\n\n\n\n\n\n");}
            else System.out.println("Numero valido!");

            //primer intento:
            if(numeroUsuario==numeroAdivinar){
                System.out.println("Has acertado, Enhorabuena!");  
            }else{System.out.println("Has fallado!");
        
                if(centenasUser==centenasNumber){bienColocados++;}else{malColocados++;}
                if(decenasUser==decenasNumber){bienColocados++;}else{malColocados++;}
                if(unidadesUser==unidadesNumber){bienColocados++;}else{malColocados++;}   
                System.out.println("E1 numero ingresado por el jugador fue: " + numeroUsuario+ " Numero por adivinar: " +numeroAdivinar+
                            "\nEn este intento estos fueron tus resultados:"+
                            "\nContador de digitos:\nDigitos BIEN colocados:"+bienColocados+"\nDigitos MAL colocados:"+malColocados);
                }
            }
        }else{System.out.println("Intenta de nuevo, ese numero es INVALIDO!"); }
    }
}