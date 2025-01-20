package t11_Arrays;

public class e03_ArrayObjetos_Comparacion {

    public static void main(String[] args) {

        Persona[] arrayPersonas = new Persona[4];
        arrayPersonas[0]=new Persona("Pancracio", 20);
        arrayPersonas[1]=new Persona("Luis",29);
        arrayPersonas[2]=new Persona("Carlos",30);
        arrayPersonas[3]=new Persona("Ramon",18);
        
        Persona joven = arrayPersonas[0];//refencia a un objeto persona del array
        for(Persona elemento : arrayPersonas){
            if(elemento.edad < joven.edad){
                joven=elemento;
            }    
        }
        System.out.println("La persona mas joven es " + joven);
    }

    public static class Persona {

        public String nombre;
        public int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "nombre = " + nombre + ",{edad = " + edad + '}';
        }
    }

}
