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
public class CarreraCarretera extends  Carrera{
    
    private ArrayList<BiciCarretera> bicicletas;
     
    CarreraCarretera(ArrayList<BiciCarretera> bicis){
        bicicletas = bicis;
    }
    
    
    public void retiraBici(int cantidad){
        Random random = new Random();
        System.out.print("Bicicletas de carretera número ");
        for(int i = 0; i < cantidad; i++){
            int numeroRand = random.nextInt(bicicletas.size());
            Bici eliminada = bicicletas.remove(numeroRand);
            System.out.print(eliminada.getId()+", ");
        }
        System.out.println("han sido retiradas.");
    }
   
   public ArrayList<BiciCarretera> getBicis() {
       return bicicletas;
   }
   
    
    
}
