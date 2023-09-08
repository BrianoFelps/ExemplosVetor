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
public class ExemploVetor5 {
    public static void main(String[] args) {
        String [] nomes = new String[5];
        Scanner scanner = new Scanner (System.in);
        
        
        nomes[0] = "Ana";
        nomes[1] = "Maria";
        nomes[2] = "Joao";
        nomes[3] = "Pedro";
        nomes[4] = "Lucas";
        
        System.out.println("Informe seu nome abaixo: ");
        String nome = scanner.next();
        Boolean naLista;
        
        naLista = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals (nome)){
                naLista = true;
                System.out.println("O nome " + nome + " está na lista, na posição " + i);
                break;
            }
        }
        if(!naLista){
        System.out.println(nome + " não está na lista!");
        }
    }
    }
