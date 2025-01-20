package t11_Arrays;
public class e_02_Encontrar_ValorMax {
    public static void main(String[] args) {
         int[] arreglo_Enteros = {1,2,3,4,5,6};
         int valorMax=0;
        
         //Recorrido FOR 
         for (int i=0;i<arreglo_Enteros.length;i++){
             valorMax=arreglo_Enteros[0];
             System.out.println("Numero: "+i);
             
             if(valorMax<arreglo_Enteros[i]){
                 valorMax=arreglo_Enteros[i];
             }
         }
         System.out.println("El resultado de la suma es: "+ valorMax);  
    }
}
