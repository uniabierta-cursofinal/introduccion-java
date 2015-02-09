/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java.frontend;

import java.util.ArrayList;
import java.util.List;
import org.cursofinalgrado.uapajava.java.Celular;
import org.cursofinalgrado.uapajava.java.Marca;
import org.cursofinalgrado.uapajava.java.SmartPhone;
import org.cursofinalgrado.uapajava.java.Tablet;

/**
 *
 * @author ecabrerar
 */
public class App {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setNombre("One touch");
        celular.setMarca(Marca.ALCATEL);
        
        Celular samsumg = new Celular();
        samsumg.setNombre("Samsumg ");
        samsumg.setMarca(Marca.SAMSUNG);
        
        List<Celular> celulares = new ArrayList<>();
        
        System.out.println(" /****/CELULARES/***/");
        
        celulares.add(celular);
        celulares.add(samsumg);
        
        for (Celular celular1 : celulares) {
            System.out.println("--- "+celular1.getNombre() + " "+celular1.getPrecio());
        }
        
        
        SmartPhone[] celularesInteligentes = new SmartPhone[3];
        
        SmartPhone smart = new SmartPhone();
        smart.setNombre(" Nexus 4");
        smart.setConectividad2G(true);
        smart.setConectividad3G(true);
        smart.setConectividadWifi(true);
        smart.setMarca(Marca.LG);
        
        
         SmartPhone smart1 = new SmartPhone();
        smart1.setNombre(" Samsumg Galaxy 3");
        smart1.setConectividad2G(true);
        smart1.setConectividad3G(true);
        smart1.setConectividadWifi(true);
        smart1.setMarca(Marca.SAMSUNG);
        
        celularesInteligentes[0] = smart;
        celularesInteligentes[1] = smart1;
        
        System.out.println("/****/Arrgelos/****/");
        
        try {
        
             for (SmartPhone smartPhone : celularesInteligentes) {
                 System.out.println(" "+smartPhone.getNombre() + " "+smartPhone.getMarca()+" "+smartPhone.getPrecio());
       
            }
        }catch(NullPointerException npe){
            System.out.println("Trato de tomar un indice no declarado");
        }
        
        
        Tablet tablet = new Tablet();
        tablet.setNombre(" Nexus 7");
        tablet.setMarca(Marca.SAMSUNG);
        tablet.setConectividad3G(false);
        tablet.setSistemaOperativo(" Android KitKat");
        
        System.out.println(" "+tablet.getNombre() + " "+tablet.getSistemaOperativo()+ " "+tablet.getMarca()+ " "+tablet.getPrecio());
    }
}
