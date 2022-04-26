/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo1.s2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class CarreraMontana extends Carrera {
    
    
    private ArrayList<BiciMontana> bicicletas;
     
    CarreraMontana(ArrayList<BiciMontana> bicis){
        bicicletas = bicis;
    }
    
    
    public void retiraBici(int cantidad){
        Random random = new Random();
        System.out.print("Bicicletas de montaña número ");
        for(int i = 0; i < cantidad; i++){
            int numeroRand = random.nextInt(bicicletas.size());
            Bici eliminada = bicicletas.remove(numeroRand);
            System.out.print(eliminada.getId()+", ");
        }
        System.out.println("han sido retiradas.");
    }
   
   public ArrayList<BiciMontana> getBicis() {
       return bicicletas;
   }
   
}
