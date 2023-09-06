/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplovetor;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class Exemplovetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] nums = new int[5];
        
         for (int i = 0; i < 5; i++) {
             System.out.println("Digite o valor para a posição [" + i + "]:");
             nums[i] = scanner.nextInt();
             
         }
         System.out.println("-----VALORES INFORMADOS------");
         
         for (int i = 0; i < 5; i++) {
            System.out.println("Valor na posição [" + i + "]:" + nums[i]);
        }
    }
}
