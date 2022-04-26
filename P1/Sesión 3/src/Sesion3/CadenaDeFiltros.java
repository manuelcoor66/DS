package Sesion3;
import java.util.ArrayList;

public class CadenaDeFiltros {
    private ArrayList<Filtros> filtros = new ArrayList<Filtros>();
    int scacv;
    
    public void addFilter(Filtros filt){
       
        filtros.add(filt);
    }
    
    public double ejecutar(double revoluciones, int EstadoMotor, Salpicadero salpicadero, int EstadoSCACV){
        double r = revoluciones;
        scacv = EstadoSCACV;
        
        if (EstadoSCACV == 2 && r == filtros.get(2).getUltimoConocido()) {
            scacv = 1;
        }
        
        for(int i = 0; i<filtros.size(); i++){
            r = filtros.get(i).ejecutar(r, EstadoMotor,scacv);
        }
        
  
        r = salpicadero.ejecutar(r, EstadoMotor, scacv);
        
        if (salpicadero.getEstado() == 2) {
            filtros.get(2).setUltimoConocido(0.0);
        }
        
        return r;
    }
    
    public int getEstadoSCACV() {
        return scacv;
    }
    
    public double getUltimoConocido(){
        return filtros.get(2).getUltimoConocido();
    }
    
}
