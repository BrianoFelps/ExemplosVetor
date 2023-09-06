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
public class Vetor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] nums = new int[5];
        
        Boolean repetir = true;
       
        while (repetir){
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o valor [" + i + "]");
                nums[i]= scanner.nextInt();
            }
            System.out.println("-----------VALORES INFORMADOS-----------");
            for (int i = 0; i <5; i++) {
                System.out.println("O valor [" + i + "] é de " + nums[i]);
            }
       }
    }
}
