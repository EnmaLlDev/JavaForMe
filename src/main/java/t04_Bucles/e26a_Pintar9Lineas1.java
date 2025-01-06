package t04_Bucles;
public class e26a_Pintar9Lineas1 {
    /* Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
        a.) b.) c.) d.)
        0000000000 1 1111111111 9
        1111111111 22 222222222 98
        2222222222 333 33333333 987
        3333333333 4444 4444444 9876
        ........ ...... ....... .......
        Cada apartado se resuelve con un for dentro de otro for. */
    
    public static void main(String[] args) {
        
        System.out.println("a. Bucle for: Secuencia de números repetidos");
        for(int i=0; i<9; i++){
            for(int j=0; j<10; j++){
                System.out.print(i);
            } 
            System.out.println();
        }
        /* Imprime el número "i" repetido 10 veces por linea y hace un salto 
        de linea en cada vuelta. Bucle anidado para imprimir cada número 
        de 0 a 8 repetido 10 veces en cada línea.*/ 
    }
}

        
                
       
  

