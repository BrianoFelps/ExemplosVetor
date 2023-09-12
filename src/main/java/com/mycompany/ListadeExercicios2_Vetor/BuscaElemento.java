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
public class BuscaElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] list = new int [7];
        int posicao;
        Boolean repetir = true;
        
        list [0] = 13;
        list [1] = 45;
        list [2] = 68;
        list [3] = 97;
        list [4] = 15;
        list [5] = 189;
        list [6] = 98;
        
        while (repetir){
            
       
        System.out.println("------LISTA NUMÉRICA------");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Selecione um elemento da lista para obter sua posição:");
        int num = scanner.nextInt();
        Boolean NaLista = false;
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
            NaLista = true;
                System.out.println("O elemento " + num + ", da lista, está na posição "+ i);
                break;
            }
        }
        if (!NaLista){
            System.out.println("Não está na lista!");
        }
        }
    }    
}
