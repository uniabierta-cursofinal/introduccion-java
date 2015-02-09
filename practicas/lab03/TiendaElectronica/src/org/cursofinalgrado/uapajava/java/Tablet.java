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
public class Tablet extends DispositivosMoviles implements IConectividad3G, IWifi, ICalcularPrecio{
    private String sistemaOperativo;
    private boolean soporta3G;
    private boolean soportaWifi;
    private boolean multitactil;

    /**
     * @return the sistemaOperativo
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * @param sistemaOperativo the sistemaOperativo to set
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void setConectividad3G(boolean soporta3G) {
       this.soporta3G = soporta3G;
    }

    @Override
    public boolean isConectividad3G() {
        return soporta3G;
    }

    @Override
    public void setConectividadWifi(boolean soportaWifi) {
        this.soportaWifi = soportaWifi;
    }

    @Override
    public boolean isConectividadWifi() {
        return soportaWifi;
    }

    /**
     * @return the multitactil
     */
    public boolean isMultitactil() {
        return multitactil;
    }

    /**
     * @param multitactil the multitactil to set
     */
    public void setMultitactil(boolean multitactil) {
        this.multitactil = multitactil;
    }

    @Override
    public double getPrecio() {
        return calcularPrecio();
    }
    
    private double calcularPrecio(){
        double precioInicial = 15000.0;
        double precioFinal = 0.0;
        
        if(isConectividad3G()){
            precioFinal =  precioInicial + (precioInicial * .20);
        } else {
            precioFinal = precioInicial;
        }
        
        return precioFinal;
    }
}
