package Sesion3;

public class GestorDeFiltro {
    private CadenaDeFiltros cadena;

    public void peticionFiltros() {
        RepercutirRozamiento rozamiento = new RepercutirRozamiento();
        CalcularVelocidad velocidad = new CalcularVelocidad();
        SCACV scacv = new SCACV();
        cadena = new CadenaDeFiltros();
        cadena.addFilter(rozamiento);
        cadena.addFilter(velocidad);
        cadena.addFilter(scacv);
    }

    public double ejecutar(double revoluciones, int EstadoMotor, Salpicadero salpicadero, int EstadoSCACV){
        double r = revoluciones;
         
        r = cadena.ejecutar(r, EstadoMotor, salpicadero, EstadoSCACV);
        
        return r;
    }
    
    int getEstadoSCACV() {
        return cadena.getEstadoSCACV();
    }
    
    public double getUltimoConocido(){
        return cadena.getUltimoConocido();
    }
    

}