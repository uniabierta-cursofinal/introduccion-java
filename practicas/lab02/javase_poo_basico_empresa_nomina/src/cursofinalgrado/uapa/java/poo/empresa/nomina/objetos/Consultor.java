/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursofinalgrado.uapa.java.poo.empresa.nomina.objetos;

import cursofinalgrado.uapa.java.poo.empresa.nomina.abstracion.Sueldo;

/**
 *
 * @author ecabrerar
 */
public class Consultor extends Persona implements Sueldo{
     
    private double precioHora;
    private double cantidadHora;
    

    /**
     * @return the precioHora
     */
    public double getPrecioHora() {
        return precioHora;
    }

    /**
     * @param precioHora the precioHora to set
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    /**
     * @return the cantidadHora
     */
    public double getCantidadHora() {
        return cantidadHora;
    }

    /**
     * @param cantidadHora the cantidadHora to set
     */
    public void setCantidadHora(double cantidadHora) {
        this.cantidadHora = cantidadHora;
    }

    @Override
    public double obtenerSueldo() {
        return cantidadHora * precioHora;
       
    }
    
}
