package mockito.calculate;

import junit.framework.Assert;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void itShouldSumXandY(){
		double x = 12D;
		double y = 3D;
		Calcul calc = new Calcul(x, y);
		calc.sum();
		double result = calc.getResult();
		Assert.assertEquals(15D, result);
	}
	
	@Test
	public void itShouldSubstractXFromY(){
		double x = 3D;
		double y = 12D;
		Calcul calc = new Calcul(x,y);
		calc.substract();
		double result = calc.getResult();
		Assert.assertEquals(9D, result);
	}
	
	@Test
	public void itShouldDivideXFromY() throws DivisionByZeroException{
		double x = 12D;
		double y = 3D;
		Calcul calc = new Calcul(x,y);
		calc.divide();
		double result = calc.getResult();
		Assert.assertEquals(4D, result);
	}
	
	@Test(expected=DivisionByZeroException.class)
	public void itShouldNotAuthorizedDivisionByZero() throws DivisionByZeroException{
		double x = 3D;
		double y = 0D;
		Calcul calc = new Calcul(x,y);
		calc.divide();	
	}
	
	
}
