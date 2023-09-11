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
public class Inversão_Lista {
    public static void main(String[] args) {
    
                int [] nums = new int [5];
                int [] inv = new int [5];
                
                nums[0] = 12;
                nums[1] = 13;
                nums[2] = 14;
                nums[3] = 15;
                nums[4] = 16;
                
                inv[0] = 16;
                inv[1] = 15;
                inv[2] = 14;
                inv[3] = 13;
                inv[4] = 12;
                
                for (int i = 0; i < nums.length; i++) {
                    System.out.println("número [" + i + "]:" + nums[i]);
        }
                System.out.println("-------INVERSÃO DE VALORES------");
                for (int i = 0; i < nums.length; i++) {
                    System.out.println("número [" + i + "]:" + inv[i]);
                }
        }
    }


