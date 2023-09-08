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
public class Soma_de_elementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                
        int[] nums = new int [6];
        int soma= 0;
                
        System.out.println("--------SOMA DE LISTA---------");
        
        for (int i = 0; i < nums.length; i++) {
             System.out.println("Digite o valor [" + i  + "]");
             nums[i] = scanner.nextInt();
             soma = soma + nums[i];
        }
        System.out.println("======RESULTADO DA LISTA======");
        System.out.println("o resultado da soma dos dígitos é de: " + soma );
    }
    
}
