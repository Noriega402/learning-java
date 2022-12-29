/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author HP INTEL
 */
public class for_each {
    public static void main(String[] args){
        int[] array = {24,65,78,100,12,23,4,34};
        
        //Este es el bucle forEach en java
        System.out.println("Los numeros son los siguientes:");
        for(int elemento:array){
            System.out.print(elemento + " ");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Este es otro Ejemplo");
        
        String[] nombres = {"Daniel","Belen","Cindy","Melany","Edgar","Jose","Noriega"};
        System.out.println("Nombres del Arreglo");
        for(String i:nombres){
            System.out.println(i +" ");
        }
    }
}
