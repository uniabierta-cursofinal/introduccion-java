/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java.util;

import java.util.HashMap;
import java.util.Map;
import org.cursofinalgrado.uapajava.java.Marca;

/**
 *
 * @author ecabrerar
 */
public class PrecioDBMap {
    
   
     public static Map<Marca,Double> getPrecio() {
         
         Map<Marca,Double> precios = new HashMap<>();
         precios.put(Marca.ALCATEL, new Double("1500"));
         precios.put(Marca.SAMSUNG, new Double("4000"));
          
         return precios;
         
     }
     
     
}
