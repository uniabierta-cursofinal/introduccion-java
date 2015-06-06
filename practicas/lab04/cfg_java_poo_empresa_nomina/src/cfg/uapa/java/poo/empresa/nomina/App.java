/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg.uapa.java.poo.empresa.nomina;

import cfg.uapa.java.poo.empresa.nomina.objetos.Consultor;
import cfg.uapa.java.poo.empresa.nomina.objetos.Empleado;
import cfg.uapa.java.poo.empresa.nomina.objetos.Posicion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ecabrerar
 */
public class App {
    public static void main(String[] args) {
         
        Consultor consultor = new Consultor();
        consultor.setNombre("Juan Genao");
        consultor.setNoEmpleado("25065");
        consultor.setCedula("001-000000-1");        
        consultor.setCantidadHora(25);
        consultor.setPrecioHora(400);
  
        Consultor consultor2= new Consultor();
        consultor2.setNombre("Juan Perez");
        consultor2.setNoEmpleado("25068");
        consultor2.setCedula("001-000000-1");        
        consultor2.setCantidadHora(50);
        consultor2.setPrecioHora(400);
        
        Consultor consultor3= new Consultor();
        consultor3.setNombre("Pedro Perez");
        consultor3.setNoEmpleado("25069");
        consultor3.setCedula("001-000000-1");        
        consultor3.setCantidadHora(55);
        consultor3.setPrecioHora(400);
        
        
        
        List<Consultor> consultores = new ArrayList<>();
        consultores.add(consultor);
        consultores.add(consultor2);
        consultores.add(consultor3);
                
        
        for(Consultor cons: consultores){
            if(cons.getSueldo()>15000){
                System.out.println(String.format("Nombre:%s \n Sueldo:%.2f",cons.getNombre(),cons.getSueldo()));
            }
        }
        
        
        Optional<Consultor> primerConsultor =  consultores.stream().findFirst();
                
         consultores
                .stream()
                .filter(new Predicate<Consultor>() {
                    
                    @Override
                    public boolean test(Consultor t) {
                        return t.getSueldo() > 15000;
                    }
                }).forEach(new Consumer<Consultor>() {

            @Override
            public void accept(Consultor t) {
                 System.out.println(String.format("Nombre:%s \n Sueldo:%.2f",t.getNombre(),t.getSueldo()));
       
            }
        });
         
        consultores
                .stream()
                .filter((Consultor t)->t.getSueldo() > 15000                        
                       
                ).forEach((Consultor t) -> {
                    System.out.println("--------------------------Mayores de 15000---------------");
                    System.out.println(String.format("Nombre:%s \n Sueldo:%.2f",t.getNombre(),t.getSueldo()));
              });
        

        List<Consultor> collect = consultores
                .stream()
                .filter((Consultor t)->t.getSueldo() < 15000
                        
                ).collect(Collectors.toList());
        
        
        
        for (Consultor collect1 : collect) {
            System.out.println("--------------------------Menores de 15000---------------");
            System.out.println(String.format("Nombre:%s \n Sueldo:%.2f",collect1.getNombre(),collect1.getSueldo()));
        
        }
        
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan Perez");
        empleado.setPosicion(Posicion.MECANICO);
        empleado.setPrecioHoraExtra(450);
        empleado.setCantidadHoras(200);
        
        
       // System.out.println(String.format("Nombre:%s \n Posicion:%s\n Sueldo:%.2f",empleado.getNombre(),empleado.getPosicion(),empleado.getSueldo() ));
        
        
        
        
    }
    
    
}
