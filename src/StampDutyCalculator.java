
public class StampDutyCalculator {
	public long calculateTax(final long propertyValue) {
		
		if (propertyValue <= 0)
			return 0;
		
		final long tierLimit[] = {125000, 250000, 925000, 1500000, Long.MAX_VALUE};
		final double percentage[] = {0, 0.02, 0.05, 0.1, 0.12};
		
		long tax = 0;
		long calculated = 0;
		for (int i = 0; i < tierLimit.length; i++) {
			final long limit = tierLimit[i] - calculated;
			
			if (propertyValue >= tierLimit[i]) {
				tax += limit * percentage[i];
				calculated += limit;
			} else {
				tax += (propertyValue - calculated) * percentage[i];
				break;
			}
		}
		
		return tax;
	}
}
