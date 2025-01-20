package t11_Arrays;

import java.util.Scanner;

public class e01_ValoresEnterosArray {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] ArrayPosiciones = new int [10];
        int acumuladorFOR=0;
        int acumuladorFOREACH=0;
        
        //version FOR
        for(int i=0; i<ArrayPosiciones.length;i++){
            System.out.println("Dime un numero:");
            ArrayPosiciones[i]=scanner.nextInt();
            acumuladorFOR+=ArrayPosiciones[i];
        }
        
        //vesion FOR EACH
        for(int i:ArrayPosiciones){
            acumuladorFOREACH+=ArrayPosiciones[i];
        }
    }
           
}
