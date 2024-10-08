package Clases;

public class Electrodomestico extends Producto implements InProductos {
    private String codigo;
    private int voltaje;
    private float capacidad;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, int voltaje, float capacidad) {
        this.codigo = codigo;
        this.voltaje = voltaje;
        this.capacidad = capacidad;
    }

    public Electrodomestico(String codigo, int voltaje, float capacidad, String nombre, double precio) {
        super(nombre, precio);
        this.codigo = codigo;
        this.voltaje = voltaje;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", voltaje=" + voltaje + ", capacidad=" + capacidad + '}';
    }
    
    public double calcularPrecio( ){
        return this.getPrecio();
    }
}
