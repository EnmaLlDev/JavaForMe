
package t13_Ejercicios_ArrayList.ClassFactura;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Factura {
    private int nroIdentificador;
    private LocalDateTime fechaFactura;
    private int nroCliente;
    private final int IVA = 21;
    private ArrayList <LineaFactura> Lineas;
    
    public Factura(int nroIdentificador, int nroCliente) {
        this.nroIdentificador = nroIdentificador;
        this.fechaFactura = LocalDateTime.now();
        this.nroCliente = nroCliente;
        this.Lineas= new ArrayList<LineaFactura>();
        
    }
    public void AñadirLineas(String descripcion, double precio, int cantidad){
       LineaFactura LineaPrueba= new LineaFactura(descripcion,precio,cantidad);
       Lineas.add(LineaPrueba);
    }
    public void EliminarLineas(int nroLinea){
        Lineas.remove(nroLinea);
    }
    public void MostarFactura(){
        System.out.println("Factura \n"+Lineas.toString());;
    }

    public ArrayList <LineaFactura> getLineas() {
        return Lineas;
    }

    public void setLineas(ArrayList <LineaFactura> Lineas) {
        this.Lineas = Lineas;
    }
      @Override
    public String toString() {
        return "Factura{" + "\nnroIdentificador=" + nroIdentificador +
                ", \nfechaFactura=" + fechaFactura + ", \nnroCliente=" + nroCliente +
                ", \nIVA=" + IVA + ", \nLineas=" + Lineas + '}';
    }
}
