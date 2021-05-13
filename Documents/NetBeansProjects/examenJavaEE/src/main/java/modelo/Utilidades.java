/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW-B
 */
public class Utilidades {
    public static ArrayList <String> CalculaAnios(){
        
        int anioActual = 2021;
        ArrayList<String> listaAnios = new ArrayList<String>();
        for ( int i= 0; i< 20; i++){
            int anio = anioActual - i;
            listaAnios.add(String.valueOf(anio));
        }
        return listaAnios;
    }
    
}
