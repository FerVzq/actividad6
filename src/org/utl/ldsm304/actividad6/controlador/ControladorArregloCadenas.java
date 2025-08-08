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
    
    public ArrayList<String> obtenerConTodasLasVocales(String [][] arreglo){
        ArrayList<String> palabrasConVocales = new ArrayList<>();
        for (int j = 0; j < arreglo.length; j++) { 
            for (int k = 0; k < arreglo[j].length; k++) { 
                boolean a = false;
                boolean e = false;
                boolean i = false;
                boolean o = false;
                boolean u = false;
                String palabra = arreglo[j][k].toLowerCase();
                for (int l = 0; l < palabra.length(); l++) { 
                    char letra = palabra.charAt(l);
                    if (letra == 'a'){
                        a = true;
                    }else if (letra == 'e'){
                        e = true;
                    }else if (letra == 'i'){
                        i = true;
                    }else if (letra == 'o'){
                        o = true;
                    }else if (letra == 'u'){
                        u = true;
                    }
                }
                if (a && e && i && o && u) {
                    palabrasConVocales.add(palabra);
                }
            }
        }
        return palabrasConVocales;
    }
    
   public ArrayList<String> obtenerConSilabaSa(String [][] arreglo) {
        ArrayList<String> palabrasConSa = new ArrayList<>();
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) { 
                boolean sa = false;
                String palabra = arreglo[i][j].toLowerCase();

                for (int k = 0; k < palabra.length() - 1; k++) { 
                    if (palabra.charAt(k) == 's' && palabra.charAt(k + 1) == 'a') {
                        sa = true;
                        break;  
                    }
                }

                if (sa) {
                    palabrasConSa.add(palabra);
                }
            }
        }
        return palabrasConSa;
    }

}
