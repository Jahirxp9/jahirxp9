
package Clases;

public class FabricaProductor {
    
    public static AbstractFactory getFactory( int tipoFabrica ){
        switch( tipoFabrica ){
            case 1 -> { 
                return (AbstractFactory) new CreatorTrabajadores();
            }
            case 2 -> { 
                return (AbstractFactory) new CreatorProductos();
            }
        }
        return null;
    }
}
