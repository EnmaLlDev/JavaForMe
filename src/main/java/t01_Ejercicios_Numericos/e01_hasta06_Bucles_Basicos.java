
package t01_Ejercicios_Numericos;
public class e01_hasta06_Bucles_Basicos {
    /*
    1) Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
    2) Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
    3) Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
    4) Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
    5) Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle
    while.
    6) Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while
    */

    public static void main(String[] args) { 
       
        /*1
        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("Par:"+i);}
        }*/
        
        /*2
        int i=0;
        while(i<100){
            if(i%2==0){
                System.out.println("Par:"+i);}
            i++;
        }*/
        
        /*3
        int i=0;
        do{       
            if(i%2==0){
                System.out.println("Par:"+i);}
            i++;
        }while(i<100);*/
        
        /*4
        for(int i=320;i>=160;i-=20) {
             System.out.println(i);
         }  
        System.out.println("Fin del programa!");*/
        
        /*5
        int i=320;
        while(i>=160){
            System.out.println("Par:"+i);
            i-=20;}*/
        
        /*6
        int i=320;
        do{       
            System.out.println("Par:"+i);
            i-=20;
        }while(i>=160);*/
    }
}
