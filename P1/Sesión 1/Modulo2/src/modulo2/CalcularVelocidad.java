package modulo2;

public class CalcularVelocidad extends Filtros {
    private final int MAX = 5000;
    private final int RPM = 100;
    // EstadoMotor = 0 -> Acelerando
    // EstadoMotor = 1 -> Frenando
    // EstadoMotor = 2 -> Apagado
    // EstadoMotor = 3 -> Encendido
    
	public double ejecutar(double revoluciones, int EstadoMotor) {
            double r = 0;
           
            if (EstadoMotor == 2 || EstadoMotor == 3)
                r = revoluciones;
            else if (EstadoMotor == 1) {
                r = revoluciones - RPM;
                if (r < 0)
                    r = 0;
            }
            else if (EstadoMotor == 0) {
                r = revoluciones + RPM;
                
                if (r > MAX)
                    r = MAX;
            }
            
            return r;
	}

	public void cambiarUnidades() {
		// TODO - implement CalcularVelocidad.cambiarUnidades
		throw new UnsupportedOperationException();
	}
}