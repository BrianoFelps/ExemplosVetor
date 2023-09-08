/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListadeExercicios2_Vetor;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class Maior_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                
        int nums[] = new int [5], maior, menor;
        
        nums[0] = 12;
        nums[1] = 54;
        nums[2] = 3;
        nums[3] = 152;
        nums[4] = 94;
        
        maior = nums [0];
        menor = nums [0];

        System.out.println("A lista é a seguinte: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Valor na posição [" + i + "]: " + nums[i]);
            
        }
            for (int i = 0; i < nums.length; i++) {
               if (nums[i] > maior){
                   maior = nums[i];
               }

                }
               for (int  i= 0;  i < nums.length; i++) {
                   if(nums[i] < menor){
                   menor = nums [i];
                   }
            }
               System.out.println("==========================");
               System.out.println("O maior valor é de " +maior+ ", e o menor é " + menor);
        }
    }

