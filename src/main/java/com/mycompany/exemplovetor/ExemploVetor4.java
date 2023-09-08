/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplovetor;

/**
 *
 * @author brian.7908
 */
public class ExemploVetor4 {
    public static void main(String[] args) {
        String nome;
        
        nome = "Brian Felipe Goncalves";
        int totalcaracteres = 0;
        
        for (int i = 0; i < nome.length (); i++) {
           if(nome.charAt(i) !=  ' '){
            totalcaracteres++;
           }
        }
        // System.out.println(nome.charAt(i)
        System.out.println(totalcaracteres);
    }
}
