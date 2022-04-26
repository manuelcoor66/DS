package Sesion3;

import Sesion3.*;


public class SCACV extends Filtros {
    private double VelocidadCrucero;    //Velocidad crucero actual
    private double UltimoConocido;      //Velocidad almacenada en mantener
    private final int MAX = 5000;
    private final int RPM = 100;
    // EstadoSCACV = 0 -> Acelerar
    // EstadoSCACV = 1 -> Mantener
    // EstadoSCACV = 2 -> Reiniciar
    // EstadoSCACV = 3 -> Apagar
    
    
    public double ejecutar(double revoluciones, int EstadoMotor, int EstadoSCACV) {
        double r = 0;
        
        switch(EstadoSCACV) {
            case 0:
                
                r = revoluciones;
                
                r = revoluciones + RPM;

                if (r > MAX)
                    r = MAX;
                
                VelocidadCrucero = r;
            break;
            case 1:
                VelocidadCrucero = UltimoConocido = r = revoluciones;
            break;
            case 2:
                r = revoluciones;
                if (r > UltimoConocido-RPM && r < UltimoConocido+RPM)
                    r = UltimoConocido;
                else if (r > UltimoConocido){
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA : ");
                    r = revoluciones - RPM;
                }  
                else if (r < UltimoConocido) {
                    r = revoluciones + RPM;
                }
                
                VelocidadCrucero = r;
            break;
            case 3:
                r = revoluciones;
                VelocidadCrucero = 0;
            break;
        }
        
         
        return r;
    }  
    
    double getUltimoConocido() {
        return UltimoConocido;
    }
    
    void setUltimoConocido(double uC) {
        UltimoConocido = uC;
    }
}
