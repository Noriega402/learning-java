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
public class matriz_forEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        for(int[]row:matriz){
            for(int z:row){
                System.out.print(z + " ");
            }
            System.out.println("");
        }
    }
    
}
