
package Clases;


public class CreatorTrabajadores implements AbstractFactory {
    
    public InTrabajadores getTrabajador(int tipo){
        switch( tipo ){
            case 0 -> {
                return new TrabajadorTiempoCompleto();
            }
            case 1 -> {
                return new TrabajadorTiempoParcial();
            }
        }
        return null;
    }

    @Override
    public InProductos getProducto(int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
