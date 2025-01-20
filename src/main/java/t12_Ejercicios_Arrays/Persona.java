
package t12_Ejercicios_Arrays;

class Persona {
    private int id;
    private String nombre;
    private String telefono; // Cambiar de int a String para mayor flexibilidad

    // Constructor
    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) { // Validación básica
            this.id = id;
        } else {
            System.out.println("El ID debe ser un número positivo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) { // Validación básica
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\+?\\d{7,15}")) { // Validación para un teléfono
            this.telefono = telefono;
        } else {
            System.out.println("El número de teléfono no es válido.");
        }
    }

    // Método toString para mostrar información de forma legible
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
