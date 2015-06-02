/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursofinalgrado.uapa.java.poo.empresa.nomina;

import cursofinalgrado.uapa.java.poo.empresa.nomina.objetos.Consultor;
import cursofinalgrado.uapa.java.poo.empresa.nomina.objetos.Empleado;

/**
 *
 * @author ecabrerar
 */
public class Principal {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan Perez");
        empleado.setPosicion("Mecanico");
        empleado.setPrecioHoraExtra(250.00);
        empleado.setCantidadHoras(10.00);
        empleado.setSueldo(25000.00);
        
      final  StringBuilder info = new StringBuilder(45)
                .append("El sueldo de ")
                .append(empleado.getNombre())
                .append(" es : ")
                .append(empleado.obtenerSueldo());
        
        System.out.println(" "+info.toString());
  
        
        Consultor consultor = new Consultor();
        consultor.setNombre("Juan Genao");
        consultor.setNoEmpleado("25065");
        consultor.setCedula("001-000000-1");
        consultor.setCantidadHora(25);
        consultor.setPrecioHora(400);
        
        final StringBuilder consultorMsr = new StringBuilder(45)
                .append("El sueldo de ")
                .append(consultor.getNombre())
                .append(" es : ")
                .append(consultor.obtenerSueldo());
        
        System.out.println(" "+consultorMsr.toString());
        
        
    }
}
