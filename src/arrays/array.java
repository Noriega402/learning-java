/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author HP INTEL
 */
public class array {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //int[] array = new int[5];
        
        /*array[0] = 78;
        array[1] = 145;
        array[2] = 12;
        array[3] = 25;
        array[4] = 5;*/
        
        int[] array = {78,145,12,25,4};
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Posición " + i + " del Array: " + array[i]);
        }
        
    }
}
