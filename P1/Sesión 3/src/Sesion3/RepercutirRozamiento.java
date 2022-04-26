package Sesion3;

public class RepercutirRozamiento extends Filtros {
    public double ejecutar(double revoluciones, int EstadoMotor, int EstadoSCACV) {
        double r = revoluciones;
        
        
        
        if (EstadoSCACV != 1) {
                if(revoluciones >= 1)
                    r = r-1;
                else
                    r = 0;
        }
       
        
        return r;
    }
}
