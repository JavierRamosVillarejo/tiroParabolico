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
    
    public static ArrayList<String> mostrarGrados(){
        
        int valor=0;
        ArrayList<String> grados = new ArrayList();
        
        for(int i=0; i<=18; i++){
            grados.add(String.valueOf(valor));
            valor = valor + 10; 
        }
        return grados;        
        
    }
    
    public static double gradosAradianes (int grados){
        double radianes = grados *(Math.PI/180);
        return radianes;
    }
    
    public static ArrayList<Coordenada> getCoordenadas(double alcance, double velocidad, int angulo){
        double intervalo = alcance /10;
        
        ArrayList<Coordenada> listaCoordenadas = new ArrayList<Coordenada>();
        
        for (int i=0; i<10; i++){
            double x = i*intervalo;
            
            double y = x *Math.tan(Utilidades.gradosAradianes(angulo))-9.8*
                    Math.pow(x, 2)/(2*Math.pow(velocidad,2)*Math.pow(Math.cos(Utilidades.gradosAradianes(angulo)),2));
            
             Coordenada micoordenada = new Coordenada( x ,y );
             
             listaCoordenadas.add(micoordenada);
        
        }
       
    return listaCoordenadas;
}
    
}
