package modulo2;

public class RepercutirRozamiento extends Filtros {

	/**
	 * 
	 * @param revoluciones
	 * @param EstadoMotor
	 */
	public double ejecutar(double revoluciones, int EstadoMotor) {
            
            double r = revoluciones;
		if(revoluciones >= 1)
                    r = r-1;
                else
                    r = 0;
            return r;
	}
}
