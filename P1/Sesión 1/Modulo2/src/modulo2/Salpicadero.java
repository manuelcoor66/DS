/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2;

/**
 *
 * @author pablo
 */
public class Salpicadero {
        private double velocidad_angular;
    private double velocidad_lineal;
    private double distancia_reciente;
    private double distancia_total;
    private double revs;
    private int EstadoMotor;     
    
	
    public double ejecutar(double revoluciones, int estadoMotor) {
        revs = revoluciones;
        velocidad_lineal = 2.0*3.1416*0.15*revoluciones*(60.0/1000.0); //km/h
        velocidad_angular = velocidad_lineal/0.15;
        return revs;
    }
   
    
    public void setEstado(int estado){
        EstadoMotor = estado;
        
    }
    
    public void setDistancias(double distancia){
        distancia_reciente += distancia;
        distancia_total += distancia;
    }
    
    public void reiniciarDistRec(){
        distancia_reciente = 0.0;
    }
    
    
   // public void setSalpicadero(double velocidad, double revoluciones, double distancia){
      //  velocidad_lineal = velocidad;
      //  revs = revoluciones;
      //  distancia_recorrida = distancia;
        
   // }
    
    public int getEstado(){
        
        return EstadoMotor;
    }
    
    public double getVelocidad(){
        
        return velocidad_lineal;
    }
    
    public double getRevoluciones(){
        
        return revs;
    }
    
    public double getReciente(){
        
        return distancia_reciente;
    }
    
    public double getTotal(){
        
        return distancia_total;
    }
    /**
     * Creates new form Salpicadero
     */
    public Salpicadero() {
        
        EstadoMotor=2;
    }
    
    
}
