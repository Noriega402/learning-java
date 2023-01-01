/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learning.java;

/**
 *
 * @author HP INTEL
 */
public class practiceArray {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
        int[] arr = new int[]{2,10,6,4,7,1,8,3,5,9,6}; //Declarando array y darle valores
        int aux;

        System.out.print("Array no ordenado: ");
        for(int e:arr){
            System.out.print(" " + e);
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        
        System.out.println(" ");
        System.out.print("Array ordenado:");
        for(int element:arr){
            System.out.print(element + " ");
        }
    }
}
