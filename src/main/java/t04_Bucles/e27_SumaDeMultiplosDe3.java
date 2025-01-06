package t04_Bucles;
public class e27_SumaDeMultiplosDe3 {
    /* La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres.
    Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000
    números enteros positivos. */
    public static void main(String[] args) {   
     boolean seCumple = true;
        for(int i=18;i<10000;i++) {
        //verifica si es multiplo de 3 
            if(i%3==0){
                int numero = i;
                int sumaDigitos = 0;
                while(numero>0) {
                sumaDigitos+=numero%10;
                numero/=10;
                }
                if(sumaDigitos%3 !=0){
                    System.out.println("La afirmación es incorrecta. El número " + i + 
                                       " es múltiplo de 3, pero la suma de sus dígitos (" + 
                                       sumaDigitos + ") no es múltiplo de 3.");
                    seCumple=false;
                    break;
               }
            }        
        }
        //La condicion siempre se cumple
        if(seCumple){
        System.out.println("La afirmacion es correcta para los 10000 numero positivos."); 
        }
        /*nunca encontrarás un número múltiplo de tres cuya suma de dígitos no sea múltiplo 
        de tres. Por lo tanto, el programa que escribiste siempre debería confirmar que la 
        afirmación es correcta para cualquier rango de números enteros. */
    }
}

        
                
       
  

