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
public class array_bidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*final int FILAS = 3, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (int i = 0; i < A.length; i++) { 
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }*/
        
        int [][] matrix = new int[3][4];
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        
        //System.out.println(matrix[2][2]);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------");
            for (int j = 0; j < 4; j++) {
                
                System.out.print("| " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        
    }
    
}