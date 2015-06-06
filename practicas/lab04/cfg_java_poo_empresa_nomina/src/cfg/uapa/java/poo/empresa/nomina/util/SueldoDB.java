/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg.uapa.java.poo.empresa.nomina.util;

import cfg.uapa.java.poo.empresa.nomina.objetos.Posicion;

/**
 * Representa nuestra fuente de datos para saber el sueldo que corresponde 
 * a cada posicion dentro de la empresa
 *
 * @author ecabrerar
 */
public class SueldoDB {

    public static double getSueldo(Posicion posicion) {

        switch (posicion) {
            case SECRETARIA:
                return 15000;
            case CONTABLE:
                return 25000;
            case MECANICO:
                return 18000;
            case COORDINADOR:
                return 35000;
            case GERENTE:
                return 55000;
            default:
                return 0.0;
        }
    }
}
