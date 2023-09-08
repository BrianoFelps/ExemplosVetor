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
public class Media_de_elementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int algoritmos = 5;
        float media= 0, soma = 0;
        float[] nums = new float [algoritmos];
        
        Boolean repetir = true;
                while (repetir){
        System.out.println("---------MÉDIA DE LISTA----------");
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Apresente o número da posição [" + i + "]");
            nums[i] = scanner.nextFloat();
            soma = soma + nums[i];
            media = soma/algoritmos;
        }
        System.out.println("A média dos números apresentados é de: " + media);
                }
    }
}
