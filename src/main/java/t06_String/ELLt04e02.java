
package t06_String;
import java.util.Scanner;
public class ELLt04e02 {
    /* 4.2. Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en
            dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
            según la siguiente tabla. Almacena las letras del NIF en una cadena.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce los digitos de tu DNI(sin letra):");
        String cadenaDNI = scanner.nextLine();
        int longitud = cadenaDNI.length();
        
        //Validacion sobre los digitos
        boolean validacionDigitos=true;
        for(int i=0; i<cadenaDNI.length();i++){
            if(!Character.isDigit(cadenaDNI.charAt(i))){
                validacionDigitos=false;
                break;
            }
        }
        
        if(cadenaDNI.length()==8){
            
            String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
            int numerosDNI= Integer.parseInt(cadenaDNI); 
            int resto = numerosDNI%23;
            
            char letra = letrasDNI.charAt(resto);
            String dniCompleto = (String.valueOf(numerosDNI))+(String.valueOf(letra));
            String otraForma = cadenaDNI+letra;
            System.out.println("Tu numero DNI completo es:"+dniCompleto+
                    "\nMismo resultado, otro formato: "+otraForma);
        }else {
            System.out.println("Longitud incorrecta!");
        }
    }
}
