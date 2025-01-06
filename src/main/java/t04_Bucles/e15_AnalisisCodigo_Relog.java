package t04_Bucles;
public class e15_AnalisisCodigo_Relog {
    /* Sin ejecutarlo, intenta explicar que hace este programa.  */
    public static void main(String[] args) {
        int hora=0;
            /*Es un programa donde se declara una variable "hora=0" 
            Se establece un bulce for iniciado en 1 determinado por (7*24) o 168
            (este valor esta determinado por el contexto que aporta la variable
            anterior, por ende puedo presumir que se trata de las 24 horas de una
            semana) y se incrementa en 1 cada iteracion e imprime el valor
            almacenado en "hora", que entiendo se usa para hacer seguimiento de
            cada vulta del bucle.*/    
            for (int i=1;i<=7*24;i++) {
            System.out.println (hora);
                /*Dentro de este bucle esta un condicional if que incrementa el valor 
                de hora en 1 y mientras esta no sea mayor a 23 el condicional no se
                activara, en caso contrario la variable "hora" cambiara su valor
                a 0 y el bulce for se repetira nuevamente hasta agotar las 168
                repeciones previstas.*/    
                if (++hora > 23) 
                    hora=0;
                }        
        /*En definitiva este programa pretende emular la funcionalidad de un relog,
        en relacion a las horas y los minutos.*/

    } //fin main
} //fin clase

          
       
  
