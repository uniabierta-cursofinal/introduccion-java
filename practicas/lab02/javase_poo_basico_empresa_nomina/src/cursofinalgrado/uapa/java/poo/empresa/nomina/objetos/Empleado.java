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
public class Empleado extends Persona implements Sueldo{
    private String posicion;
    private double sueldo;
    private double precioHoraExtra;
    private double cantidadHoras;

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    

    @Override
    public double obtenerSueldo() {
        return sueldo + (cantidadHoras * precioHoraExtra);
    }

    /**
     * @return the precioHoraExtra
     */
    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    /**
     * @param precioHoraExtra the precioHoraExtra to set
     */
    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    /**
     * @return the cantidadHoras
     */
    public double getCantidadHoras() {
        return cantidadHoras;
    }

    /**
     * @param cantidadHoras the cantidadHoras to set
     */
    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    
}
