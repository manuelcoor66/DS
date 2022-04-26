/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo1.s2;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class FactoriaCarretera extends FactoriaCarreraYBicicleta{
    
    
   static final private FactoriaCarretera instance = new FactoriaCarretera();
   
   
   static public FactoriaCarretera getInstance(){
       return instance;
   }
    
   public CarreraCarretera crearCarrera(int n){
       ArrayList<BiciCarretera> bicis = crearBicicleta(n);
       CarreraCarretera carrera = new CarreraCarretera(bicis);
       
       return carrera;
   
   }
    
   public ArrayList<BiciCarretera> crearBicicleta(int n){
        ArrayList<BiciCarretera> bicicletas = new ArrayList();
        for (int i=0; i < n; i++){
            BiciCarretera bicicleta = new BiciCarretera(i);
            bicicletas.add(bicicleta);
        }
        
        return bicicletas;
    }
    
    
    
    
}
