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
public class FactoriaMontana extends FactoriaCarreraYBicicleta{
    
    static final private FactoriaMontana instance = new FactoriaMontana();
   
   
    static public FactoriaMontana getInstance(){
       return instance;
   }
    
    
    public CarreraMontana crearCarrera(int n){
        
       ArrayList<BiciMontana> bicis = crearBicicleta(n);
       CarreraMontana carrera = new CarreraMontana(bicis);
       
       return carrera;
   
    }
    
    
    
    
    public ArrayList<BiciMontana> crearBicicleta(int n){
        
        ArrayList<BiciMontana> bicicletas = new ArrayList();
        
        for (int i=0; i < n; i++){
            BiciMontana bicicleta = new BiciMontana(i);
            bicicletas.add(bicicleta);
        }
        
        return bicicletas;
        
    }
    
    
}
