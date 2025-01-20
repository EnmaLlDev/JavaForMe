package t11_Arrays;
public class e_04_Orden_Ascendente_Descendente {
    public static void main(String[] args) {
        int [] miArray=new int[]{1,20,33,41,15,61,70,8,190,10};
        int anterior;

        
        int posMin;
        for (int i = 0; i < miArray.length - 1; i++) {
        
        //busqueda del menor
            posMin = i;
            for (int j = i + 1; j < miArray.length; j++) {
                if (miArray[j] < miArray[posMin]) {
                    posMin = j;
                }
            }
            
        //intercambio del actual i con el menor
           int aux = miArray[i];
            miArray[i] = miArray[posMin];
             miArray[posMin] = aux;
        }
        System.out.println("-----------------------------");
        System.out.println("Orden ascendente");
        System.out.println("-----------------------------");
        //Mostrar resultado
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("Orden decendente");
        System.out.println("-----------------------------");
        //Al reves
        for(int i=miArray.length-1;i>=0;i--){
            System.out.println(miArray[i]);
        }
    }
}