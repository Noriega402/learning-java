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
public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int pesoTotal;
    private boolean asientos_cuero, climatizador;
    
    public coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 800;
    }
    
    public String get_DatosGenerales(){
        return "El largo del coche es de " + largo + " cm. " +
                "Con " + ruedas + " ruedas y un motor de " + motor + 
                " el peso de la plataforma es de " + peso_plataforma + 
                " kg y el color es " + color;
    }
    
    public String get_DimeLargo(){
        return "El largo del coche es de " + largo  + " cm.";
    }
    
    public void set_EstablecerColor(String color){
        this.color = color;
    }
    
    public String get_DimeColor(){
        return "El color del coche es " + color;
    }
    
    public void set_ConfAsientos(String asientos_cuero){
       
        if (asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    
    public String get_DimeAsientos(){
        
        if (asientos_cuero==true) {
            return "El coche si tiene asientos de cuero";
        }else{
            return "El coche no tiene asientos de cuero";
        }
    }
    
    public String get_DimePesoCoche(){
        
        int pesoCarroceria = 500;
        pesoTotal = peso_plataforma+pesoCarroceria;
        if (asientos_cuero==true) {
            pesoTotal =pesoTotal+50;
            return "El Peso Total del Coche es de " + pesoTotal + " kg.";
        }else{
            return "El Peso Total del Coche es de " + pesoTotal + " kg.";
        }
    }
    
    public int get_PrecioCoche(){
        
        int precioFinal = 45000;
        if (asientos_cuero==true){
            precioFinal+=2500;
            return precioFinal;
        }else{
            return precioFinal;
        }
    }
}
