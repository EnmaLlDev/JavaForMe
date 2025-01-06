package t20_MasterMind;
import java.util.Scanner;
/* Proyecto:
    Sobre el proyecto del tema anterior, añadir las siguientes funcionalidades:
    - La petición de intento para el jugador se convierte ahora en un bucle, para tener 5 intentos para
    adivinarlo. El programa finalizará o bien si acierta o bien si se le acaban los intentos. Se informará al
    usuario de dicha situación: “Enhorabuena, lo has adivinado” o por el contrario “Lo sentimos, te has
    quedado sin intentos”.
    - En caso que un intento sea erróneo (bien por cantidad de dígitos, bien por repetidos), ese intento
    no se contará de cara al límite de intentos.
    - En la siguiente figura se muestra la apariencia que debe tener el programa:
*/
public class ELLt03MasterMind3 {
   public static void main(String[] args) {
        final int numeroAdivinar;    
        int numeroUsuario=0;
        int centenasUser,decenasUser,unidadesUser;
        int centenasNumber, decenasNumber, unidadesNumber;
        //contadores
        int bienColocados=0, malColocados=0;
        int intentos=5;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bienvenido a MASTERMIND!");
        System.out.println("Game:Introduce un numero a adivinar, comprendido entre 100 y 999");
        numeroAdivinar=scanner.nextInt();
            centenasNumber = numeroAdivinar/100; 
            decenasNumber = (numeroAdivinar/10)%10; 
            unidadesNumber = numeroAdivinar%10;
        while(intentos>0){
        intentos--;
            if(numeroAdivinar>100&&numeroAdivinar<900){
                System.out.println("Numero guardado!"); 
                System.out.println("Jugador: intenta adivinar, introduce un numero de 3 digitos");
                numeroUsuario = scanner.nextInt(); 
                //inicializacion de las variables
                centenasUser = numeroUsuario/100; 
                decenasUser = (numeroUsuario/10)%10; 
                unidadesUser = numeroUsuario%10;  
                if((numeroUsuario/100 !=0)&&((numeroUsuario/10)%10 !=0)&&(numeroUsuario%10!=0)){
                }else{ System.out.println("Este numero no tiene 3 digitos.");
                    continue;}
                    if ((numeroUsuario==numeroAdivinar)) {                            
                        System.out.println("Has acertado, Enhorabuena!"
                        + "\nNumero introducido: "+numeroUsuario
                        + "\nNumero a adivinar: "+numeroAdivinar);
                        break;
                    }else{
                            //compara valores introducidos
                            if(centenasUser==centenasNumber){bienColocados++;}
                                else{malColocados++;}
                            if(decenasUser==decenasNumber){bienColocados++;}
                                else{malColocados++;}
                            if(unidadesUser==unidadesNumber){bienColocados++;}
                                else{malColocados++;}   
                            System.out.println("Has fallado, intenta de nuevo!\n\n\n\n\n\n");}
                } else{System.out.println("Intenta de nuevo, numero es INVALIDO!");}
                        
                System.out.println("E1 numero ingresado por el jugador fue: " +numeroUsuario+
                                        "\nIntento: ("+ intentos +") \nEstos fueron tus resultados:"+
                                        "\nDigitos BIEN colocados:"+bienColocados+"\nDigitos MAL colocados:"+malColocados);
        }
        if(intentos==0)System.out.println("Lo sentimos, te has quedado sin intentos");     
    }    
}
