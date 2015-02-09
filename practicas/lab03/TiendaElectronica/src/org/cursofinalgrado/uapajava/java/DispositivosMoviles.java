/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public class DispositivosMoviles {
   private String nombre;
   private Marca marca;
   private String version;
   private String capacidadAlmacentamiento;
   private String dimesionPantalla;
   private String tipoTeclado;
   private Date fechaLanzamiento;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the capacidadAlmacentamiento
     */
    public String getCapacidadAlmacentamiento() {
        return capacidadAlmacentamiento;
    }

    /**
     * @param capacidadAlmacentamiento the capacidadAlmacentamiento to set
     */
    public void setCapacidadAlmacentamiento(String capacidadAlmacentamiento) {
        this.capacidadAlmacentamiento = capacidadAlmacentamiento;
    }

    /**
     * @return the dimesionPantalla
     */
    public String getDimesionPantalla() {
        return dimesionPantalla;
    }

    /**
     * @param dimesionPantalla the dimesionPantalla to set
     */
    public void setDimesionPantalla(String dimesionPantalla) {
        this.dimesionPantalla = dimesionPantalla;
    }

    /**
     * @return the tipoTeclado
     */
    public String getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * @param tipoTeclado the tipoTeclado to set
     */
    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    /**
     * @return the fechaLanzamiento
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
   
   
   
}
