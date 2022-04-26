package modulo1;

public class ObservadorPantallaTemperatura {

	private double grados = 0;
        private double fahrenheit = 0;
        
        ObservadorPantallaTemperatura(){            
        }               
        
        ObservadorPantallaTemperatura(double c, double f){            
            
            grados = c;
            fahrenheit = f;
        
        }  
        
        public void obtenerDatos(ObservableTemperatura t){
            grados = t.getGrados();
            fahrenheit = t.getGradosF();
        }
        
        public void mostrar(){
            System.out.println("\n");
            System.out.println("------------------");
            System.out.println("---- PANTALLA ----");
            System.out.println("Celsius: " + grados ); 
            System.out.println("Fahrenheit : " + fahrenheit );
        }

        public double getGrados(){
            return grados;
        }
        
        public double getFahrenheit(){
            return fahrenheit;
        }
       
}