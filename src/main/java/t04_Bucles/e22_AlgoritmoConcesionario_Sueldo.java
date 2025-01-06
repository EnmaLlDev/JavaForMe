package t04_Bucles;
import java.util.Scanner;
public class e22_AlgoritmoConcesionario_Sueldo {
        /* Hacer un programa que permita calcular el sueldo final de los vendedores de un
        concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras
        realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a
        100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
        1000€ y si supera las 30 ventas  1300 €. 
        Después de tratar cada vendedor se preguntará al usuario y hay más vendedores a tratar, finalizando el
        programa si contesta negativamente. 
        Al final el programa mostrará el total de ventas y el salario final del que más ventas ha realizado 
        (supón que al menos introducen los datos de un empleado).
        En este tipo de ejercicios hay que distinguir el bucle (repito el proceso mientas…..)
        y luego las operaciones que hago con cada uno.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sueldo_base, calculo_sueldo_final;
        int cod_trabajador/*variable opcional*/,horas_extra, cantidad_ventas,plus_horas_extras;
        boolean ingreso_vendedores=true;
        int ventas_acumuladas=0;
        double salario_max=0;
        int max_ventas=0;
            do{
            System.out.print("Introduce el codigo del trabajador:");
                cod_trabajador = scanner.nextInt();
            System.out.print("Introduce el sueldo del trabajador:");
                sueldo_base = scanner.nextDouble();
            System.out.print("Introduce las horas extra del trabajador N:" + cod_trabajador+" - ");
                horas_extra = scanner.nextInt();
            System.out.print("Introduce la cantidad de ventas de este trabajador:");
                cantidad_ventas = scanner.nextInt();
                
                plus_horas_extras = 100*horas_extra;
                calculo_sueldo_final= sueldo_base+plus_horas_extras;
            
                if(cantidad_ventas>=10&&cantidad_ventas<=20){
                    System.out.print("Plus por ventas por concepto de 500 euros");
                    calculo_sueldo_final+=500;
                    }
                if(cantidad_ventas>20&&cantidad_ventas<=30){
                    System.out.print("Plus por ventas por concepto de 1.000 euros");
                    calculo_sueldo_final+=1000;
                    }
                if(cantidad_ventas>30){
                    System.out.print("Plus por ventas por concepto de 1.300 euros");
                    calculo_sueldo_final+=1300;
                    }
            ventas_acumuladas+=cantidad_ventas;
                
            System.out.println("\n-----------------------------------------------------------");  
            System.out.println("El trabajador N:"+cod_trabajador+" realizo:"+cantidad_ventas+" ventas"
                + "\nTrabajo un total de "+horas_extra+" horas extras le corresponden:"+plus_horas_extras+" euros."
                + "\nY su sueldo final seran: "+calculo_sueldo_final+" euros");
            System.out.println("-----------------------------------------------------------");
            
            /*Determino el mayor salario y cantidad de ventas*/
            if(cantidad_ventas>max_ventas){
                max_ventas=cantidad_ventas;
                salario_max=calculo_sueldo_final;
            }
            /*Solucion literal*/
            char respuesta;
            System.out.println("Vas a ingresar mas vendedores? (s/n):");
            respuesta=scanner.next().charAt(0);
            if(respuesta=='s'||respuesta=='S'){
                System.out.println("Continua ingresando empleados.");
            } else {
                System.out.println("Sales del programa"
                        + "\nResultados:\nTotal de ventas del concesionario:" + ventas_acumuladas
                        +"\nSalario del vendedor con más ventas: " + salario_max + " euros.");
                ingreso_vendedores=false;
            }
            /*Solucion con opcion multiple Switch*/
            /*
            System.out.println("Desea ingresar mas empleados, selecciona una opcion:"
                    + "\n(1) Continuar"
                    + "\n(2) Mostrar datos"
                    + "\n(3) Salir");
            int respuesta=scanner.nextInt();
            switch (respuesta){
                case 1-> {System.out.println("Cotinua el programa..."); }
                case 2-> {System.out.println("Resultados:"
                        +"\nTotal de ventas del concesionario:" + ventas_acumuladas
                        +"\nSalario del vendedor con más ventas: " + salario_max + " euros.");}
                case 3-> {System.out.println("Fin del programa");ingreso_vendedores=false;}
            }*/
            }while(ingreso_vendedores);
    }
}

        
                
       
  

