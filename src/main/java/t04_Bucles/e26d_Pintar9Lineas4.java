package t04_Bucles;
public class e26d_Pintar9Lineas4 {
    /* Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
        a.) b.) c.) d.)
        0000000000 1 1111111111 9
        1111111111 22 222222222 98
        2222222222 333 33333333 987
        3333333333 4444 4444444 9876
        ........ ...... ....... .......
        Cada apartado se resuelve con un for dentro de otro for. */
    
    public static void main(String[] args) {
        
        System.out.println("d. Bucle for: Secuencia de decremento inverso");
        for(int i=1; i<=9; i++){
            for(int j=0; j<10-i; j++){
                System.out.print(i);
            } 
            System.out.println();
        }
        /* Imprime números en orden descendente desde 9 hasta el valor mínimo, 
        aumentando la longitud de cada línea hasta 9 caracteres */ 

    }
}

        
                
       
  

