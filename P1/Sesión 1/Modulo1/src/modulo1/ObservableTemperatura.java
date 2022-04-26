package modulo1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Observable;
import java.util.Observer;
public class ObservableTemperatura extends Observable {       
        private double grados = 0;
        private double Fahrenheit = 32;
        private boolean cambio = false;   

        
        ObservableTemperatura(){           
        }
            
        
        public void actualizar(double c, double f){
            this.grados = c;
            this.Fahrenheit = f;
            
        }
                
        public void nuevaTemperatura(){
            setChanged();
            notifyObservers();
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
        
 

}