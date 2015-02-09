/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cursofinalgrado.uapajava.java.util;

import org.cursofinalgrado.uapajava.java.Marca;

/**
 *
 * @author ecabrerar
 */
public class PrecioDB {

    public static double getPrecio(Marca marca) {

        switch (marca) {
            case MOTOROLA:
                return 3500.00;
            case SAMSUNG:
                return 4000.00;
            case SONY_ERICSSON:
                return 3500;
            case ALCATEL:
                return 1500;

            default:
                return 0.0;
        }

    }
}
