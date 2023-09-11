/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListadeExercicios2_Vetor;

/**
 *
 * @author brian.7908
 */
public class FiltroImpares {
    public static void main(String[] args) {
       
        int[] nums = new int [8];
        
        nums [0] = 47;
        nums [1] = 8;
        nums [2] = 68;
        nums [3] = 1023;
        nums [4] = 8975;
        nums [5] = 4;
        nums [6] = 78;
        nums [7] = 549;
        
        System.out.println("------LISTA DE VALORES------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("-------VALORES ÍMPARES------");
        for (int i = 0; i < nums.length; i++) {
            if ((nums [i] % 2) != 0){
                System.out.println(nums[i]);
            }
        }
    }
}
