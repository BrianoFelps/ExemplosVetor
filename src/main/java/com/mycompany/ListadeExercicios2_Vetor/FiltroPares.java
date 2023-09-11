/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListadeExercicios2_Vetor;

/**
 *
 * @author brian.7908
 */
public class FiltroPares {
    public static void main(String[] args) {
                 
        int[] nums = new int [8];
        
        nums [0] = 14;
        nums [1] = 3;
        nums [2] = 87;
        nums [3] = 10;
        nums [4] = 63;
        nums [5] = 47;
        nums [6] = 89;
        nums [7] = 80;
        
        System.out.println("Lista de valores:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        } 
        System.out.println("Os valores pares da lista são:");
        
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2) == 0){
                System.out.println(nums [i]);
            }
        }
    }
}
