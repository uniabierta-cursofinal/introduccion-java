/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg.uapa.java.poo.empresa.nomina.objetos;

import cfg.uapa.java.poo.empresa.nomina.abstracion.Sueldo;
import cfg.uapa.java.poo.empresa.nomina.util.SueldoDB;

/**
 *
 * @author ecabrerar
 */
public class Empleado extends Persona implements Sueldo{
    private Posicion posicion;   
    private double precioHoraExtra;
    private double cantidadHoras;
    
    
    @Override
    public double getSueldo() {
      return calcularSueldoEmpleado();
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    
    
    private double calcularSueldoEmpleado(){
        
        double sueldoBruto = (SueldoDB.getSueldo(getPosicion()));
        
       
        double totalHoras;
        double sueldoExtra = 0;
        
        double descuentoAfp;
        double descuentoSfs;
        
        if(cantidadHoras > 176 && (getPosicion().equals(Posicion.CONTABLE) 
                ||getPosicion().equals(Posicion.SECRETARIA)
                || getPosicion().equals(Posicion.MECANICO))){
            
                totalHoras = cantidadHoras-176;
                
                sueldoExtra = totalHoras * precioHoraExtra;
        }
        
        if(getPosicion().equals(Posicion.COORDINADOR)){
            sueldoExtra = 5000;
        }
      
        descuentoAfp = ((sueldoBruto+sueldoExtra) * (2.72/100));
        descuentoSfs = ((sueldoBruto+sueldoExtra) * (3.01/100));
            
       
           return sueldoBruto+sueldoExtra - descuentoAfp-descuentoSfs;
        
    }
}
