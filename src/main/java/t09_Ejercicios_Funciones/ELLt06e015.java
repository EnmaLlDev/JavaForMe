package t09_Ejercicios_Funciones;

import java.util.Random;

public class ELLt06e015 {

    /*6.15. Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas tiene
    cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. 
    Cada pregunta correcta suma 0.5 puntos 
    y cada una incorrecta resta 0.2 puntos, 
    no pudiendo llevar un alumno ninguna nota inferior a cero. 
    Desarrolla una clase llamada Examen que almacene las respuestas correctas de las 20
    preguntas. La clase debe disponer de algún mecanismo mediante el que se le pase las respuestas de
    un alumno para las 20 preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la
    puntuación en el examen. 
    
    Hacer un programa que permita primero informar de las respuestas
    correctas a un examen y después introducir las respuestas de los alumnos, mostrándonos la nota
    obtenida por los mismos.*/
    public static void main(String[] args) {
        double notaAcumulada = 0;
        boolean aprobado = false;
        Alumno Alba = new Alumno("Alba Salas", "3293287A", "DAM");
        Examen PrimerParcial = new Examen(20, "Programacion");

        PrimerParcial.generarRepuestasCorrectas();
        System.out.println(Alba.toString());
        Alba.generarRespuestasAlumno();

        System.out.println("Parcial con: " + PrimerParcial.getCantPreguntas() + " preguntas tipo test.");

        if (PrimerParcial.getRespuestasCorrectas().equalsIgnoreCase(Alba.getRespuestasAlumno())) {
            System.out.println("Todas las respuestas son correctas!");
            aprobado = true;
        } else {
            aprobado = false;
            String cadenaAlumno = Alba.getRespuestasAlumno();
            String cadena = PrimerParcial.getRespuestasCorrectas();
            String acumuladorRepuestas = "";

            System.out.println("\nResultados del examen\n(valores aletorios)");

            for (int i = 0; i < 20; i++) { // base 0 iteracion hasta el 19
                if (cadena.charAt(i) == cadenaAlumno.charAt(i)) {
                    System.out.println(i);
                    notaAcumulada += 0.5;
                } else {
                    System.out.println("(x)" + i);
                    notaAcumulada -= 0.2;
                }
            }
            if(notaAcumulada<0){ 
                notaAcumulada=0;
                System.out.println("El resultado es el minimo legal:"+notaAcumulada);
            }
            else{
                    if(notaAcumulada>0&&notaAcumulada<=5){
                        System.out.println("Reprobado");
                    }
                    
                    else if(notaAcumulada==5){
                        System.out.println("Aprobado");
                        aprobado=true;
                    }
                    else if(notaAcumulada>5&&notaAcumulada<=10){
                        System.out.println("Sobresaliente");
                        aprobado=true;
                    }
                System.out.println(Alba.getNombre()+ " su nota final:"+ notaAcumulada);}
        }
        
    }

    public static class Examen {

        private int cantPreguntas;
        private String asignatura;
        private String opcionesTest;
        private String respuestasTest;

        public Examen() {
            this.opcionesTest = opcionesTest = "abcdef";
            this.respuestasTest = respuestasTest = "";
        }

        public Examen(int cantPreguntas, String asignatura) {
            this.cantPreguntas = cantPreguntas;
            this.asignatura = asignatura;
            this.opcionesTest = "abcdef";
            this.respuestasTest = respuestasTest = "";
        }

        public int getCantPreguntas() {
            return cantPreguntas;
        }

        public String getRespuestasCorrectas() {
            return respuestasTest;
        }

        public void generarRepuestasCorrectas() {
            int respuestaCorrecta;
            Random random = new Random();
            //Examen examen = new Examen();
            //examen.getCantPreguntas()
            respuestasTest = "";
            for (int i = 0; i < cantPreguntas; i++) {
                respuestaCorrecta = random.nextInt(1, 5);
                String correcta = "";

                switch (respuestaCorrecta) {
                    case 1 -> {
                        correcta = "a";
                    }
                    case 2 -> {
                        correcta = "b";
                    }
                    case 3 -> {
                        correcta = "c";
                    }
                    case 4 -> {
                        correcta = "d";
                    }
                }
                respuestasTest += correcta;
            }
        }

    }

    public static class Profesor {

        private String nombre;
        private String poderacion;

        public Profesor() {
        }

        public Profesor(String nombre, String poderacion) {
            this.nombre = nombre;
            this.poderacion = poderacion;
        }

        public String getPoderacion() {
            return poderacion;
        }

        public void setPoderacion(String poderacion) {
            this.poderacion = poderacion;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static class Alumno {

        private String nombre;
        private String DNI;
        private double nota;
        private String curso;
        private int repuestaPregunta;
        private String respuestasExamen;

        public Alumno() {
            this.respuestasExamen = "";
        }

        public Alumno(String nombre, String DNI, String curso) {
            this.nombre = nombre;
            this.DNI = DNI;
            this.curso = curso;
            this.respuestasExamen = "";
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRespuestasAlumno() {
            return respuestasExamen;
        }

        public void generarRespuestasAlumno() {
            repuestaPregunta = 0;
            respuestasExamen = "";
            Random random = new Random();

            for (int i = 0; i < 20; i++) {
                repuestaPregunta = random.nextInt(1, 5);
                String respuesta = "";
                switch (repuestaPregunta) {
                    case 1 -> {
                        respuesta = "a";
                    }
                    case 2 -> {
                        respuesta = "b";
                    }
                    case 3 -> {
                        respuesta = "c";
                    }
                    case 4 -> {
                        respuesta = "d";
                    }
                }
                respuestasExamen += respuesta;
            }
        }

        public void setNota(double nota) {
            if (nota < 0) {
                throw new IllegalArgumentException("La nota no puede ser negativa.");
            }
            if (nota > 10) {
                throw new IllegalArgumentException("La nota no puede ser mayor a 10.");
            }
            this.nota = nota;
        }

        public double getNota() {
            return nota;
        }

        @Override
        public String toString() {
            return "Los datos del alumno son:\n"
                    + "Nombre: " + nombre + "\n"
                    + "Curso: " + curso + "\n"
                    + "Nota: " + nota;
        }
    }
}
