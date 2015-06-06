/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg.uapa.java.poo.empresa.nomina.objetos;

import cfg.uapa.java.poo.empresa.nomina.abstracion.Sueldo;

/**
 *
 * @author ecabrerar
 */
public class Consultor extends Persona implements Sueldo{
    private double precioHora;
    private double cantidadHora;
    
    
    @Override
    public double getSueldo() {
       return calcularSueldoConsultor();
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getCantidadHora() {
        return cantidadHora;
    }

    public void setCantidadHora(double cantidadHora) {
        this.cantidadHora = cantidadHora;
    }
    
    
    private double calcularSueldoConsultor(){
        return (cantidadHora * precioHora)-((cantidadHora * precioHora) * 0.1);
    }
    
    
}
