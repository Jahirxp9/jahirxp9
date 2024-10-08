
package com.jabr.interfaces;

import Clases.AbstractFactory;
import Clases.FabricaProductor;



public class Interfaces { // astract

    public static void main(String[] args) {
        AbstractFactory fabTra = FabricaProductor.getFactory( 1 ); // crea trabajadores
        
        AbstractFactory fabPro = FabricaProductor.getFactory(2);
        
        System.out.println(fabTra.getTrabajador( 1 ).toString());
    }
}
