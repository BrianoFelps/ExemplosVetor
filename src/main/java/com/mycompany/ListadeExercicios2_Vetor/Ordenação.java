/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListadeExercicios2_Vetor;

import java.util.Arrays;

/**
 *
 * @author brian.7908
 */
public class Ordenação {
    public static void main(String[] args) {
        
        int[] list = new int [5];
        int aux = 0;
        
        list [0]= 5;
        list [1]= 3;
        list [2]= 4;
        list [3]= 1;
        list [4]= 2;
        
        System.out.println("======LISTA BRUTA======");
                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i]);
        }
                for (int i = 0; i < list.length; i++) {
                    for (int j = 0; j < list.length - 1; j++) {
                        if (list[j] > list [j+1]){
                            aux = list[j];
                            list [j] = list [j+1];
                            list [j+1] = aux;
                      }
                }
                }
        System.out.println("======LISTA ORDENADA======");
           for (int i = 0; i < list.length; i++) {
               System.out.println(list[i]);
        }
        }
    }


