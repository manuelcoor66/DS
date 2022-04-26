package modulo1;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import modulo1.ObservableTemperatura;
public class ObservadorBotonCambio implements Observer {


        @Override
	public void update(Observable t, Object arg1) {
		
            
            
            ObservableTemperatura t2 = (ObservableTemperatura) t;  
                
                System.out.println("------------------");
                System.out.println("---- BOTON CAMBIO ----");
                System.out.println("Celsius: " + t2.getGrados()); 
                 System.out.println("------------------");
                
                /*System.out.println("¿Desea cambiar los grados? Escriba S/N:"); 
                
                Scanner in = new Scanner(System.in);
                String decision = in.nextLine();                
                
                if(decision.equals("S")){  
                    System.out.println("Introduzca la nueva temperatura");
                    Scanner reader = new Scanner(System.in);
                    int grados  = reader.nextInt();
                    
                    t2.setGrados(grados);
                    t2.setGradosF((grados * 1.8) + 32);                   
                    t2.setcambio(true);
                    
                }*/
	}

        
	/**
	 * 
	 * @param t
	 */
	public void setTemperatura(ObservableTemperatura t) {

	}
        
        

}