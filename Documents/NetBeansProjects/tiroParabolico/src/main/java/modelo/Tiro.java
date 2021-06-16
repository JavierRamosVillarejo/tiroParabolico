/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW-B
 */
public class Tiro {
     private double velocidad;
    private int angulo;
    private double gravedad= 9.8;
    private double alcance;
    private double altura;

    public Tiro(double velocidad, int angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    
    

    public double getVelocidad() {
        return velocidad;
    }

    public int getAngulo() {
        return angulo;
    }

    public double getGravedad() {
        return gravedad;
    }

    public double getAlcance() {
        double vx2= (this.velocidad*this.velocidad);
        
        double sin =Math.sin(2*Utilidades.gradosAradianes(this.angulo));
                
        this.alcance = vx2 * sin /gravedad;
        
        
        return alcance;
    }

    public double getAltura() {
        double vx2 = (this.velocidad*this.velocidad);
        double sin = Math.sin(Utilidades.gradosAradianes(this.angulo));
        double cuenta= sin * sin;
        
        this.altura = vx2 * cuenta / (2*gravedad);
        
        return altura;
    }
    
}
