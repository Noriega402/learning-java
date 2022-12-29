/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

// IMPORTANTE, IMPORTAR LAS CLASES PARA LOS GRAFICOS
import java.awt.Frame;
import javax.swing.*;

/**
 *
 * @author HP INTEL
 */
public class CreandoMarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        miMarco marco = new miMarco();
        marco.setVisible(true);
                
        //la siguiente linea hace que si cuando se de en el boton de cerrar, la cierre por defecto.
        // asi detiene la ejecucion del programa.
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // la siguiente instruccion realiza una accion diferente, esta cuando se ciera, solo se oculta.
        // pero el programa aun sigue funcionando.
        //marco.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
}


class miMarco extends JFrame{
    //metodo constructor
    public miMarco(){
        //para fijar un tamaño de la ventana.
        //setSize(600,400);
        
        //para fijar la posicion en la que se va a encontrar la ventana.
        //setLocation(400,150);
        
        //metodo mas rapido:
        //sus parametros son (Posicion x,Posicion y,ancho,alto)
        setBounds(400,150,600,400);
        
        //este metodo no permite que el usuario personalice el tamaño de la ventana, ni maximizarla.
        //setResizable(false);
        
        //abre la ventana por defecto a pantalla completa.
        setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}