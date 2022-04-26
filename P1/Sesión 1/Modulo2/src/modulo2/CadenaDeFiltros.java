package modulo2;
import java.util.ArrayList;

public class CadenaDeFiltros {
    private ArrayList<Filtros> filtros = new ArrayList<Filtros>();
    
    public void addFilter(Filtros filt){
       
        filtros.add(filt);
    }
    
    public double ejecutar(double revoluciones, int EstadoMotor, Salpicadero salpicadero){
        
        double r = revoluciones;
        for(int i = 0; i<filtros.size(); i++){
            
            r = filtros.get(i).ejecutar(r, EstadoMotor);
        }
  
        r = salpicadero.ejecutar(r, EstadoMotor);
       
        return r;
    }
}