package strategy;

public class Context {

	private Strategy strategy;
	//No implementa necesariamente. El m�todo doOperation se llama igual pero no necesariamente
	//es el mismo m�todo de Strategy. Sino que justo se llaman igual. Podr�a implementar y sobreescribir
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
		
	}
	
	public double doOperation(double num1, double num2) {
		return this.strategy.doOperation(num1, num2);
	}
}
