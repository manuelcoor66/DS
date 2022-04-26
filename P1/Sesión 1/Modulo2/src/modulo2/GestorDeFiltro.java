package modulo2;

public class GestorDeFiltro {
    private CadenaDeFiltros cadena;

	public void peticionFiltros() {
            
            RepercutirRozamiento rozamiento = new RepercutirRozamiento();
            CalcularVelocidad velocidad = new CalcularVelocidad();
            cadena = new CadenaDeFiltros();
            cadena.addFilter(rozamiento);
            cadena.addFilter(velocidad);
	}
        
        public double ejecutar(double revoluciones, int EstadoMotor, Salpicadero salpicadero){
            double r = revoluciones;
            r = cadena.ejecutar(r, EstadoMotor, salpicadero);
            return r;
        }

}