/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ecabrerar
 */
public class CapturarExcepcion {
   
    public static void main(String[] args) {
        
        
        try {
             System.out.println("---"+args[0]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("--No ha pasado parámetros alguno");
        }
       
        
        MiClase m = new MiClase();
        try {
            m.probarExcepcion();
        } catch (MiExcepcion ex) {
            Logger.getLogger(CapturarExcepcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
