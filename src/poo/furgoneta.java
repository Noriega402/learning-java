/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Daniel Noriega
 */
public class furgoneta extends coche{
    
    private final int capacidadCarga;
    private final int plazaExtra;
    
    public furgoneta(int capacidadExtra, int plazaExtra){
        super();
        this.capacidadCarga = capacidadExtra;
        this.plazaExtra = plazaExtra;
    }
    
    public String getFurgoneta(){
        return "Capacidad de carga: " + this.capacidadCarga 
                + "\nPlaza extra: " + this.plazaExtra;
    }
    
}
