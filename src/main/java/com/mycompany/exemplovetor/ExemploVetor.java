/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetor;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class ExemploVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                int[ ] nums = new int[5];
                int soma = 0;
                
                nums[0] = 12;
                nums[1] = 13;
                nums[2] = 14;
                nums[3] = 15;
                nums[4] = 16;
               
                for(int i = 0; i < 5; i++){
                    //System.out.println("Números na posição [" + i + "] possuem o valor " + nums[i]);
                    soma = soma + nums[i];
                }       
                System.out.println(soma);
    }
}