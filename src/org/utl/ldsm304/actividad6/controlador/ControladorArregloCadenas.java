/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.actividad6.controlador;

import java.util.ArrayList;


/**
 *
 * @author natal
 */
public class ControladorArregloCadenas {
    public ArrayList<String> devolverCadenasConO(String[][] arreglo){
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                String palabra = arreglo[i][j].toLowerCase();
                char letra = palabra.charAt(0);
                if(letra == 'o'){
                    resultado.add(palabra);
                }
            }
        }
        return resultado;
    }
}
