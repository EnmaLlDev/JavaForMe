
package t03_Manejo_If_Else;import java.util.Scanner;

public class e09b_BusesDisponibles_SwtichConString {
    /*Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la
    semana hay salida de bus (utilizar la tabla anterior).
    
    USANDO STRING*/
    
    public static void main(String[] args) {
       Scanner scanner =new Scanner (System.in);
       
        System.out.println("Ingresa un dia en formato (lunes, martes...) ");
        String diasUser=scanner.nextLine().trim().toLowerCase(); //arreglos a clase String
        
        System.out.println("Ingresa el horario en que desea viajar:");
        int horaUser=scanner.nextInt();
       
        boolean disponible = false;
        int contExcepciones=0; //escala de excepciones 1,2,3 
        if((horaUser>0&&horaUser<24))
        {
           switch(diasUser){
               case "lunes","martes","miercoles","viernes" -> { System.out.println("Salidas a la 9 y 14");
               }
               case "jueves" -> { System.out.println("Excepcion n~1");
               contExcepciones++;
               }
               case "sabado" -> { System.out.println("Excepcion n~2");
               contExcepciones+=2;
               }
               case "domingo" -> { System.out.println("Excepcion n~3");
               contExcepciones+=3;
               } 
               default -> {System.out.println("NO!");}
           }
        }
        
        if((contExcepciones==1)&&(disponible=true)){System.out.println("La primera excepcion contempla:"
                    + "Los dias JUEVES el horario sera TRES veces por dia: 9||12||14. ");} 
        if((contExcepciones==2)&&(disponible=true)){System.out.println("La segunda excepcion contempla:"
                    + "Los dias SABADO el horario sera UNICAMENTE a las 9. ");}
        if((contExcepciones==3)&&(disponible=true)){System.out.println("La tercera excepcion contempla:"
                    + "Los dias DOMINGO el horario sera CADA HORA.");}
       
    }
}
