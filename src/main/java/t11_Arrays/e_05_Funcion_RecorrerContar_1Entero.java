package t11_Arrays;

public class e_05_Funcion_RecorrerContar_1Entero {

    public static void main(String[] args) {
        int[] miArray = new int[]{1, 20, 33, 41, 15, 61, 70, 8, 190, 10}; 
        NumeroRepetido(miArray, 33);
    }
     
    public static void NumeroRepetido(int[] miArray, int num){
        for(int i=0;i<miArray.length;i++){
            if(miArray[i]==num)System.out.println("Numero encontrado, en la posciion: " +i+ " del ARRAY.");
            else{System.out.println("No encontrado.");}
        }
    }
}
