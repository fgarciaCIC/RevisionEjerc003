package ejerc003;

public class Batidora {
	    private double velocidadBatidora;
	    private Calculadora calculadoraBatidora;
	    private int estadoTurbo;

	    // Método para poner velocidad a Batidora (1, 2, 3)
	    public void cambiarVelocidad(int valorVelocidad) {
	        this.calculadoraBatidora.insertarCalculadora(valorVelocidad);
	        this.setVelocidadBatidora(valorVelocidad);
	    }
	    // Método para activar turbo a Batidora (multiplica por 2 la velocidad)
	    public void activarTurbo() {
	        if (this.estadoTurbo == 0 && calculadoraBatidora.getEstadoCalculadora() == 1) {
	            this.calculadoraBatidora.multiplicar(2);
	            this.setVelocidadBatidora(this.calculadoraBatidora.getResultado());
	            this.estadoTurbo = 1;
	        }
	    }
	    // Método para desactivar turbo a Batidora (divide por 2 la velocidad si esta activo el turbo)		 
	    public void desactivarTurbo() {
	        if (this.estadoTurbo == 1 && this.calculadoraBatidora.getEstadoCalculadora() == 1) {
	            this.calculadoraBatidora.dividir(2);
	            this.setVelocidadBatidora(this.calculadoraBatidora.getResultado());
	            this.estadoTurbo = 0;
	        }
	    }
        // Getter y Setter de velocidad batidora
		public double getVelocidadBatidora() {
			return velocidadBatidora;
		}
		public void setVelocidadBatidora(double d) {
			this.velocidadBatidora = d;
		}
}
