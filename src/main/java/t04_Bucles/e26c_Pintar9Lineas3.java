package t04_Bucles;
public class e26c_Pintar9Lineas3 {
    /* Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
        a.) b.) c.) d.)
        0000000000 1 1111111111 9
        1111111111 22 222222222 98
        2222222222 333 33333333 987
        3333333333 4444 4444444 9876
        ........ ...... ....... .......
        Cada apartado se resuelve con un for dentro de otro for. */
    
    public static void main(String[] args) {
        
        System.out.println("c. Bucle for: Secuencia con decremento de longitud");
        for(int i=1; i<=9; i++){
            for(int j=0; j<10-i; j++){
                System.out.print(i);
            } 
            System.out.println();
        }
        /* Imprime el número "i" 10 veces por linea y se resta el valor de -i en la 
        siguiente vuelta, cada número i pero con longitud decreciente de 10 - i, 
        creando una pirámide invertida. */ 

    }
}

        
                
       
  

