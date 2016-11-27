package mockito.calculate;

public class Calcul {
	
	private double x;
	private double y;
	private double result;
	
	public Calcul(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void sum(){		
		setResult(x + y);		
	}
	
	public void substract(){		
		setResult(y-x);		
	}

	public void divide() throws DivisionByZeroException{
		if (y == 0){
			throw new DivisionByZeroException("division by zero.");
		}
		setResult(x / y);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
}
