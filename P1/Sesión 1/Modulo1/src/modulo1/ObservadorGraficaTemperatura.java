package modulo1;
import java.util.ArrayList;
import java.util.Observable;
import modulo1.ObservableTemperatura;
import java.util.Observer;

public class ObservadorGraficaTemperatura implements Observer {
	public ArrayList<ObservableTemperatura> ultimosSiete = new ArrayList<ObservableTemperatura>();
        
        
        ObservadorGraficaTemperatura(){  
            ultimosSiete = new ArrayList<ObservableTemperatura>();
        }   
        
        
        @Override
	public void update(Observable t, Object arg1) {
            
            
            ObservableTemperatura t2=(ObservableTemperatura) t;   
            ObservableTemperatura copia= new ObservableTemperatura();
            copia.setGrados(t2.getGrados());
            copia.setGradosF(t2.getGradosF());

	    int numero = ultimosSiete.size();            
            if(numero<7){
                ultimosSiete.add(copia);                
            }else{
                ultimosSiete.remove(0);
                ultimosSiete.add(copia);
            }           
           System.out.println("Se ha registrado una nueva temperatura" ); 
           mostrarV();
	}          
        
       public void mostrarV(){
            System.out.println("------------------");
             System.out.println("-Grafica Temperatura-");
           for (int i = 0; i < ultimosSiete.size(); i++){
               int sem = i+ 1;
               System.out.println("Semana " + sem + ": " + ultimosSiete.get(i).getGrados() );
            }
            System.out.println("------------------");
       }
       
       public String mostrarG(){
           String cadena = "";
           for (int i = 0; i < ultimosSiete.size(); i++){
               int sem = i+ 1;
               cadena +=("Semana " + sem + ": " + ultimosSiete.get(i).getGrados() );
               cadena += "\n";
            }
           
           return  cadena;
       }
        
        public int size(){
            return ultimosSiete.size();
        }
}