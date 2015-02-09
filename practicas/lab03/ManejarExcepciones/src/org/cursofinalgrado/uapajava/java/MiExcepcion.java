/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

/**
 *
 * @author ecabrerar
 */
public class MiExcepcion extends Exception{

    public MiExcepcion() {
    }

    public MiExcepcion(String message) {
        super(message);
    }    
    
    @Override
    public String getMessage() {
        return "Excepcion para fines didacticos "+getMessage();
    }
    
}
