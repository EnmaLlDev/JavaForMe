package t04_Bucles;
public class e01_ContadorHasta10 {
    /* Mostrar por pantalla la frase “esto es un bucle” 10 veces. */
    public static void main(String[] args) {
        //Agrego un contador para las repeticiones
        int contador=0;
        for(int i=0;i<=10;i++){
            contador+=1;
            System.out.println("Nro:"+i+ "-> esto es un bucle.");  
        }
        
        System.out.println("fin del bucle --> Contador:" + contador + " repeticiones.");
    }
}
