/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo1.s2;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
        static private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
        
        static private void esperarXmilisegundos(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n=100;

        Random random = new Random();
        int instanteRetirada = random.nextInt(58)+1;
        
        
         System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new Runnable() {
            int tiempo=0;
            Boolean terminar=true;

            @Override
            public void run() {
                  System.out.println("Inside : " + Thread.currentThread().getName());
                  CarreraCarretera carreraC = FactoriaCarretera.getInstance().crearCarrera(n);
                  int topeC= n/10;
                  esperarXmilisegundos(50);
                  while(terminar){
                    esperarXsegundos(1);
                    tiempo++;
                    
                    if (tiempo < 60){
                        if(tiempo == instanteRetirada){
                            carreraC.retiraBici(topeC);
                        }
                        
                    
                    }else{
                        terminar = false;
                        System.out.println("Ha acabado la carrera de carretera, enhorabuena a los corredores!!!");
                    }
                     
                      
                  }
            }
            
        };

        
        
        Runnable runnable2 = new Runnable() {
            int tiempo=0;
            Boolean terminar=true;
            int topeC= n/10;
            int topeM=n/5;

            @Override
            public void run() {
                  System.out.println("Inside : " + Thread.currentThread().getName());
                  CarreraMontana carreraM = FactoriaMontana.getInstance().crearCarrera(n);
                  int topeM=n/5;
                  while(terminar){
                    esperarXsegundos(1);
                    tiempo++;
                    
                    if (tiempo < 60){
                        
                        if(tiempo == instanteRetirada){
                            carreraM.retiraBici(topeM);
                        }
                    
                    }else{
                        terminar = false;
                        System.out.println("Ha acabado la carrera de montaña, enhorabuena a los corredores!!!");
                    }
                     
                      
                  }
            }
            
        };
        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        System.out.println("Starting Thread...");
        thread.start();
        thread2.start();
        
        
      //  thread.run();
       // thread2.run();
        
        
        
            
    }
    
}
