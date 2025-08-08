/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.actividad6.vista;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class VistaPrincipal {

    public static void imprimirArrayResultante(ArrayList<String> arrayResultante){
          for (int i = 0; i < arrayResultante.size(); i++) {
            System.out.println(arrayResultante.get(i));
        }
    }
    
    public static double[][] generarArregloPrecios(){
        double[][] precios = {
            {10.0, 10.0, 10.0, 13.0},
            {20.0, 25.0, 32.0, 41.0},
            {50.0, 33.0, 10.0, 25.0},
            {5.0, 21.0, 15.0, 10.0}
        };
        
        return precios;
    }
    
    public static String[][] generarArregloCadenas(){
        String[][] palabras = {
            {"oso", "universo", "camiseta"},
            {"estupendo", "murcielago", "oracion"},
            {"salado", "sabana", "murga"}
         };
        return palabras;
    }
    
    public static void imprimirArregloPrecios(double[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println(); 
    }
}
    
     public static void imprimirArregloCadenas(String[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
}
}
    public static void main(String[] args) {
          System.out.println("Estoy probando que se pueda actualizar el repositorio con nuevos cambios");
          
    }
    
}
