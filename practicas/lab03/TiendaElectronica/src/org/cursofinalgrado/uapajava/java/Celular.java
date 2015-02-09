/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

import org.cursofinalgrado.uapajava.java.util.PrecioDBMap;

/**
 *
 * @author ecabrerar
 */
public class Celular extends DispositivosMoviles implements ICalcularPrecio{

    @Override
    public double getPrecio() {
        
       return PrecioDBMap.getPrecio().get(getMarca());
    }
    
}
