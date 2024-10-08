
package Clases;


public class Vehiculo extends Producto implements InProductos {
    private String codVehiculo;
    private String modelo;
    private float cilindraje;

    public String getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(String codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Vehiculo() {
    }

    public Vehiculo(String codVehiculo, String modelo, float cilindraje) {
        this.codVehiculo = codVehiculo;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public Vehiculo(String codVehiculo, String modelo, float cilindraje, String nombre, double precio) {
        super(nombre, precio);
        this.codVehiculo = codVehiculo;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codVehiculo=" + codVehiculo + ", modelo=" + modelo + ", cilindraje=" + cilindraje + '}';
    }
    
    public double calcularPrecio( ){
        return this.getPrecio();
    }    
    
}
