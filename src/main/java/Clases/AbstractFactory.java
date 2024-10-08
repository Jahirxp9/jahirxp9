package Clases;

public interface AbstractFactory {
    InTrabajadores getTrabajador(int tipo);
    InProductos getProducto( int tipo );
}
