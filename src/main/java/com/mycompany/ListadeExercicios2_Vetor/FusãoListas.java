/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListadeExercicios2_Vetor;

/**
 *
 * @author brian.7908
 */
public class FusãoListas {
    public static void main(String[] args) {
        
        int[] list1 = new int [5];
        int[] list2 = new int [5];
        
        list1[0] = 54;
        list1[1] = 45;
        list1[2] = 132;
        list1[3] = 98;
        list1[4] = 47;
        
        list2[0] = 231;
        list2[1] = 789;
        list2[2] = 152;
        list2[3] = 496;
        list2[4] = 74;
        
        System.out.println("------VALORES DA LISTA 1------");
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        } 
        System.out.println("------VALORES DA LISTA 2------");
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        } 
        System.out.println("------VALORES EM CONJUNTO------");
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }for (int i = 0; i < list2.length; i++) {
            System.out.println(list2 [i]);
            
        }
    }
}