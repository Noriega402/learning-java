/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Noriega
 */
public class UsoVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coche miCoche = new coche();
        
        miCoche.set_EstablecerColor(JOptionPane.showInputDialog("Escribe el color del Coche"));
        miCoche.set_ConfAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        
        System.out.println(miCoche.get_DatosGenerales());
        System.out.println(miCoche.get_DimeAsientos());
        System.out.println(miCoche.get_DimePesoCoche());
        System.out.println("El precio del Coche es de " + miCoche.get_PrecioCoche());
        
        furgoneta miFurgo = new furgoneta(7,2);
        miFurgo.set_EstablecerColor("Azul");
        miFurgo.set_ConfAsientos("No");
        System.out.println("Datos de la Furgoneta: ");
        System.out.println(miFurgo.get_DatosGenerales());
        System.out.println(miFurgo.getFurgoneta());
        
    }
    
}
