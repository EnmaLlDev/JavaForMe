package t04_Bucles;
public class e26b_Pintar9Lineas2 {
    /* Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos:
        a.) b.) c.) d.)
        0000000000 1 1111111111 9
        1111111111 22 222222222 98
        2222222222 333 33333333 987
        3333333333 4444 4444444 9876
        ........ ...... ....... .......
        Cada apartado se resuelve con un for dentro de otro for. */
    
    public static void main(String[] args) {
        
        System.out.println("b. Bucle for: Secuencia con incremento de longitud");
        for(int i=1; i<=9; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            } 
            System.out.println();
        }
        /* Imprime el número "i" las veces que indica "i" por linea, es decir,
        cada número i tantas veces como su valor, creando un patrón que aumenta 
        de longitud..*/ 
    }
}

        
                
       
  

