package t12_Ejercicios_Arrays;

public class Agenda_array {

    private Persona[] Contacto;

    public Agenda_array() {
        this.Contacto = new Persona[5];
        Contacto[0] = new Persona(1, "Marta", "666111222");
        Contacto[1] = new Persona(2, "Miguel", "981981981");
        Contacto[2] = new Persona(3, "Ana", "900900900");
        Contacto[3] = new Persona(4, "Daniel", "348810000");
    }

    public String MostrarNombre(String nombreBuscado) {
        for (int i = 0; i < Contacto.length; i++) {
            if (Contacto[i] != null && Contacto[i].getNombre().equals(nombreBuscado)) {
                return "Número encontrado: " + Contacto[i].getTelefono();
            }
        }
        return "Número no encontrado.";
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder("Agenda: {");
        for (Persona p : Contacto) {
            if (p != null) {
                resultado.append("\n  ").append(p.toString());
            }
        }
        resultado.append("\n}");
        return resultado.toString();
    }

    public Persona[] getContacto() {
        return Contacto;
    }

    public void Agregar_Contacto(Persona NuevoContacto) {
        for (int i = 0; i < this.Contacto.length; i++) {
            if (this.Contacto[i] != null && this.Contacto[i].getId() == NuevoContacto.getId()) {
                System.out.println("Contacto ya existente!");
                return; // Salir del método si el contacto ya existe
            }
        }

        for (int i = 0; i < this.Contacto.length; i++) {
            if (this.Contacto[i] == null) { // Buscar el primer espacio vacío
                this.Contacto[i] = NuevoContacto;
                System.out.println("Contacto agregado!");
                return;
            }
        }

        System.out.println("Agenda llena. No se pudo agregar el contacto.");
    }
}
