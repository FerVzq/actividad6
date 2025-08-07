/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ldsm304.actividad6.controlador;

/**
 *
 * @author natal
 */
public class ControladorArregloNumeros {
    public double obtenerNumeroMasRepetido(double [][]matriz){
    double numeroMasRepetido= matriz[0][0];
      int maxRepeticiones =0;
      
      for (int i =0; i< matriz.length; i++){
          for (int j = 0; j < matriz[i].length; j++){
              double actual = matriz [i][j];
              int repeticiones =0;
              
              for (int k=0; k < matriz.length; k++){
                  for (int l = 0; l< matriz[k].length; l++){
                      if (matriz[k][l]== actual){
                          repeticiones++;
                      }
                  }
              }
              if (repeticiones > maxRepeticiones){
                  maxRepeticiones = repeticiones;
                  numeroMasRepetido = actual;
              }
          }
      }
      return numeroMasRepetido;
    } 
    public int contarNumerosPares(double[][] matriz){
    int contador = 0;
        
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz [i][j] % 2==0){
                    contador++;
                }
            } 
        }
        return contador;
    }
    public int contarNumerosImpares(double [][] matriz){
        int contador = 0;
        for (int i = 0; i< matriz.length; i++){
            for (int j =0; j< matriz[i].length; j++){
                if (matriz [i][j] % 2!= 0){
                    contador++;
                }
            }
        }
          return contador;
        
    }
}
