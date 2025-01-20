package t12_Ejercicios_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CarritoCompra_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoCompra carrito = new CarritoCompra();
        int opcion;

        do {
            System.out.println("\nMenú del Carrito de la Compra");
            System.out.println("1. Mostrar estado del carrito");
            System.out.println("2. Añadir producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    carrito.mostrarEstadoCarrito();
                    break;

                case 2:
                    System.out.print("Ingrese el código del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese el precio unitario: ");
                    double precioUnitario = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    carrito.anadirProducto(codigo, descripcion, precioUnitario, cantidad);
                    break;

                case 3:
                    System.out.println("Gracias por usar el carrito de la compra. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}

class Producto {

    private String codigo;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;

    public Producto(String codigo, String descripcion, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return "Producto{"
                + "codigo='" + codigo + '\''
                + ", descripcion='" + descripcion + '\''
                + ", precioUnitario=" + precioUnitario
                + ", cantidad=" + cantidad
                + ", precioTotal=" + getPrecioTotal()
                + '}';
    }
}

class CarritoCompra {

    private ArrayList<Producto> productos;
    private double importeTotal;

    public CarritoCompra() {
        productos = new ArrayList<>();
        importeTotal = 0.0;
    }

    public void mostrarEstadoCarrito() {
        System.out.println("Estado actual del carrito:");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
            System.out.println("Importe total de la compra: " + importeTotal);
        }
    }

    public void anadirProducto(String codigo, String descripcion, double precioUnitario, int cantidad) {
        if (productos.size() >= 100) {
            System.out.println("No se pueden añadir más de 100 productos diferentes.");
            return;
        }
        Producto producto = new Producto(codigo, descripcion, precioUnitario, cantidad);
        productos.add(producto);
        actualizarImporteTotal();
        System.out.println("Producto añadido con éxito.");
    }

    private void actualizarImporteTotal() {
        importeTotal = 0.0;
        for (Producto producto : productos) {
            importeTotal += producto.getPrecioTotal();
        }
    }
}

