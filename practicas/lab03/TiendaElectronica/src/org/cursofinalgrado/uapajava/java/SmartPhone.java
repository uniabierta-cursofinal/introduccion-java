/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

/**
 * Clase que representa la entidad SmpartPhone
 * @author ecabrerar
 */
public class SmartPhone extends DispositivosMoviles implements IWifi, IConectividad2G, IConectividad3G, ICalcularPrecio{

    private boolean soportaWifi;
    private boolean tieneGPS;
    private boolean soporta3G;
    private boolean soporta2G;
    
    @Override
    public void setConectividadWifi(boolean soportaWifi) {
        this.soportaWifi =soportaWifi;
    }
    
    /**
     * si posee conectividad wifi
     * @return boolean
     */
    @Override
    public boolean isConectividadWifi() {
        return soportaWifi;
    }


    public void setIsSoportaWifi(boolean soportaWifi) {
        this.soportaWifi = soportaWifi;
    }

    /**
     * @return the tieneGPS
     */
    public boolean IsTieneGPS() {
        return tieneGPS;
    }

   
    public void setIsTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }

    @Override
    public void setConectividad2G(boolean soporta2G) {
        this.soporta2G = soporta2G;
    }

    @Override
    public boolean isConectividad2G() {
       return soporta2G;
    }

    @Override
    public void setConectividad3G(boolean soporta3G) {
        this.soporta3G = soporta3G;
    }

    @Override
    public boolean isConectividad3G() {
       return soporta3G;
    }
    
    private double calcularPrecio(){
        double precioInicial = 8000.0;
        double precioFinal=0.0;
        
        if(isConectividad3G() && isConectividadWifi()){
            precioFinal = precioInicial + (precioInicial * 0.15);
        } else {
            precioFinal = precioInicial;
        }      
        
        //TODO: agregar metodo para saber si es multitactil
        
        
        return precioFinal;
    }

    @Override
    public double getPrecio() {
        return calcularPrecio();
    }
    
}
