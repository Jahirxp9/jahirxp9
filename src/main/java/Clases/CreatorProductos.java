
package Clases;

public class CreatorProductos implements AbstractFactory {
    
    public InProductos getProducto(int tipo){
        switch( tipo ){
            case 0 -> {
                return new Electrodomestico();
            }
            case 1 -> {
                return new Vehiculo();
            }
        }
        return null;
    }

    @Override
    public InTrabajadores getTrabajador(int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
