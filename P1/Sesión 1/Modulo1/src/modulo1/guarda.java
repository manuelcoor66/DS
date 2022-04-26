/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo1;

import java.util.Observable;
import java.util.Random;

/**
 *
 * @author Flech
 */
/*public class guarda {
    package modulo1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;
import java.util.Observer;
public class ObservableTemperatura extends Observable implements Runnable {       
        private double grados = 0;
        private double Fahrenheit = 32;
        private boolean cambio = false;
        private ObservadorGraficaTemperatura grafica = new ObservadorGraficaTemperatura();
        private ObservadorBotonCambio boton = new ObservadorBotonCambio();
        private ObservadorPantallaTemperatura pantalla = new ObservadorPantallaTemperatura();

        ObservableTemperatura(double temp, ObservadorGraficaTemperatura grafica, ObservadorBotonCambio boton, ObservadorPantallaTemperatura pantalla){
            grados = temp;
            Fahrenheit = (temp * 1.8) + 32; 
            this.grafica = grafica;
            this.boton = boton;
            this.pantalla = pantalla;
        }
        
        ObservableTemperatura(){           
        }
            
        @Override
        public void run(){
            this.addObserver(grafica);
            this.addObserver(boton);
            
            
            while(true){
            Random claseRandom = new Random();
            double temp = claseRandom.nextInt(50);
            
            
            this.grados = temp;
            this.Fahrenheit = (temp * 1.8) + 32;            

            
            setChanged();
            notifyObservers();
            
            pantalla.obtenerDatos(this);
            pantalla.mostrar();
            
            System.out.println("Fin de Medición de Esta Semana");
            
            System.out.println("\n");
          
            
            try{
                Thread.sleep(6000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            
            }
        }
        
        public void actualizar(double c, double f){
            this.grados = c;
            this.Fahrenheit = f;
            
        }
                
        public void nuevaTemperatura(){
            
        }
    
        public double getGrados(){
            return grados;
        }
        public double getGradosF(){
            return Fahrenheit;
        }
        
        public boolean getcambio(){
            return cambio;
        }
        
        public void setGrados(double grados){
            this.grados = grados;
        }
        public void setGradosF(double grados){
            this.Fahrenheit = grados;
        }
        
        public boolean setcambio(boolean cambio){
            return this.cambio = cambio;
        }        
        
        public ObservadorGraficaTemperatura getGrafico(){
            return grafica;
        }
        
        public ObservadorPantallaTemperatura getPantalla(){
            return pantalla;
        }

}
}*/
