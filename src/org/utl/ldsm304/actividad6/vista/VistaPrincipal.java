/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.utl.ldsm304.actividad6.vista;

import java.util.ArrayList;
import java.util.Scanner;
import org.utl.ldsm304.actividad6.controlador.ControladorArregloCadenas;
import org.utl.ldsm304.actividad6.controlador.ControladorArregloNumeros;

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
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Operaciones con arreglo bidimensional de numeros (precios) ");
        System.out.println("2.Operaciones con arreglo bidimensional de cadenas");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
        int opcion=sc.nextInt();
        if(opcion==1){
            double[][] precios=generarArregloPrecios();
            ControladorArregloNumeros cam=new ControladorArregloNumeros();
            System.out.println("a. Obtener el numero que mas se repite. ");
            System.out.println("b. Obtener la cantidad de numeros pares ");
            System.out.println("c. Obtener la cantidad de numeros impares ");
            System.out.println("d. Obtener la suma de los numeros que estan en la diagonal ");
            System.out.println("e. Obtener la cantidad de numeros mu1ltiplos de 5 ");
            System.out.println("Ingrese la opcion que desea ejecutar: ");
            char eleccion=sc.next().charAt(0);
            System.out.println("\n----- Arreglo ------");
            imprimirArregloPrecios(precios);
            switch(eleccion){
                case 'a':
                    double num=cam.obtenerNumeroMasRepetido(precios);
                    System.out.println("\nEl numero que mas se repite es: "+num);
                    break;
                case 'b':
                    int numPares=cam.contarNumerosPares(precios);
                    System.out.println("\nCantidad de numeros pares: "+numPares);
                    break;
                case 'c':
                    int numImpares=cam.contarNumerosImpares(precios);
                    System.out.println("\nCantidad de numeros impares: "+numImpares);
                    break;
                case 'd':
                    double sumaDiagonal=cam.sumarNumerosDiagonal(precios);
                    System.out.println("\nLa suma diagonal es: "+sumaDiagonal);
                    break;
                case 'e':
                    int multiplos=cam.contarNumerosMultiplos(precios);
                    System.out.println("\nLa cantidad de multiplos de 5 es: "+multiplos);
                    break;
                default:
                    System.out.println("\nOpcion incorrecta");
                break;
                    
            }  
    } else if(opcion==2){
            String [][] cadenas= generarArregloCadenas();
            ControladorArregloCadenas cac= new ControladorArregloCadenas();
            System.out.println("a. Cadenas que empiezan con la letra o ");
            System.out.println("b. Cadenas con 5 vocales");
            System.out.println("c. Cadenas con silaba sa");
            System.out.println("Ingrese la opcion que desea ejecutar:");
             char eleccion=sc.next().charAt(0);
            System.out.println("\n----- Arreglo ------");
            imprimirArregloCadenas(cadenas);
            switch(eleccion){
                case 'a':
                    ArrayList<String> cadenasO= cac.devolverCadenasConO(cadenas);
                    System.out.println("\nLas cadenas que empiezan por o son: ");
                    imprimirArrayResultante(cadenasO);
                    break;
                case 'b':
                    ArrayList<String> cadenasVocales= cac.obtenerConTodasLasVocales(cadenas);
                    System.out.println("\nLas cadenas que tiene las 5 vocales son: ");
                    imprimirArrayResultante(cadenasVocales);
                    break;
                case 'c':
                    ArrayList<String> cadenasSilaba= cac.obtenerConSilabaSa(cadenas);
                    System.out.println("\nLas cadenas que tiene la silaba sa son: ");
                    imprimirArrayResultante(cadenasSilaba);
                    break;
            }
        }else{
            System.out.println("Opcion incorrecta");
        }
    }
}   
