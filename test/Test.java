import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		StampDutyCalculator calculator = new StampDutyCalculator();
		
		assertEquals(1200, calculator.calculateTax(185000));
		assertEquals(3750, calculator.calculateTax(275000));
		assertEquals(15500, calculator.calculateTax(510000));
		assertEquals(37500, calculator.calculateTax(937500));
		assertEquals(165750, calculator.calculateTax(2100000));
	}

}
