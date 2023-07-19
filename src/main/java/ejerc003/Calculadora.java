package ejerc003;

public class Calculadora {
	
	    // Propiedad que acumula el resultado
	    private double resultado;
	    // Propiedad que indica 1 si la calculadora está operando y 0 iniciada
	    private int estadoCalculadora;

	    // Operación sumar al resultado
	    public void sumar(double sumando) {
	        this.setResultado(this.getResultado() + sumando);
	        this.setEstadoCalculadora(1);
	    }
        // Operación restar al resultado
	    public void restar(double substraendo) {
	        this.setResultado(this.getResultado() - substraendo);
	        this.setEstadoCalculadora(1);
	    }
	    // Operación multiplicar al resultado
	    public void multiplicar(double factor) {
	        this.setResultado(this.getResultado() * factor);
	        this.setEstadoCalculadora(1);
	    }
	    // Operación dividir al resultado
	    public void dividir(double divisor) {
	        this.setResultado(this.getResultado() / divisor);
	        this.setEstadoCalculadora(1);
	    }
	    // Operación para reiniciar el estado y poner a 0 resultado
	    public void reiniciarCalculadora() {
	        this.setEstadoCalculadora(0);
	        this.setResultado(0);
	    }
	    // Operación para insertar valores al resultado
	    public void insertarCalculadora(int valor) {
	        this.setEstadoCalculadora(1);
	        this.setResultado(valor);
	    }
        // Get del estado de la calculadora
		public int getEstadoCalculadora() {
			return estadoCalculadora;
		}
        // Set del estado de la calculadora
		public void setEstadoCalculadora(int estadoCalculadora) {
			this.estadoCalculadora = estadoCalculadora;
		}
		
        // Get de la propiedad resultado
		public double getResultado() {
			return resultado;
		}
        // Set de la propiedad resultado
		public void setResultado(double resultado) {
			this.resultado = resultado;
		}

}
